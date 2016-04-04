package deshani_sritharan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;

import javax.swing.*;

import java.util.ArrayList;

public class Connect4Panel extends JPanel{
	final int ROWS = 7;
	final int COLS = 7;

	JButton[] buttons = new JButton[COLS];
	JLabel[][] labels = new JLabel[ROWS][COLS];
	final int FONT_SIZE = 26;
	CellState currentPlayer=CellState.PLAYER1;
	Board board;
	
	public  Connect4Panel() {
		/**
		 * Basic setting
		 */
		super();
		setBackground(Color.cyan);
		setLayout(new GridLayout(ROWS+1, COLS, 10, 10));
		
		setFont(new Font("Arial", Font.BOLD, FONT_SIZE));
		board=new Board(ROWS,COLS);
		
		/**
		 * initializes all buttons
		 */
		for (int j=0; j< COLS; j++){
			
			buttons[j] = new JButton("Col'm" + (j+1));
			buttons[j].addActionListener(new ButtonListener());
			
		}
		
		/**
		 * initializes all labels
		 */
		for (int i=0; i< ROWS; i++){
			for (int j=0; j< COLS; j++){
			labels[i][j]= new JLabel("    __"); 
		}
		}
		
		
		
		/**
		 * Add the components to the panel
		 */
		for (JButton button: buttons ){
			add(button);
		}
		
			for (int i=0; i< ROWS; i++){
				for (int j=0; j< COLS; j++){
					add(labels[i][j]);
				}
		}
		
	
		
	}
	
	private void updateLabel(CellState currentPlayer, int i, int j){
		if (currentPlayer==CellState.PLAYER1){
		labels[i][j].setText("    X");
		labels[i][j].setOpaque(true);
		labels[i][j].setBackground(Color.black);
		labels[i][j].setForeground(Color.white);
		}else{
			labels[i][j].setText("    O");
			labels[i][j].setOpaque(true);
			labels[i][j].setBackground(Color.white);
			labels[i][j].setForeground(Color.black);
		}
	}
	
	private void changePlayer(){
		if (currentPlayer==CellState.PLAYER1){
			currentPlayer=CellState.PLAYER2;
		}else{
			currentPlayer=CellState.PLAYER1;
		}
	}
	 
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == buttons[0] ) {
				JOptionPane.showConfirmDialog(null,
						"Place piece here? ");
				int result = JOptionPane.showConfirmDialog(null,
						"Confirm position? (Yes/No)");
				if (!board.isColumnFull(0)){
					int currentRow= board.getRowLocation(0);
					board.update(currentPlayer,currentRow , 0);
					updateLabel(currentPlayer,currentRow,0);
					board.checkWinner(currentPlayer, currentRow, 0);
					changePlayer();
					
				}
				board.display();
				
				
			}else if (event.getSource() == buttons[1]) {
				JOptionPane.showConfirmDialog(null,
						"Place piece here? ");
				int result = JOptionPane.showConfirmDialog(null,
						"Confirm position? (Yes/No)");
				if (!board.isColumnFull(1)){
					int currentRow= board.getRowLocation(1);
					board.update(currentPlayer,currentRow , 1);
					updateLabel(currentPlayer,currentRow,1);
					changePlayer();
				}
				board.display();
				
			}else if (event.getSource() == buttons[2]) {
				JOptionPane.showConfirmDialog(null,
						"Place piece here? ");
				int result = JOptionPane.showConfirmDialog(null,
						"Confirm position? (Yes/No)");
				if (!board.isColumnFull(2)){
					int currentRow= board.getRowLocation(2);
					board.update(currentPlayer,currentRow , 2);
					updateLabel(currentPlayer,currentRow,2);
					changePlayer();
				}
				board.display();
			}else if (event.getSource() == buttons[3]) {
				JOptionPane.showConfirmDialog(null,
						"Place piece here? ");
				int result = JOptionPane.showConfirmDialog(null,
						"Confirm position? (Yes/No)");
				
				if (!board.isColumnFull(3)){
					int currentRow= board.getRowLocation(3);
					board.update(currentPlayer,currentRow , 3);
					updateLabel(currentPlayer,currentRow,3);
					changePlayer();
				}
				board.display();
			}else if (event.getSource() == buttons[4]) {
				JOptionPane.showConfirmDialog(null,
						"Place piece here? ");
				int result = JOptionPane.showConfirmDialog(null,
						"Confirm position? (Yes/No)");
				if (!board.isColumnFull(4)){
					int currentRow= board.getRowLocation(4);
					board.update(currentPlayer,currentRow , 4);
					updateLabel(currentPlayer,currentRow,4);
					changePlayer();
				}
				board.display();
			}else if (event.getSource() == buttons[5]) {
				JOptionPane.showConfirmDialog(null,
						"Place piece here? ");
				int result = JOptionPane.showConfirmDialog(null,
						"Confirm position? (Yes/No)");
				if (!board.isColumnFull(5)){
					int currentRow= board.getRowLocation(5);
					board.update(currentPlayer,currentRow , 5);
					updateLabel(currentPlayer,currentRow,5);
					changePlayer();
				}
				board.display();
			}else if (event.getSource() == buttons[6]) {
				JOptionPane.showConfirmDialog(null,
						"Place piece here? ");
				int result = JOptionPane.showConfirmDialog(null,
						"Confirm position? (Yes/No)");
				if (!board.isColumnFull(6)){
					int currentRow= board.getRowLocation(6);
					board.update(currentPlayer,currentRow , 6);
					updateLabel(currentPlayer,currentRow,6);
					changePlayer();
				}
				board.display();
			}else if (event.getSource() == buttons[7]) {
				JOptionPane.showConfirmDialog(null,
						"Place piece here? ");
				int result = JOptionPane.showConfirmDialog(null,
						"Confirm position? (Yes/No)");
				if (!board.isColumnFull(7)){
					int currentRow= board.getRowLocation(7);
					board.update(currentPlayer,currentRow , 7);
					updateLabel(currentPlayer,currentRow,7);
					changePlayer();
				}
				board.display();
			
		}
}
}
}
