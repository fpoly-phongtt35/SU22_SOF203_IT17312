/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author phongtt
 */
public class PracticeFlowLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Luyện tập FlowLayout");
        frame.setVisible(true);
        
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.RIGHT);
        frame.setLayout(layout);
        
        frame.add(new JLabel("PhongTT35"));
        frame.add(new JButton("Thêm"));
        frame.add(new JButton("Xem"));
        frame.add(new JButton("Sửa"));
        frame.add(new JButton("Xoá"));
        frame.add(new JButton("Thoát"));
        
        frame.pack();
    }
}
