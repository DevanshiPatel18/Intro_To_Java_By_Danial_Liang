package problem4;

public class MyPoint {
    private double x,y;
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
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(double x, double y){
        return Math.sqrt((this.x-x)*(this.x - x)+(this.y -y)*(this.y -y));
    }
    public double distance(MyPoint n){
        return distance(n.getX(),n.getY());
    }
}