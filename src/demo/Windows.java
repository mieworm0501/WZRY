package demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

public class Windows implements Runnable{
	public void run()
	{
		JFrame window = new JFrame("WZRY");
	    window.setBounds(400,0,1000,600);
	    window.setVisible(true);
	    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    
	    JMenuBar windowBar = new JMenuBar();
	    windowBar.setOpaque(true);
	    windowBar.setBackground(new Color(100,200,200));
	    windowBar.setPreferredSize(new Dimension(1000,20));
	    
	    JLabel windowLabel = new JLabel();
	    windowLabel.setOpaque(true);
	    windowLabel.setBackground(new Color(200,200,100));
	    windowLabel.setPreferredSize(new Dimension(1000,580));
	    
	    window.setJMenuBar(windowBar);
	    window.getContentPane().add(windowLabel,BorderLayout.CENTER);
	    
	    window.pack();
	    
	    window.setVisible(true);
	}
}
