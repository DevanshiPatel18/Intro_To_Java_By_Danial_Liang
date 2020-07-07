package problem7;

import java.util.ArrayList;

public class answer7 {
    public static void shuffle(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); ++i){
            int randomIndex = (int)(Math.random()*list.size());
            int temp = list.get(i);
            list.set(i,list.get(randomIndex));
            list.set(randomIndex,temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
        for(int i =1; i <= 100; ++i)
            list.add(i);
    
        shuffle(list);

        System.out.println(list);
        }
}