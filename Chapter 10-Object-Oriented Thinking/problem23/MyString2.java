package problem23;

public class MyString2{
    private String s;

    public MyString2(String s){
        this.s = s;
    }

    public int compare(String s){
        int index =0;
        if (this.s.length() < s.length())
            index = -1;
        if (s.length() < this.s.length())
            index =1;
        
        for(int i =0; i < s.length(); ++i){
            if (this.s.charAt(i) < s.charAt(i))
                index = -(i+1);
            if (this.s.charAt(i) > s.charAt(i))
                index = i+1;
        }
        return index;
    }

    public MyString2 substring(int begin){
        String s ="";
        for(int i = begin; i < this.s.length(); ++i)
            s += this.s.charAt(i);
        
            return new MyString2(s);
    }
    public MyString2 toUpperCase(){
        String s ="";
        for(int i=0; i < this.s.length(); ++i){
            if (this.s.charAt(i) >= 'a' && this.s.charAt(i) <= 'z'){
                s += (char)(this.s.charAt(i) - 32);
            }
            else
                s += this.s.charAt(i);
           
        }
        return new MyString2(s);
    }
    public char[] toChars(){
        char[] chars = new char[this.s.length()];
        for(int i =0; i < this.s.length(); ++i){
            chars[i] = this.s.charAt(i);
        }
        return chars;
    }

    public static MyString2 valueOf(boolean b){
        return (b == true ? (new MyString2("true")) : (new MyString2("false")));
    }
}