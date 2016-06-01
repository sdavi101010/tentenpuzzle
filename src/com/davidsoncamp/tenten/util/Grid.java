package com.davidsoncamp.tenten.util;

import java.util.ArrayList;
import java.util.List;


public class Grid {
	
	private final int dimension;
	private List<Cell> cells;
	
	public static Grid newGrid(int dimension){
		return new Grid(dimension);
	}
	
	public void render(){
		
	}
 
	
	
	
	
	private Grid(int dimension){
		this.dimension = dimension;
		
		// Create the initial grid w/ unassigned cells
		this.cells = new ArrayList<Cell>(dimension*dimension);
		for ( int row = 0; row < this.dimension; row++){
			
			for ( int column = 0; column < this.dimension; column++){

				this.cells.add( Cell.newCell(row * this.dimension + column));
			}
		}
	}

}
