package com.perscholas.my_case_study.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.perscholas.my_case_study.models.Product;

public class ProductDAO {

//*************Create Product***********************************
	public int createProduct(Product p) throws SQLException {
		
		Connection conn = null;
	    PreparedStatement stmt = null;
	    ResultSet result = null;
	    
	    String SAVE = "INSERT INTO PRODUCTS "
	            + "(name, price, quantity_available) "
	            + "VALUES(?, ?, ?)";
	    
	    int ID = -1;
	    String[] COL = {"product_id"};
	    
	    MySqlConnection mysql = new MySqlConnection();
	    try
	    {
	        conn = mysql.getConnection();
	        stmt = conn.prepareStatement(SAVE, COL);
	        stmt.setString(1, p.getName());
	        stmt.setDouble(2, p.getPrice());
	        stmt.setInt(3, p.getQuantity_available());
	        
	        stmt.executeUpdate();
	        result = stmt.getGeneratedKeys();
	        if(result != null && result.next()) {
	            ID = result.getInt(1);
	        }
	        System.out.println(ID);
	    }
	    catch (ClassNotFoundException | IOException | SQLException e)
	    {
	        e.printStackTrace();
	    }
	    finally {
	    	if (result != null) {
	    		result.close();
	    	}
	    	if (stmt != null) {
	    		stmt.close();
	    	}
	    	if (conn != null) {
	    		conn.close();
	    	}
	    }        
	    
	    return ID; 
	}
	
//*************Get Product By ID**********************************

	public Product getProductById(int id) {
		
		return null;
	}
	
//*************Purchase Product***********************************
//	public int purchaseProduct(int quantity, int prod_id) {
//	    Connection conn = null;
//	    PreparedStatement stmt = null;
//	    ResultSet result = null;
//	    
//	    String SAVE = "update products set quantity_available to ? where product_id = ?";
//	    int ID = -1;
//	    
//	    MySqlConnection mysql = new MySqlConnection();
//	    
//	    try
//	    {
//	        conn = mysql.getConnection();
//	        stmt = conn.prepareStatement(SAVE);
//	        stmt.setInt(1, quantity);
//	        stmt.setInt(2, prod_id);
//	        
//	        result = stmt.executeQuery();
//            if(result != null && result.next()) {
//                ID = result.getInt(1);
//            }
//            System.out.println(ID);
//	    }
//	    catch (ClassNotFoundException | IOException | SQLException e)
//	    {
//	        e.printStackTrace();
//	    }
//	    return ID;
//	}

//*************Get All Products***********************************
	public List<Product> getAllProducts() throws SQLException {
	    Connection conn = null;
	    PreparedStatement stmt = null;
	    ResultSet result = null;
	    Product thisProduct = null;
	    List<Product> allProducts = null;
	    
	    String SAVE = "SELECT * FROM PRODUCTS";
	    MySqlConnection mysql = new MySqlConnection();
		
	    allProducts = new ArrayList<Product>();
	    
	    try
	    {
	        conn = mysql.getConnection();
	        stmt = conn.prepareStatement(SAVE);
	        
	        result = stmt.executeQuery();
	        
	        while (result.next()) {
	        	thisProduct = new Product();
	        	thisProduct.setProduct_id(result.getInt(1));
	        	thisProduct.setName(result.getString(2));
	        	thisProduct.setPrice(result.getDouble(3));
	        	thisProduct.setQuantity_available(result.getShort(4));
	        	allProducts.add(thisProduct);
	        }
	    }
	    catch (ClassNotFoundException | IOException | SQLException e)
	    {
	        e.printStackTrace();
	    }
        finally {
        	if (result != null) {
        		result.close();
        	}
        	if (stmt != null) {
        		stmt.close();
        	}
        	if (conn != null) {
        		conn.close();
        	}
        }
	    
		return allProducts;
	}
	
	  public static void main(String[] args) throws SQLException {
//		  Product p = new Product();
//		  p.setName("bPhone");
//		  p.setPrice(385.0);
//		  p.setQuantity_available(250);
//		  ProductDAO dao = new ProductDAO();
//		  dao.createProduct(p);

		  List<Product> allProducts = null;
		  ProductDAO dao = new ProductDAO();
		  allProducts = dao.getAllProducts();
		  
		  for (Product product: allProducts) {
			  System.out.println(product.toString() + "\n");
		  }
	}
	       
}
