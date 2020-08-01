package problem15;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger n;
    private BigInteger d;

    public Rational(){
        this(new BigInteger("0"), new BigInteger("1"));
    }

    public Rational(BigInteger n, BigInteger d){
        BigInteger gcd = gcd(n,d);
        this.n = ((d.compareTo(new BigInteger("0")) == 1 ? new BigInteger("1") : new BigInteger("-1")).multiply(n)).divide(gcd);
        this.d = d.abs().divide(gcd);
    }

    public BigInteger gcd(BigInteger a, BigInteger b){
        a = a.abs();
        b = b.abs();
        BigInteger gcd = BigInteger.ONE;

        for(BigInteger i = BigInteger.ONE; i.compareTo(a) <= 0 && i.compareTo(b) <=0; i = i.add(new BigInteger("1"))){
            if (a.remainder(i).equals(new BigInteger("0")) && b.remainder(i).equals(new BigInteger("0"))){
                gcd = i;
            }
        }

        return gcd;
    }

    public BigInteger getNumerator(){
        return n;
    }

    public BigInteger getDenominator(){
        return d;
    }

    public Rational add(Rational r){
        BigInteger a = (n.multiply(r.getDenominator())).add(d.multiply(r.getNumerator()));
        BigInteger b =  d.multiply(r.getDenominator());
        
        return new Rational(a,b);
    }

    public Rational subtract(Rational r){
        BigInteger a = (n.multiply(r.getDenominator())).subtract(d.multiply(r.getNumerator()));
        BigInteger b = d.multiply(r.getDenominator());

        return new Rational(a,b);
    }

    public Rational multiply(Rational r){
        BigInteger a = n.multiply(r.getNumerator());
        BigInteger b = d.multiply(r.getDenominator());
        return new Rational(a,b);
    }

    public Rational divide(Rational r){
        BigInteger a = n.multiply(r.getDenominator());
        BigInteger b = d.multiply(r.getNumerator());

        return new Rational(a,b);
    }

    @Override
    public int compareTo(Rational r){
        if (this.subtract(r).getNumerator().compareTo(new BigInteger("0")) > 0)
            return 1;
        else if  (this.subtract(r).getNumerator().compareTo(new BigInteger("0")) < 0)
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object r){
        if (this.subtract((Rational)r).getNumerator().compareTo(new BigInteger("0")) == 0)
            return true;
        else
            return false;
    }

    @Override
    public int intValue(){
        return (int)doubleValue();
    }

    @Override
    public long longValue(){
        return (long)doubleValue();
    }

    @Override
    public double doubleValue(){
        return n.doubleValue() / d.doubleValue();
    }

    @Override
    public float floatValue(){
        return (float)doubleValue();
    }

    @Override
    public String toString(){
        if (d.compareTo(new BigInteger("1")) == 0)
            return n + "";
        else
            return n + "/" + d; 
    }



}