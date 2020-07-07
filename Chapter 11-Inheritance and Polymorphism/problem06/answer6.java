package problem6;

import java.util.ArrayList;
import java.util.Date;

public class answer6 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Circle());
        list.add(new GeometricObject());
        list.add(new Date());

        for(int i =0; i < list.size(); ++i){
            System.out.println(list.get(i).toString());
        }
    }
}