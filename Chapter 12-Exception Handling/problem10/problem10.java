package problem10;

public class problem10 {
    public static void main(String[] args) {
        try{
            throwError();
        }
        catch(Error e){
            System.out.println("OutOfMemory Error caught !");
            System.exit(0);
        }
    }
    public static void throwError() {
        throw new OutOfMemoryError();
    }
}