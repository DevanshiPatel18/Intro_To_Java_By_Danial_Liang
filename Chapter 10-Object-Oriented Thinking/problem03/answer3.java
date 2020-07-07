package problem3;

public class answer3 {
    public static void main(String[] args) {
    MyInteger n = new MyInteger(5);
    System.out.println("getValue(): " + n.getValue());
    System.out.println("isEven(): " + n.isEven());
    System.out.println("isOdd(): " + n.isOdd());
    System.out.println("isPrime(): " + n.isPrime());
    System.out.println("equals(10): " + n.equals(10));
    System.out.println("equals(MyInteger(5)): " + n.equals(new MyInteger(5)));
    System.out.println("isEven() static: " + MyInteger.isEven(n));
    System.out.println("isOdd() static: " + MyInteger.isOdd(n));
    System.out.println("isPrime() static: " + MyInteger.isPrime(n));
    System.out.println("parseInt(char[]{1, 2, 3}) static: " +
    MyInteger.parseInt(new char[]{'1', '2', '3'}));
    System.out.println("parseInt(String 123) static: " +
    MyInteger.parseInt(new String("123")));
    }
}