public class problem38 {
    public static char getRandomCharater(char ch1, char ch2){
        return (char)(ch1 + Math.random()*(ch2 - ch1 +1));
    }
    public static char getRandomDigit(){

        return getRandomCharater('1', '9');
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharater('A', 'Z');
    }
    public static void main(String[] args) {
        int count=0;
        for( int i = 0; i<100 ; ++i){
            ++count;
            if ( count % 10 ==0)
                System.out.printf("%4s\n",getRandomUpperCaseLetter());
            else
                System.out.printf("%4s ",getRandomUpperCaseLetter());
        }
        for( int i = 0; i<100 ; ++i){
            ++count;
            if ( count % 10 ==0)
                System.out.printf("%4s\n",getRandomDigit());
            else
                System.out.printf("%4s ",getRandomDigit());
        }
    }
}