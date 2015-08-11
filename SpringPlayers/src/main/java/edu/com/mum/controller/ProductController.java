package edu.com.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.com.mum.domain.Product;
import edu.com.mum.service.ProductService;
import edu.com.mum.serviceImpl.ProductServiceImpl;



@Controller
@RequestMapping({"/products"})
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value={"/", "/productList"})
	public String listProducts(Model model) {
 
 		model.addAttribute("products", productService.getAllProducts());
 		return "productList";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String addNewProduct(@ModelAttribute("newProduct") Product newProduct) {
	   return "addProduct";
	}
	   
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String processAddNewProduct(@ModelAttribute("newProduct") Product productToBeAdded) {
 
		productService.save(productToBeAdded);

	   	return "redirect:/products/productList";
	}
	
	@RequestMapping("/product_delete/{id}")
	public String deleteProduct(Model model, @PathVariable("id") int id) {
		productService.delete(id);
 		model.addAttribute("products", productService.getAllProducts());
 		return "redirect:/products/productList";
	}
	
	@RequestMapping(value = "/product_edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model, @PathVariable("id") int id) {
       // List<Category> categories = bookService.getAllCategories();
        //model.addAttribute("categories", categories);
        Product product = productService.getProductByID(id);
        model.addAttribute("product", product);
     
        return "editProduct";
    }
 
  
	
    
    @RequestMapping(value = "/product_update", method = RequestMethod.POST)
    public String updateProduct(@ModelAttribute Product product) {
//        Category category = bookService.getCategory(book.getCategory().getId());
//        book.setCategory(category);
    	productService.save(product);
    	return "redirect:/products/productList";
    }
    
    @ModelAttribute("products")
    List<Product> addProductList(Model model) {
        //model.addAttribute("bookSearch", new Book());
        //List<Category> categories = bookService.getAllCategories();
       // model.addAttribute("categories", categories);
      	
      return  productService.getAllProducts();
    
    }
}
