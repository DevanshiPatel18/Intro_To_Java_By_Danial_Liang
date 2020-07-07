public class problem13 {
    public static double seriesAnswer(int i){

        double answer =0.0;

        for( double j = i; j >=1; --j){
            answer += j/(j+1);
        }

        return answer;

    }

    public static void main(String[] args) {
        
        System.out.println("i \t m(i) \n---------------");

        for( int i = 1; i <= 20; i++){
            System.out.printf("%-8d",i);
            System.out.printf("%8.4f \n",seriesAnswer(i));
        }
    }
}