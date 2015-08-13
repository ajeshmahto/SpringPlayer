addToCart= function(productId){
	
	$.ajax({
		
    	url:"/SpringPlayers/rest/addToCart/"+productId,
		//url:"/SpringPlayers/"
		type:"PUT",
		dataType:"json",
			
			success:function(response)
			{
				alert("Successfully Added");
			},
			
	       error:function()
	       {
	    	   alert("Error while adding to cart");
	       }
		
	}
			
	);
	
}

removeFromCart = function(cartItemId)
{
$.ajax({
		
		url:"/SpringPlayers/rest/removeFromCart/"+cartItemId,
		type:"PUT",
		dataType:"json",
			
			success:function(response)
			{
				location.reload(true);
			},
			
	       error:function()
	       {
	    	   alert("Error while adding to cart");
	       }
		
	}
			
	);
}