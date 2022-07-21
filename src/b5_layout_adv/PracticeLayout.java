/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5_layout_adv;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author phongtt
 */
public class PracticeLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Đơn đăng ký người yêu");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        
        JComboBox ccbBox = new JComboBox();
        ccbBox.addItem("Yêu nước");
        ccbBox.addItem("Cũng là yêu nước");
        
        JCheckBox cbTank = new JCheckBox();
        cbTank.setText("Xe tăng");
        JCheckBox cbPlane = new JCheckBox();
        cbPlane.setText("Máy bay");
        
        JRadioButton rbMale = new JRadioButton();
        rbMale.setText("Nam");
        JRadioButton rbFemale = new JRadioButton();
        rbFemale.setText("Nữ");
        
        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(rbMale);
        groupGender.add(rbFemale);
        
        frame.add(ccbBox);
        frame.add(cbTank); frame.add(cbPlane);
        frame.add(rbMale); frame.add(rbFemale);
        frame.pack();
    }
}
