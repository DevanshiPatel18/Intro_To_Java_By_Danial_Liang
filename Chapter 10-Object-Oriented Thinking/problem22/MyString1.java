package problem22;

public class MyString1 {
    private char[] chars;

    public char[] getString(){
        return chars;
    }

    public MyString1(char[] chars){
        this.chars = new char[chars.length];
        for(int i =0; i < chars.length; ++i){
            this.chars[i] = chars[i];
        }
    }

    public char charAt(int index){
        return chars[index];
    }

    public int length(){
        return chars.length;
    }

    public MyString1 substring(int begin, int end){
        char[] ch = new char[end - begin];
        for(int i =begin,j=0; i < end; ++i,++j){
            ch[j] = chars[i];
        }
        return new MyString1(ch);
    }

    public MyString1 toLowerCase(){
        char[] ch =  new char[chars.length];
        for(int i =0; i < chars.length; ++i){
            if ( (int)(chars[i]) >= 'A' && chars[i] <= 'Z' ){
                ch[i] = (char)(chars[i] + 32);
            }
            else{
                ch[i] = chars[i];
            
            }
        }
        return new MyString1(ch);
    }

    public boolean equals(MyString1 s){
        if (s.getString().length != chars.length)
            return false;
        char[] temp = s.getString();

        for(int i =0; i < chars.length; ++i){
            if ( chars[i] != temp[i])
                return false;
        }
        return true;
    }
    public static MyString1 valueOf(int i){
        int count =0 ;
        int temp =i;
        while(temp >= 1){
            count++;
            temp /= 10;
        }
        char[] ch = new char[count];
        for(int j =0,d =(int) Math.pow(10,count-1); j < ch.length; ++j, d /= 10){
            ch[j] = Character.forDigit(i/d,10);
            i %= d;
        }
        return new MyString1(ch);
    }
    
}