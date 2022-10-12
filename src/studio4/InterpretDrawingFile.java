package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int colorOne = in.nextInt();
		int colorTwo = in.nextInt();
		int colorThree = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double width = in.nextDouble();
		double length = in.nextDouble();
		StdDraw.setPenColor(colorOne,colorTwo,colorThree);
		
		if(shape.equals("rectangle")) {
			if (filled==true)
			{
			StdDraw.filledRectangle(x, y, width, length);
			}else {
				StdDraw.rectangle(x,y,width,length);
			}
		}
	}

}
