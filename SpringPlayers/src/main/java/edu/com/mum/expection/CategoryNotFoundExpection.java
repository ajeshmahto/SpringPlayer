package edu.com.mum.expection;

public class CategoryNotFoundExpection  extends RuntimeException{
 	/**
	 * 
	 */
	private static final long serialVersionUID = 9060751397339719682L;
	private Long CategoryId;
	private String message = "There is no Category";
	
 	public CategoryNotFoundExpection() {}
	
	public CategoryNotFoundExpection(Long CategoryId, String message) {
		this.CategoryId = CategoryId;

		if (message != null) this.message = message;
		
	}
	
	public String getFullMessage() {
		//return (message + CategoryId);
		return message;
	}
	
	public Long getProductId() {
		return CategoryId;
	}
	
@Override
public String getLocalizedMessage() {
	// TODO Auto-generated method stub
	return super.getLocalizedMessage();
}
}
