package problem27;

public class MyStringBuilder {
    private String s;
    public MyStringBuilder(String s){
        this.s = s;
    }
    public String getS(){
        return s;
    }
    public MyStringBuilder append(MyStringBuilder s1){
        this.s += s1.getS();
        return new MyStringBuilder(s);
    }

    public MyStringBuilder append(int i){
        this.s += i +" ";
        return new MyStringBuilder(s);
    }

    public int length(){
        return s.length();
    }
    public char charAt(int i){
        return s.charAt(i);
    }
    public MyStringBuilder toLowerCase(){
        String temp ="";
        for(int i =0; i < s.length(); ++i){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                temp += (char)(s.charAt(i) + 32)+ "";
            }
            else    
                temp += s.charAt(i);
        }
        return new MyStringBuilder(temp);
    }
    public MyStringBuilder substring(int begin, int end){
        String temp ="";
        for(int i = begin; i <end; ++i){
            temp += s.charAt(i)+ "";
        }
        return new MyStringBuilder(temp);
    }
    public String toString(){
        return s;
    }

}