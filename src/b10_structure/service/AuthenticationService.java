/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.service;

import b10_structure.model.Account;
import b10_structure.repository.AccountRepository;

/**
 *
 * @author phongtt
 */
public class AuthenticationService {
    
    private final AccountRepository accountRepo;
    
    public AuthenticationService() {
        accountRepo = new AccountRepository();
    }
    
    public boolean authenticate(String username, String password) {
        // 1. Kiểm tra tài khoản tồn tại
        Account account = accountRepo.getByUsername(username);
        if (account == null) { // NULL là không tồn tại
            return false;
        }
        
        // 2. Kiểm tra mật khẩu trùng khớp
        if (!account.getPassword().equals(password)) {
            return false; // Mật khẩu không khớp
        }
        
        return true; // OK
    }
}
