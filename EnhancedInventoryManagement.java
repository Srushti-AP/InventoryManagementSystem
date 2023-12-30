package InventoryManagement;

import java.util.*;
import java.util.Iterator;
//import java.util.Scanner;

public class EnhancedInventoryManagement 
{

	private LinkedList<Product> productList;
	public EnhancedInventoryManagement()
{
	this.productList=new LinkedList<>();
}
	public void addProduct(Product product) 
	{
		productList.add(product);
		System.out.println("product added successfully");
	}
	
	public void deleteProduct(int productId) {
		Iterator<Product> iterator=productList.iterator();
		  while(iterator.hasNext()) 
		  {
			  Product product=iterator.next();
			  if(product.getProductId()==productId) 
			  {
				  iterator.remove();
				  System.out.println("Product deleted successfully!!");
				  return;
			  }
		  }
		  System.out.println("Product not Found!");
	}
	
	public void sortProductsByStock() {
        // Use Collections.sort() to sort products based on stock level
        Collections.sort(productList);
    }
	
	public int countProducts() {
        return productList.size();
    }

    public void reverseList() {
        LinkedList<Product> reversedList = new LinkedList<>();
        for (Product product : productList) {
            reversedList.addFirst(product);
        }
        productList = reversedList;
    }
	
	public void updateStock(int productId, int quantity) {
		for(Product product : productList) {
			if(product.getProductId()==productId) {
				product.setStockLevel(product.getStockLevel()+ quantity);
				System.out.println("Stock updated Successfully!!");
				return;
			}
		}
		System.out.println("Product not found");
	}
	 
	public void generateReport() {
		System.out.println("Inventory Report:");
		if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("List of Products:");
            for (Product product : productList) {
                System.out.println(product);
            }
		}
	}
	public void viewProductById(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Product Name: " + product.getProductName());
                System.out.println("Stock Level: " + product.getStockLevel());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void viewProductByName(String productName) {
        for (Product product : productList) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Product Name: " + product.getProductName());
                System.out.println("Stock Level: " + product.getStockLevel());
                return;
            }
        }
        System.out.println("Product not found.");
    }
}

	

               