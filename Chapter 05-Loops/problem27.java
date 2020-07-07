class problem27{
  public static void main(String[] args) {
    int perLine = 10;
    int count=0;
    for( int i = 101; i <=2100; ++i){
      if((i%4==0 && i%100!=0) || (i%400==0)){
        if(count%10==0){
          count++;
          System.out.print("\n"+i+" ");
        }
        else
        {
          count++;
        System.out.print(i+" ");
      }
      }
    }
    System.out.println("\nThe number of years are:"+count);
  }
}
