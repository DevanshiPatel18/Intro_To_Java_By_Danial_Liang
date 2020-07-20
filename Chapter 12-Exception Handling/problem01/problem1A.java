package problem1;
public class problem1A{
    public static void main(String[] args) {
        
        try{
         int  a = Integer.parseInt(args[0]);
         int  b = Integer.parseInt(args[2]);

         
        switch( args[1]){
            case "+" : System.out.println(a + " + " + b +" = "+ (a+b));
                break;
            case "-" : System.out.println(a + " - " + b +" = "+ (a-b));
                break;
            case "x" : System.out.println(a + " x " + b +" = "+ (a*b));
                break;
            case "/" : System.out.println(a + " / " + b +" = "+ (a/b));
                break;
            case "%" : System.out.println(a + " % " + b +" = "+ (a%b));
                break;
            
        }
        }
        catch(NumberFormatException ex){
            System.out.println("Wrong Input: "+ex.getMessage().split(" ")[3]);
            System.exit(0);
        }
    }
}