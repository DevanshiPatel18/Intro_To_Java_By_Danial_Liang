package problem12;

import problem05.Rectangle;
import problem05.GeometricObject;
import problem05.Circle;

public class problem12 {

    public static double sumArea(GeometricObject[] a) {
        double sum =0;
        for(int i =0; i < a.length; ++i){
            sum += a[i].getArea();            
        }

        return sum;
    }
    public static void main(String[] args) {
        
        GeometricObject[] arr = new GeometricObject[4];
       
        arr[0] = new Rectangle(5,2);
        arr[1] = new Rectangle(8,10);

        arr[2] = new Circle(5);
        arr[3] = new Circle(6);      

        System.out.println("The total area is: "+sumArea(arr));
    }
}