package edu.com.mum.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.com.mum.domain.Product;
import edu.com.mum.repository.ProductRepository;
import edu.com.mum.service.ProductService;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.getALlProduct();
	}

	

//	@Override
//	public List<Product> getProductsByCategory(String category) {
//		return productRepository.getProductsByCategory(category);
//	}

	@Override
	public void save(Product product) {
  productRepository.save(product);		
	}



@Override
public Product getProductByID(int id) {
	// TODO Auto-generated method stub
	return productRepository.getProductByID(id);
}
	
	

	
	

}
