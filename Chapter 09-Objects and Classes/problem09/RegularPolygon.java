package problem9;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon(){
        n = 3;
        side = 1;
        x =0;
        y =0;
    }

    RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
        x =0;
        y =0 ;
    }

    RegularPolygon(int n,double sides,double x, double y){
        this.n = n;
        this.side = sides;
        this.x =x;
        this.y =y;
    }

    int getSide(){
        return n;
    }

    void setSide(int n){
        this.n = n;
    }

    void setSideLength(double side){
        this.side = side;
    }
     
    double getSideLength(){
        return side;
    }

    double getX(){
        return x;
    }
    
    void setX(double x){
        this.x = x;
    }

    double getY(){
        return y;
    }

    void setY(double y){
        this.y = y;
    }

    double getPerimeter(){
        return n*side;
    }

    double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }

}