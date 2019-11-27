package draw;
import java.awt.Color;

import grid.Grid;

public class DrawFlag {
	
	public static void drawFlag(Grid grid, int countryCode) {

		switch(countryCode) {
			case 1:
				france(grid); 
				break;
			case 2:
				argentina(grid); 
				break;
				
			case 3:
				austria(grid); 
				break;
			case 4:
				ukraine(grid); 
				break;
			case 5:
				russia(grid); 
				break;
			case 6:
				Uyghuria(grid); 
				break;
			case 7:
				mycountry(grid); 
				break;
			default: 
				ErrorFlag(grid); 
				break;
		}
	} 

	
	public static void ErrorFlag(Grid grid) {
		
		
		
	}
	
	private static void france(Grid grid) {
		//TO DO
		//Draw France flag
		//Hint: grid.setColor(row, col, Color.RED); will change the color of 
		// one cell at (row,col) to red
		
		//Frace flag is three vertical stripes of blue, white and red

		for (int i = 0; i < grid.getHt(); i++) {
		for (int j = 0; j < grid.getWd(); j++) {
			if(i%2==0) {
			grid.setColor(i, j, Color.red);
		}	}
		}		
	
		for (int i = 0; i < grid.getHt(); i++) {
			for (int j = 0; j < grid.getWd(); j++) {
				if(i%2==1) {
				grid.setColor(i, j, Color.WHITE);
				}}}
	
		for (int i = 0; i < grid.getHt()/2; i++) {
			for (int j = 0; j < grid.getWd()/2; j++) {
				
				grid.setColor(i, j, Color.BLUE);
				}}
	
		
	}	
	
	private static void argentina(Grid grid) {
		
		
		
	}
	
	private static void austria(Grid grid) {
		
		
		
	}
	
	private static void ukraine(Grid grid) {
		
		
		
	}
	private static void russia(Grid grid) {
		
		
	}
	private static void Uyghuria(Grid grid) {
		
		
	}

 
	private static void mycountry(Grid grid) {
		
	}
}

