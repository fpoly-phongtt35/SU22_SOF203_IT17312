/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_layout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author phongtt
 */
public class DemoFlowLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 200);
        frame.setVisible(true);
        
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.RIGHT);
        frame.setLayout(layout);
        
        JButton btnExit = new JButton();
        btnExit.setText("Ấn vào đây để thoát");
        btnExit.setSize(200, 50);
        
        btnExit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        JLabel label = new JLabel();
        label.setText("PhongTT35");
        
        frame.add(btnExit);
        frame.add(label);
    }
}
