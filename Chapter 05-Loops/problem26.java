class problem26{
  public static void main(String[] args) {
    double n = 10000.0;
    while(n<=100000.0){
      double sum=0.0;
      double fact=1;
      for(double i=2;i<=n;++i){
        fact=fact*(i-1);
        sum+=1f/fact;
      }
        System.out.println(1+sum);
      n+=10000;
    }
    
  }
}
