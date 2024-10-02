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

		String fileRead = in.nextLine();
		String[] shapeArgs = fileRead.split(" ");

		double x1 = Double.parseDouble(shapeArgs[5]);
		double y1 = Double.parseDouble(shapeArgs[6]);
		double x2 = Double.parseDouble(shapeArgs[7]);
		double y2 = Double.parseDouble(shapeArgs[8]);
		if (shapeArgs.length > 8) {
			double x3 = Double.parseDouble(shapeArgs[9]);
			double y3 = Double.parseDouble(shapeArgs[10]);
		}
	}
}
