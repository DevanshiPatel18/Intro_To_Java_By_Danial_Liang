public class problem16 {
    public static int numberOfDaysInAYear( int year ){
        
        return ((year%400 == 0)||(year%4 ==0 && year%100 !=0)) ? 366 : 365;
    }

    public static void main(String[] args) {
        
        System.out.println("Year \t Days");
        
        for(int i = 2000; i <= 2020; ++i){

            System.out.printf("%-10d",i);
            System.out.printf("%-15d\n",numberOfDaysInAYear(i));
        }   
     }
}