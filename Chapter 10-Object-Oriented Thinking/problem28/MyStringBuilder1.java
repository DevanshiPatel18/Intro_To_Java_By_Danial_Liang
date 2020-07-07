package problem28;

public class MyStringBuilder1 {
    private String s;
    public String getString(){
        return s;
    }
    public MyStringBuilder1(){
        s ="";
    }
    public MyStringBuilder1(char[] chars){
        for(int i =0; i < chars.length; ++i){
            s += chars[i]+"";
        }
    }
    public MyStringBuilder1(String s){
        this.s = s;
    }
    public MyStringBuilder1 insert(int offest,MyStringBuilder1 s){
        String left =this.s.substring(0,offest);
        String right =this.s.substring(offest);
        for(int i =0 ; i < s.getString().length(); ++i){
            left += s.getString().charAt(i);
        }
        return new MyStringBuilder1(left + right);
    }
    public MyStringBuilder1 reverse(){
        String temp ="";
        for(int i = s.length()-1; i >=0; --i){
            temp += s.charAt(i)+"";
        }
        return new MyStringBuilder1(temp);
    }
    public MyStringBuilder1 substring(int begin){
        String temp = "";
        for(int i =begin; i <s.length(); ++i){
            temp += s.charAt(i)+"";
        }
        return new MyStringBuilder1(temp);
    }
    public MyStringBuilder1 toUpperCase(){
        String temp ="";
        for(int i =0; i < s.length(); ++i){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                temp += (char)(s.charAt(i)-32);
            }
            else
                temp += s.charAt(i);
        }
        return new MyStringBuilder1(temp);
    }
}