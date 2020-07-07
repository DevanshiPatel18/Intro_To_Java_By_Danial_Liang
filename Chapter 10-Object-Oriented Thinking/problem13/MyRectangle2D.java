package problem13;

public class MyRectangle2D {
    private double x,y;
    private double width,height;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public MyRectangle2D(){
        this(0,0,1,1);
    }

    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width =width;
        this.height= height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width + height);
    }

    public boolean contains(double x, double y){
        boolean xValid = x <= (this.x + (width / 2)) && x >= (this.x - (width / 2));
        boolean yValid = y <= (this.y + (height / 2)) && y >= (this.y - (height / 2));
        return xValid && yValid;
    }

    public boolean contains(MyRectangle2D r){
        double[][] corners = getCornerPoints(r);
        for (int i = 0; i < corners.length; i++) {
          if (!contains(corners[i][0], corners[i][1])) { return false; }
        }
        return true;
    }

    public boolean overlaps(MyRectangle2D r) {
        if ((getY() + (getHeight() / 2) < r.getY() - (r.getHeight() / 2)) ||
            (getY() - (getHeight() / 2) > r.getY() + (r.getHeight() / 2)) ||
            (getX() + (getWidth() / 2) < r.getX() - (r.getWidth() / 2))   ||
            (getX() - (getWidth() / 2)) > r.getX() + (r.getWidth() / 2)) {
          return false;
        }
        return true;
      }

      private static double[][] getCornerPoints(MyRectangle2D r) {
        double[][] corners = new double[4][2];
        corners[0][0] = r.getX() - (r.getWidth() / 2);
        corners[0][1] = r.getY() + (r.getHeight() / 2);
        corners[1][0] = r.getX() + (r.getWidth() / 2);
        corners[1][1] = r.getY() + (r.getHeight() / 2);
        corners[2][0] = r.getX() + (r.getWidth() / 2);
        corners[2][1] = r.getY() - (r.getHeight() / 2);
        corners[3][0] = r.getX() - (r.getWidth() / 2);
        corners[3][1] = r.getY() - (r.getHeight() / 2);
        return corners;
      }
    
    public static double distance(double x, double y){
        return Math.sqrt(x*x + y*y);
    }
    public static MyRectangle2D getRectangle(double[][] points) {
		final int COLUMN_X = 0;
		final int COLUMN_Y = 1;
		double[] minMaxX = minMax(points, COLUMN_X);
		double[] minMaxY = minMax(points, COLUMN_Y);
		double x = (minMaxX[1] + minMaxX[0]) / 2;
		double y = (minMaxY[1] + minMaxY[0]) / 2;
		double height = Math.sqrt(Math.pow(minMaxY[1] - minMaxY[0], 2));;
		double width = Math.sqrt(Math.pow(minMaxX[1] - minMaxX[0], 2));
		return new MyRectangle2D(x, y, width, height);
	}

	private static double[] minMax(double[][] points, int col) {
		double[] minMax = new double[2];
		minMax[0] = minMax[1] = points[0][col];
		for (int i = 0; i < points.length; i++) {
			if (points[i][col] < minMax[0])
				minMax[0] = points[i][col];
			if (points[i][col] > minMax[1])
				minMax[0] = points[i][col];
		}
		return minMax;
	}
}