public class problem23 {
    public static boolean[] operationOnLocker(boolean[] lockers,int studentNumber){
        for( int i = studentNumber; i <= lockers.length -1 ; i += studentNumber){
            if ( i == 0){
                lockers[0] = true;
                break;
            }
            lockers[i] = (!lockers[i]);
            System.out.println("Doing operation"+i);
        }

        return lockers;
    }

    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        System.out.println("IN Main");
        for( int i =0; i < lockers.length; ++i){
            lockers = operationOnLocker(lockers,i);
        }
        System.out.println("done operations");
        for( int i =0; i < lockers.length; ++i){
            if (lockers[i])
                System.out.print(i+1+" ");
        }
    }
}