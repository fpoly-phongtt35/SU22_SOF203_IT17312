/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author phongtt
 */
public class DemoBorderLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo BorderLayout");
        frame.setVisible(true);
        
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);
        
        JLabel lbTop = new JLabel("Top");
        JLabel lbBottom = new JLabel("Bottom");
        JLabel lbLeft = new JLabel("Left");
        JLabel lbRight = new JLabel("Right");
        JLabel lbMiddle = new JLabel("Middle");
        
        borderLayout.addLayoutComponent(lbTop, BorderLayout.NORTH);
        borderLayout.addLayoutComponent(lbBottom, BorderLayout.SOUTH);
        borderLayout.addLayoutComponent(lbRight, BorderLayout.EAST);
        borderLayout.addLayoutComponent(lbLeft, BorderLayout.WEST);
        borderLayout.addLayoutComponent(lbMiddle, BorderLayout.CENTER);
        
        frame.add(lbTop);
        frame.add(lbBottom);
        frame.add(lbRight);
        frame.add(lbLeft);
        frame.add(lbMiddle);
        
        frame.pack();
    }
}
