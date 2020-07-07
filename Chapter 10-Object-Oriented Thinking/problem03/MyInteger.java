package problem3;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public boolean isEven(){
        return (this.value % 2 == 0 ? true : false);
    }

    public boolean isOdd(){
        return (!isEven());
    }

    public boolean isPrime(){
        for(int i =2 ; i < Math.sqrt(this.value); ++i){
            if ( this.value % i == 0)
            return false;
        }

        return true;
    }
    public static boolean isEven(MyInteger n){
        return n.isEven();
    }

   public static boolean isOdd(MyInteger n){
        return  (!n.isEven());
    }

    public static boolean isPrime(MyInteger n){
        return n.isPrime();
    }

    public boolean equals(int n){
        return (n == this.value ? true: false);
    }

    public boolean equals(MyInteger n){
        return n.equals(n.getValue());
    }

    public static String parseInt(char[] a){
        int[] arr = new int[a.length];
        for(int i =0 ; i <a.length; ++i ){
            arr[i] = Integer.parseInt(a[i]+"");
        }
     return (java.util.Arrays.toString(arr));
    }
    public static int parseInt(String num){
        return Integer.parseInt(num);
    }
}