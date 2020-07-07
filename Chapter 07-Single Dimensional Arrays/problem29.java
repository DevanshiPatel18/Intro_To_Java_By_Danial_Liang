public class problem29 {
    public static int pickACard(){
        int num = (int)(Math.random()*13);
        
        return num+1;
    }

    public static void main(String[] args) {
        int count =0 ;
        int sum=0;
        do{
            sum =0;
            count++;
        for( int i =0 ;i <4; ++i){
            sum += pickACard();
        } 
    }while(sum != 24);
    

    System.out.println("It took "+count+" picks to get sum of 24");
}
}
