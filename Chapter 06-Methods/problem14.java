public class problem14 {
    
    public static double computePi(int i){

        double answer = 0.0;

        for( int j = i; j >= 1; --j){

            answer += 4*(Math.pow(-1,j+1)/(2*j-1));
        }

        return answer;

    }

    public static void main(String[] args) {
        
        System.out.println("i \t m(i)\n--------------------");

        for (int i = 1; i <= 901; i += 100){
            System.out.printf("%-10d",i);
            System.out.printf("%10.4f\n",computePi(i));
        }
    }
}