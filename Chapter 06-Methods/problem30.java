public class problem30 {
    public static int roll(){
        return (int)(1 + Math.random()*6);
    }

    public static void main(String[] args) {
        int previousPoint = 0;

        while(true){
            int roll1 = roll();
            int roll2 = roll();
            int sum = roll1 + roll2;
            System.out.println("You rolled "+roll1+" + "+roll2+" = "+sum);
            if ( sum == 2 || sum == 3 || sum == 12){
                System.out.print("You lose\n");
                break;
            }
            else if( sum == 7 || sum ==11 ){
                System.out.print("You win\n");
                break;
            }
            else if ( previousPoint == sum){
                System.out.print("You win\n");
                break;
            }
            else{
                System.out.print("point is "+sum+"\n");
                previousPoint = sum;
            }

        }
    }
}