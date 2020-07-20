package problem1;

public class problem1B {
    public static boolean isDigit(String s){
        for(int i =0 ;i  < s.length(); ++i){
        if (! Character.isDigit(s.charAt(i)) ){
            System.out.println("Wrong Input: "+s);
            System.exit(0);
        }
    }
        return true;
    }
    public static void main(String[] args) {
        
        if (isDigit(args[0]) && isDigit(args[2])){  
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);

            switch(args[1]){
                case "+" : System.out.println(a + " + " + b + " = "+ (a+b));
                   break;
                case "-" : System.out.println(a + " - " + b + " = "+ (a-b));
                       break;
               case "x" : System.out.println(a + " x " + b + " = "+ (a*b));
                       break;
                case "/" : System.out.println(a+ " / "+b+" = "+(a/b));
                    break;
                case "%": System.out.println(a+" % "+b+" = "+(a%b));
                    break;
           }
        }
    }
}