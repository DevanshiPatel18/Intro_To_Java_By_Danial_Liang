package problem07;

public class problem7 {
    public static void main(String[] args) {
        Square[] arr = new Square[5];
        
        for(int i =0; i < arr.length; ++i)
            arr[i] = new Square(i+1);
        
        for(int i =0; i < arr.length; ++i){
            System.out.print("Square"+i+" area: "+arr[i].getArea()+" ");
            if (arr[i] instanceof Colorable){
                ((Colorable)arr[i]).howToColor();
            }   
        }
    }
}