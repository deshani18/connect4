package deshani_sritharan;

public class Cell {
	private CellState state;

	Cell(){
		state = CellState.EMPTY;
	}
	
	public CellState getState(){
		return state;
	}
	
	public void setState(CellState state){
		this.state = state;
	}
	
	
}
