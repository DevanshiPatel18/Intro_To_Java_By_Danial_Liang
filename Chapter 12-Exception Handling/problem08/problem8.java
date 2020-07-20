package problem08;
import java.util.Scanner;
import java.math.BigInteger;

public class problem8 { public static String hextoDec(String s){
    BigInteger answer = new BigInteger("0");
    for(int i = s.length()-1; i >=0; --i){
        BigInteger pow = new BigInteger((new BigInteger("16")).pow(i)+"");
        String number = s.charAt(s.length()-i - 1)+"";
        if (!Character.isDigit(number.charAt(0))){
        switch(number){
            case "A" : number = "10";
                break;
            case "B" : number = "11"; 
                break;
            case "C" : number = "12";
                break;
            case "D" : number = "13";
                break;
            case "E" : number = "14";
                break;
            case "F" : number = "15";
                break;
        }
       
    }
        BigInteger n = new BigInteger(number).multiply(pow);
        answer = answer.add(n);
    }
    return answer.toString();
}
public static boolean isHex(String s) throws HexFormatException{

        if (!s.matches("^[A-F0-9]+$")){
        throw new HexFormatException("");
        }
    return true;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a hexadecimal:");
    String s = sc.nextLine();
    
    //convert hexadecimal to decimal
    try {
        isHex(s);
    } catch (Exception e) {
        System.out.println("String not in hexadecimal format ");
        System.exit(0);
    }
    System.out.println(s+" in decimal is: "+hextoDec(s));
    sc.close();


}
}