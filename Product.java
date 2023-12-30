package InventoryManagement;
import java.util.*;

class Product implements Comparable<Product> {

	private int productId;
	private String productName;
	private int stockLevel;
	
	public Product(int productId, String productName, int stockLevel) {
		this.productId = productId;
		this.productName = productName;
		this.stockLevel = stockLevel;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}	
	
	@Override
    public int compareTo(Product other) {
        // Compare products based on stock level
        return Integer.compare(this.stockLevel, other.stockLevel);
    }

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", stockLevel=" + stockLevel + "]";
	}
	
}
