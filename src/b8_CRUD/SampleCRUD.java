/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8_CRUD;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phongtt
 */
public class SampleCRUD {
    
    public static void main(String[] args) throws SQLException {
        Product p = new Product();
        p.setId(5013);
        p.setName("Update IT17312");
        // ...
        updateById(p);
        
        //add();
        
        List<Product> products = read();
        for(Product product : products) {
            System.out.println(product);
        }
    }
    
    private static void updateById(Product product) throws SQLException {
        Connection connection = DBContext.getConnection();
        String sql = "UPDATE Product SET ProductName = ? WHERE ProductId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, product.getName());
        statement.setInt(2, product.getId());
        
        int affectedRows = statement.executeUpdate();
        
        statement.close();
        connection.close();
    }
    
    private static void update(Integer id, String name) throws SQLException {
        Connection connection = DBContext.getConnection();
        String sql = "UPDATE Product "
                + "SET ProductName = '" + name + "' "
                + "WHERE ProductId = " + id;
        Statement statement = connection.createStatement();
        
        int affectedRows = statement.executeUpdate(sql);
        
        statement.close();
        connection.close();
    }
    
    private static void delete(Integer id) throws SQLException {
        Connection connection = DBContext.getConnection();
        String sql = "DELETE FROM Product WHERE ProductId = " + id;
        Statement statement = connection.createStatement();
        
        int affectedRows = statement.executeUpdate(sql);
        
        statement.close();
        connection.close();
    }
    
    private static void add() throws SQLException {
        Connection connection = DBContext.getConnection();
        String sql = "INSERT INTO Product "
                + "VALUES('New IT17312', 99999999, 40)";
        Statement statement = connection.createStatement();
        
        int affectedRows = statement.executeUpdate(sql);
        
        statement.close();
        connection.close();
    }
    
    private static List<Product> read() throws SQLException {
        List<Product> products = new ArrayList();
        
        Connection connection = DBContext.getConnection();
        String sql = "SELECT ProductId, ProductName, "
                + "Price, Quantity FROM Product";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()) {
            Integer id = rs.getInt("ProductId");
            String name = rs.getString("ProductName");
            BigDecimal price = rs.getBigDecimal("Price");
            Integer quantity = rs.getInt("Quantity");
            
            Product product = new Product();
            product.setId(id);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            
            products.add(product);
        }
        
        rs.close();
        statement.close();
        connection.close();
        
        return products;
    }
}
