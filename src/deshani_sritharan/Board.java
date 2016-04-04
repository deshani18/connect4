package deshani_sritharan;

public class Board {
	private Cell[][] board; 
	private int maxRow;
	private int maxCol;
	
	Board (int ROWS, int COLS){
		maxRow = ROWS;
		maxCol = COLS;
		board = new Cell[ROWS][COLS];
		for (int i=0; i<ROWS;i++){
			for(int j=0;j<COLS;j++){
			board[i][j]= new Cell();
		}
	 }
	}
	
	public int currentPlayer(int i){
		if(i%2==0){
			return 1;
		}else{
			return 2;
		}
	}
	
	public void display(){
		for (int i=0; i<maxRow;i++){
			for(int j=0;j<maxCol;j++){
				if (board[i][j].getState()==CellState.EMPTY){
					System.out.print(" - ");
				}
				else if (board[i][j].getState()==CellState.PLAYER1){
						System.out.print(" X ");
					}
				else 
					System.out.print(" O ");
				}
			System.out.println("");
			 }
	}	
	
	public boolean isColumnFull(int column){
		return board[0][column].getState()!=CellState.EMPTY;
	}
	
	public int getRowLocation(int column){
		boolean found = false;
		int rowPosition = maxRow-1;
		
		while (!found){
			if (board[rowPosition][column].getState()==CellState.EMPTY){
				found=true;
		  }else{
			  rowPosition--;
			}
		}return rowPosition;
			
		}
  public void update(CellState currentPlayer, int row, int col){
	  board[row][col].setState(currentPlayer);
  }
  
  public boolean checkWinner(CellState currentPlayer,int row, int col){
	  boolean winner = false;
	  int rowPosition = row;
		
		while (!winner){
			if (board[rowPosition][col].getState()==CellState.EMPTY){
				winner=true;
		  }else{
			  rowPosition--;
			}
		}return false;
			
		}
  
	
}
