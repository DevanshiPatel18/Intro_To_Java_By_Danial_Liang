public class problem8 {

    public static double celciusToFahrenhiet(double n){
        return (9.0/5)*n + 32;
    }

    public static double fahrenheitToCelcius(double n){
        return (5.0/9)*(n-32);
    }

    public static void main(String[] args) {
       double celcius=40.0;
       double fahrenhiet=120.0;
       System.out.println("Celcius  Fahrenheit | Fahrenheit  Celcius");
       System.out.println("----------------------------------------------");
        for(int i=0 ;i<=9; i++){
        System.out.printf("%-4.1f \t %-4.1f \t    | \t",celcius,celciusToFahrenhiet(celcius));
        System.out.printf("%-4.1f \t %-4.1f",fahrenhiet,fahrenheitToCelcius(fahrenhiet));
        System.out.println();
        celcius-=1;
        fahrenhiet-=10;
        }

    }
}