package studio4;
import java.awt.*;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//border
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0.5, 0.3, 0.25, 0.15);

		//color fill
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledRectangle(0.5, 0.3, 0.25, 0.15);

		//text
		Font font = new Font("Papyrus", Font.BOLD, 25);
		StdDraw.setFont(font);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(0.5, 0.3, "freakyland 👅");
	}
}