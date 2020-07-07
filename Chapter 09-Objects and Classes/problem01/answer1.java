package problem1;
public class answer1 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        System.out.println("The width and height of Rectangle 1 is:"+rectangle1.width+" "+rectangle1.height);
        System.out.println("The area and perimeter of Rectangle 1 is: "+rectangle1.getArea()+" "+rectangle1.getPerimeter());
        System.out.println();

        System.out.println("The width and height of Rectangle 1 is:"+rectangle2.width+" "+rectangle2.height);
        System.out.println("The area and perimeter of Rectangle 1 is: "+rectangle2.getArea()+" "+rectangle2.getPerimeter());
    }
}