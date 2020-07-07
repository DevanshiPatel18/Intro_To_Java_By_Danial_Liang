package problem26;

public class answer26 {
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[3]);
        String result = num1 + " "+ args[2]+" "+ num2 +"=";
        switch(args[2]){
            case "+" : result +=" "+ (num1+num2);
                break;
            case "-" : result += " "+ (num1 - num2);
                break;
            case "*" : result += " " + (num1*num2);
                break;
            case "/" : result += " " + (num1/num2);
        }
        System.out.println(result);
        }
    }
