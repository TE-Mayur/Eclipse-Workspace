package com.patternprogramming.diamond;
import java.awt.*;
import javax.swing.*;
public class pattern2 {

	public static void main(String[] args) {
		
		  
		final class patte extends JApplet {
		  
		    public void init()
		    {
		        // set size
		        setSize(400, 400);
		  
		        repaint();
		    }
		  
		    // paint the applet
		    public void paint(Graphics g)
		    {
		        // set Color for rectangle
		        g.setColor(Color.red);
		  
		        // draw a ellipse
		        g.drawOval(10, 10, 15, 10);
		    }
		}
		

	}

}
