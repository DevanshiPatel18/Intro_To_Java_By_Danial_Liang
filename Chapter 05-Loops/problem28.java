import java.util.Scanner;
class problem28{
  static String days(int a){
    String day="";
    switch(a){
      case 1: day="Monday";
        break;
      case 2: day="Tuesday";
        break;
      case 3: day="Wednesday";
        break;
      case 4: day="Thrusday";
        break;
      case 5: day="Friday";
        break;
      case 6: day="Saturday";
        break;
      case 0: day="Sunday";
      break;
    }
    return day;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    int day = sc.nextInt();
    if((year%4==0 && year%100!=0)||(year%400==0)){
      System.out.println("January 1, "+year+" is "+days(day%7));
      System.out.println("February 1, "+year+" is "+days((day+31)%7));
      System.out.println("March 1, "+year+" is "+days((day+31+29)%7));
      System.out.println("April 1, "+year+" is "+days((day+31+29+31)%7));
      System.out.println("May 1, "+year+" is "+days((day+31+29+31+30)%7));
      System.out.println("June 1, "+year+" is "+days((day+31+29+31+30+31)%7));
      System.out.println("July 1, "+year+" is "+days((day+31+29+31+30+31+30)%7));
      System.out.println("August 1, "+year+" is "+days((day+31+29+31+30+31+30+31)%7));
      System.out.println("September 1, "+year+" is "+days((day+31+29+31+30+31+30+31+31)%7));
      System.out.println("October 1, "+year+" is "+days((day+31+29+31+30+31+30+31+31+30)%7));
      System.out.println("November 1, "+year+" is "+days((day+31+29+31+30+31+30+31+31+30+31)%7));
      System.out.println("December 1, "+year+" is "+days((day+31+29+31+30+31+30+31+31+30+31+30)%7));
    }
    else{
      System.out.println("January 1, "+year+" is "+days(day%7));
      System.out.println("February 1, "+year+" is "+days((day+31)%7));
      System.out.println("March 1, "+year+" is "+days((day+31+28)%7));
      System.out.println("April 1, "+year+" is "+days((day+31+28+31)%7));
      System.out.println("May 1, "+year+" is "+days((day+31+28+31+30)%7));
      System.out.println("June 1, "+year+" is "+days((day+31+28+31+30+31)%7));
      System.out.println("July 1, "+year+" is "+days((day+31+28+31+30+31+30)%7));
      System.out.println("August 1, "+year+" is "+days((day+31+28+31+30+31+30+31)%7));
      System.out.println("September 1, "+year+" is "+days((day+31+28+31+30+31+30+31+31)%7));
      System.out.println("October 1, "+year+" is "+days((day+31+28+31+30+31+30+31+31+30)%7));
      System.out.println("November 1, "+year+" is "+days((day+31+28+31+30+31+30+31+31+30+31)%7));
      System.out.println("December 1, "+year+" is "+days((day+31+28+31+30+31+30+31+31+30+31+30)%7));
    }
  }
}
