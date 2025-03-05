package feb11;

public class Product implements Comparable<Product> {
	
	
	
	
	private Integer ProductNumber;
	private String productName;
	private double productPrice;
	
	
	public Product(Integer productNumber, String productName, double productPrice) {
		super();
		ProductNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	@Override
	public String toString() {
		return "Product [ProductNumber=" + ProductNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}


	public Integer getProductNumber() {
		return ProductNumber;
	}


	public String getProductName() {
		return productName;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductNumber(Integer productNumber) {
		ProductNumber = productNumber;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	@Override
	public int compareTo(Product o) {
		
		return this.ProductNumber.compareTo(o.ProductNumber);
	}


	
	
	

}
