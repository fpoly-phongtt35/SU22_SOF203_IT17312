/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.repository;

import b10_structure.model.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author phongtt
 */
public class ProductRepository {
    
    public List<Product> getAll() throws SQLException {
        List<Product> products = new ArrayList();
        
        Connection connection = DBContext.getConnection();
        String sql = "SELECT ProductId, ProductName, Price, Quantity FROM Product";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()) { // Duyệt từng bản ghi
            // Lấy thông tin
            Integer id = rs.getInt("ProductId");
            String name = rs.getString("ProductName");
            BigDecimal price = rs.getBigDecimal("Price");
            Integer quantity = rs.getInt("Quantity");
            
            // Khởi tạo đối tượng
            Product product = new Product();
            product.setId(id); product.setName(name);
            product.setPrice(price); product.setQuantity(quantity);
            
            // Thêm đối tượng vào danh sách
            products.add(product);
        }
        
        return products;
    }
}
