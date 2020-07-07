import java.util.Scanner;
class problem29{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    int day = sc.nextInt();
    System.out.println();
    for(int month =1;month <=12;++month){
      String header="";
      switch(month){
        case 1: header+="January";
          break;
        case 2: header+="February";
          break;
        case 3: header+="March";
          break;
        case 4: header+="April";
          break;
        case 5: header+="May";
          break;
        case 6: header+="June";
          break;
        case 7: header+="July";
          break;
        case 8: header+="August";
          break;
        case 9: header+="September";
          break;
        case 10: header+="October";
          break;
        case 11: header+="NOvember";
          break;
        case 12: header+="December";
          break;
      }
      header+=year+" ";
      for(int b=0;b<23-(header.length()/2);b++){
        System.out.print(" ");
      }
      System.out.println(header+"\n--------------------------------------\n"+"sun   mon  tue  wed  thr fri  sat ");
      day%=7;
      for(int b=0;b<=day*7;b++){
        System.out.print(" ");
      }

      int lastday=0;
      if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
        lastday+=31;
      }
      else if(month==4 || month==6 || month==9|| month==11)
        lastday+=30;
        else{
          if((year%4==0 && year%100!=0)||(year%400==0))
            lastday+=29;
          else
            lastday+=28;
        }
        for(int d=1;d<=lastday;d++){
          if(d<10)
            System.out.print(" ");

            if(day%7==6)
              System.out.print(d+"\n");
              else{
                System.out.print(d+"   ");
                if (d==lastday)
                System.out.println();
              }
              day++;
        }
        System.out.println();

        }
  }
}
