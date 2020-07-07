
class problem20{
    public static void main(String[] args) {
      int number=2;
      int maxinoneline=0;
      while (number<=1000){
        int flag=0;
      for(int i =2;i<number;++i){
        if(number%i==0){
          flag=1;
          break;
        }
      }
      if(flag==0){
        if(maxinoneline<=10){
          maxinoneline++;
        System.out.print(number+" ");
      }
        else{
          maxinoneline=1;
        System.out.print("\n"+number+" ");
      }
      }
      number++;
    }
    }
}
