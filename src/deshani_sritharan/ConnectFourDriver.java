package deshani_sritharan;

import java.awt.*;
import javax.swing.*;

public class ConnectFourDriver {
	public static void main(String args[]){
     
		System.out.println("Welcome to Connect 4!");
		System.out.println("Player one's piece is 'X'.");
		System.out.println("Player two's piece is 'O'.");
		JFrame frame = new JFrame("Connect 4");
		frame.setPreferredSize(new Dimension(600, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Connect4Panel());

		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
 }
}
