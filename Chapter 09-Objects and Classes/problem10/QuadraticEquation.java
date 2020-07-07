package problem10;

public class QuadraticEquation {
    private double a,b,c;

    QuadraticEquation(){
        a =1;
        b =1;
        c =1;
    }

    double getA(){
        return a;
    }

    double getB(){
        return b;
    }

    double getC(){
        return c;
    }

    void setA(double a){
        this.a = a;
    }

    void setB(double b){
        this.b =b;
    }

    void setC(double c){
        this.c =c;
    }

    double getDiscriminant(){
        double discriminatn =b*b - 4.0*a*c;
        if (discriminatn > 0)
        return discriminatn;
        else
        return 0;
    }

    double getRoot1(){
        return (-b +Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    
    double getRoot2(){
        return (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
    }
}