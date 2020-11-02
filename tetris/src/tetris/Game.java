package tetris;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;




public class Game implements Runnable {
	
	public static final int WIDTH = 300, HEIGHT = 623, WIDTH2 = 200, HEIGHT2 = 200;
	private static JFrame window;
	private Board board;
	
	
	
	
	
	
public Game() {
	
	
	
	//Fa partire il gioco
	Window();

}




public void Window() {
	
	window = new JFrame("Tetris Game");
	window.setSize(WIDTH, HEIGHT);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setLocationRelativeTo(null);

	board= new Board();

	window.add(board);
	window.addKeyListener(board);

	window.setVisible(true);
}







	



		
		
		

		
		public static void main(String[] args) {
			
			JFrame frame = new JFrame("Tetris Java TCF");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLayout(new BorderLayout());
			frame.add(new GamePanel(), BorderLayout.CENTER);
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			
		   //new Game();
			  
			
			}














		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
}


		
		
		 






