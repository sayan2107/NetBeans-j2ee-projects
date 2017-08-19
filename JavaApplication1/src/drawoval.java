/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;


public class drawoval extends JPanel{

    private int d= 10;
    
    
    @Override
    public void paintComponent(Graphics g){
    
        super.paintComponent(g);
        g.fillOval(10, 10, d, d);
        
    }
    
    public void setD(int newD){
    
        d = (newD >= 0 ? newD : 10);
        repaint();
        
    }
    
    public Dimension getPreferredSize(){
     return new Dimension(200,200);
    }
    
    public Dimension getMinimumSize(){
    
        return getPreferredSize();
    }
}
