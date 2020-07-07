package problem10;

public class answer10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for( int i =1; i <= 20; ++i)
            queue.enqueue(i);
        for(int i = queue.getSize() -1; i >=0 ; --i){
            System.out.println(queue.dequeue()+" ");
        }
    }
}