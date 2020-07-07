public class problem12 {
    public static void printChars(char ch1, char ch2, int numberPerLine){

        int start = (int)ch1;
        int end =(int)ch2;
        int count = 0;

        for(int i = start; i <= end; ++i){
            ++count;

            if(count % 10 == 0){
                System.out.printf("%3s\n",(char)i);
            }
            else
                System.out.printf("%3s",(char)i);
        }


    }

    public static void main(String[] args) {
        
        printChars('1','Z',10);
    }
}