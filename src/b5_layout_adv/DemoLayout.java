/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5_layout_adv;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author phongtt
 */
public class DemoLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo Layout");
        // cho hiển thị
        frame.setVisible(true);
        // cài đặt đóng chương trình
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // căn giữa màn hình
        frame.setLocationRelativeTo(null);
        
        GridLayout gridLayout = new GridLayout(4, 1);
        frame.setLayout(gridLayout);
        
        FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);
        FlowLayout rightLayout = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout leftLayout = new FlowLayout(FlowLayout.LEFT);
        
        JPanel pnFirst = new JPanel(centerLayout);
        JPanel pnSecond = new JPanel(leftLayout);
        JPanel pnThird = new JPanel(leftLayout);
        JPanel pnFourth = new JPanel(rightLayout);
        
        JButton btnXoa = new JButton("Xoá");
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Bạn chọn Xoá");
            }
        });
        
        pnFirst.add(new JLabel("PhongTT35"));
        pnSecond.add(new JButton("Thêm"));
        pnSecond.add(new JButton("Xem"));
        pnThird.add(new JButton("Sửa"));
        pnThird.add(btnXoa);
        pnFourth.add(new JButton("Thoát"));
        
        frame.add(pnFirst);
        frame.add(pnSecond);
        frame.add(pnThird);
        frame.add(pnFourth);
        
        frame.pack();
    }
}
