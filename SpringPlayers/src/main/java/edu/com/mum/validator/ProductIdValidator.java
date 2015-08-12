package edu.com.mum.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;


import edu.com.mum.domain.Product;
import edu.com.mum.service.ProductService;



public class ProductIdValidator implements ConstraintValidator<ProductId, String>{
	
	@Autowired
	private ProductService productService;

	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Product product;
		try {
			product = productService.getProductByProductID(value);
			
		} catch (Exception e) {
			return true;
		}
		if(product!= null) {
			return false;
		}
		
		return true;
	}


	@Override
	public void initialize(ProductId arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
