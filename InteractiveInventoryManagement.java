package InventoryManagement;
import java.util.LinkedList;
import java.util.Scanner;

public class InteractiveInventoryManagement 
{
		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			
			EnhancedInventoryManagement inventorySystem = new EnhancedInventoryManagement();
			boolean exit = false;

	        while (!exit) 
	        {
	            System.out.print("Enter user role (admin/viewer): ");
	            String userRole = scanner.next();

	            switch (userRole.toLowerCase()) 
	            {
	                case "admin":
	                    adminMenu(inventorySystem, scanner);
	                    break;

	                case "viewer":
	                    viewerMenu(inventorySystem,scanner);
	                    break;

	                default:
	                    System.out.println("Invalid user role.");
	                    exit = true; // Exit the loop on an invalid role
	            }
	        }
		}

	    private static void adminMenu(EnhancedInventoryManagement inventorySystem, Scanner scanner) 
	    {
	        boolean exitAdminMenu = false;

	        while (!exitAdminMenu) 
	        {
	            System.out.print("Enter operation (add/delete/view/sort/update/count/reverse/exit): ");
	            String operation = scanner.next();

	            switch (operation.toLowerCase()) 
	            {
	                case "add":
	                    System.out.print("Enter product ID: ");
	                    int productId = scanner.nextInt();
	                    System.out.print("Enter product name: ");
	                    String productName = scanner.next();
	                    System.out.print("Enter stock level: ");
	                    int stockLevel = scanner.nextInt();

	                    Product product = new Product(productId, productName, stockLevel);
	                    inventorySystem.addProduct(product);
	                    break;
	                    
	                case "delete":
	                    System.out.print("Enter product ID to delete: ");
	                    int deleteProductId = scanner.nextInt();
	                    inventorySystem.deleteProduct(deleteProductId);
	                    break;

	                case "view":
	                    inventorySystem.generateReport();
	                    break;
	                    
	                case "sort":
	                    inventorySystem.sortProductsByStock();
	                    System.out.println("Products sorted by stock level.");
	                    break;

	                case "update":
	                    System.out.print("Enter product ID to update stock level: ");
	                    int updateProductId = scanner.nextInt();
	                    System.out.print("Enter new stock level: ");
	                    int newStockLevel = scanner.nextInt();
	                    inventorySystem.updateStock(updateProductId, newStockLevel);
	                    break;

	                case "count":
	                    System.out.println("Total number of products: " + inventorySystem.countProducts());
	                    break;

	                case "reverse":
	                    inventorySystem.reverseList();
	                    System.out.println("Products reversed.");
	                    break;

	                case "exit":
	                    exitAdminMenu = true;
	                    break;

	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        }
	    }
	    private static void viewerMenu(EnhancedInventoryManagement inventorySystem,Scanner scanner) 
	    {
	        boolean exitViewerMenu = false;

	        while (!exitViewerMenu) 
	        {
	            System.out.print("Enter operation (view/search/exit): ");
	            String operation = scanner.next();

	            switch (operation.toLowerCase()) 
	            {
	                case "view":
	                    inventorySystem.generateReport();
	                    break;
	                    
	                 case "search":
	                    System.out.print("Enter search criteria (ID/Name): ");
	                    String searchCriteria = scanner.next();

	                    switch (searchCriteria.toLowerCase()) 
	                    {
	                        case "id":
	                            System.out.print("Enter product ID to view: ");
	                            int searchProductId = scanner.nextInt();
	                            inventorySystem.viewProductById(searchProductId);
	                            break;

	                        case "name":
	                            System.out.print("Enter product name to view: ");
	                            String searchProductName = scanner.next();
	                            inventorySystem.viewProductByName(searchProductName);
	                            break;


	                case "exit":
	                    exitViewerMenu = true;
	                    break;

	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	                    }
	            }
	        }
	    }
	}
		
	            
	        
	    

	
		
		
		
	

