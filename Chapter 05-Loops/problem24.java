class problem24{
  public static void main(String[] args) {
      double sum=0.0;
      for(double i=97.0;i>=1;i-=2){
          sum+=i/(i+2);
      }
      System.out.println(sum);
}
}
