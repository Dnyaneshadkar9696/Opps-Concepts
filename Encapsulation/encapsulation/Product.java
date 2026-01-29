package encapsulation;

public class Product {
	
	private int productId;
    private int productQuantity;
    
    public int  getProductId() {
        return productId;
    }
    public void setProductID(int productId) {
    	this.productId = productId;
    }
    public int  getproductQuantity() {
    	return productQuantity;
    }
    public void setproductQuantity(int productQuantity) {
    	
    	this.productQuantity = productQuantity;
    	
    }
}
