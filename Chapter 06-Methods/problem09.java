public class problem9 {

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        double feet = 1.0;
        double meter = 20.0;

        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-------------------------------");

        for(int i = 0 ;i <10 ;i++){
            System.out.printf("%4.1f\t%4.3f\t|",feet,footToMeter(feet));
            System.out.printf("\t%4.1f\t%4.3f",meter,meterToFoot(meter));
            System.out.println();
            feet += 1;
            meter +=5.0;
        }
    }    
}