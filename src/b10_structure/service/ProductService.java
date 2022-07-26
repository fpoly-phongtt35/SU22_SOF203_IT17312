/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.service;

import b10_structure.model.Product;
import b10_structure.repository.ProductRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author phongtt
 */
public class ProductService {
    
    private final ProductRepository productRepo;
    
    public ProductService() {
        productRepo = new ProductRepository();
    }
    
    public List<Product> getAllProduct() {
        try {
            // Gọi Repo lấy toàn bộ dữ liệu
            return productRepo.getAll();
        } catch (SQLException ex) {
            ex.printStackTrace(); // In ra lỗi còn biết mà sửa
            // Nếu lỗi thì trả về NULL
            return null;
        }
    }
}
