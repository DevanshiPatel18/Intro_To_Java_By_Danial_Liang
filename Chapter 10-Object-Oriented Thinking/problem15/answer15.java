package problem15;

import problem13.MyRectangle2D;
import java.util.Scanner;
public class answer15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		// Create 5 x 2 matrix
		double[][] points = new double[5][2];

		// Prompt the user to enter five points
		System.out.print("\nEnter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D r1 = MyRectangle2D.getRectangle(points);

		System.out.println("The bounding rectangle's center (" + r1.getX() + ", " + 
			r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
        input.close();
        }
}