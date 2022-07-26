/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.repository;

import b10_structure.model.Account;

/**
 *
 * @author phongtt
 */
public class AccountRepository {
    
    private Account[] accounts = new Account[] {
        new Account("phongtt35", "12345"),
        new Account("admin", "admin")
    };
    
    public Account getByUsername(String username) {
        // Duyệt danh sách tài khoản
        for(Account account : accounts) {
            // So sánh tên tài khoản giống nhau
            if (account.getUsername().equals(username)) {
                return account;
            }
        }
        
        // Không tìm thấy
        return null;
    }
}
