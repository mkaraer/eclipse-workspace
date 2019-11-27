package draw;

import java.awt.*;

import grid.Grid;

public class PracticeDraw {

	public static void main(String[] args) {
		
		
		Grid grid = new Grid(10);
		System.out.println("Grid Height is : " + grid.getHt());//i
		System.out.println("Grid Width is : " + grid.getWd());//j


		//grid.setColor(1, 2, Color.blue);

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
	

}
