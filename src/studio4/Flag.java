package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,16);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(11, 8, 8, 4);
		StdDraw.setPenColor(200,0,0);
		StdDraw.filledEllipse(6,8.25,1.75,1);
		StdDraw.setPenColor(0,0,200);
		StdDraw.filledEllipse(0, 0, 0, 0);
		
	}
}