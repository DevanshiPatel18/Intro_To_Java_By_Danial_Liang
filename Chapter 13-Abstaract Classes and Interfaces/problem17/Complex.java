package problem17;

public class Complex {
    private double a;
    private double b;

    public Complex(){
        this(0,0);
    }

    public Complex(double a){
        this(a,0);
    }

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getRealPart(){
        return a;
    }

    public double getImaginaryPart(){
        return b;
    }

    public Complex add(Complex o){
        double r = a + o.getRealPart();
        double i = b + o.getImaginaryPart();
        return new Complex(r,i);
    }

    public Complex subtract(Complex o){
        double r = a - o.getRealPart();
        double i = b - o.getImaginaryPart();
        return new Complex(r,i);
    }

    public Complex multiply(Complex o){
        double r = (a * o.getRealPart()) - (b * o.getImaginaryPart());
    double i = (b * o.getRealPart()) + (a * o.getImaginaryPart());
    return new Complex(r, i);
    }

    public Complex division(Complex o){
        double r = ((a * o.getRealPart()) + (b * o.getImaginaryPart()))/((o.getRealPart() * o.getRealPart()) + (o.getImaginaryPart() * o.getImaginaryPart()));
        double i = ((b * o.getRealPart()) - (a * o.getImaginaryPart()))/((o.getRealPart() * o.getRealPart()) + (o.getImaginaryPart() * o.getImaginaryPart()));
        return new Complex(r, i);
    }

    public double abs(){
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public String toString(){
        return "("+ a + " + " + b +"i " + ")";
    }
}