package edu.com.mum.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.com.mum.domain.Product;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	@Query("SELECT p FROM PRODUCT p ")
	public List<Product> getALlProducts();
	
	@Query("SELECT p FROM PRODUCT p where id =:productId")
	public Product getProductByID(@Param("productId") int id);
	//public List<Product> getProductsByCategory(String category);
	//public void save(Product product);

	@Query("SELECT p FROM PRODUCT p where productID =:productId")
	public Product getProductByProductID(@Param("productId") String id);
}
