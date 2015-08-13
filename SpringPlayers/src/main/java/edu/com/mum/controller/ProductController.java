package edu.com.mum.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

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
	
	
	@RequestMapping(value={"/", "/display"})
	public String displayProducts(Model model) {
 
 		model.addAttribute("products", productService.getAllProducts());
 		return "products";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String addNewProduct(@ModelAttribute("newProduct") Product newProduct) {
	   return "addProduct";
	}
	   
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String processAddNewProduct(@ModelAttribute("newProduct") @Valid Product productToBeAdded,
			BindingResult bindingResult, HttpServletRequest request) {
		if (bindingResult.hasErrors()) {
			
			return "addProduct";
		}
		

		String[] suppressedFields = bindingResult.getSuppressedFields();

		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields: " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		
		MultipartFile productImage = productToBeAdded.getProductImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
			
		//isEmpty means file exists BUT NO Content
			if (productImage!=null && !productImage.isEmpty()) {
		       try {
		      	productImage.transferTo(new File(rootDirectory+"/resources/images/"+productToBeAdded.getProductID() + ".png"));
		       } catch (Exception e) {
				throw new RuntimeException("Product Image saving failed", e);
		   }
		   }

		
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
