package problem12;
import problem4.MyPoint;
public class Triangle {
    private MyPoint p1,p2,p3;

    public MyPoint getP1(){
        return p1;
    }
    
    public MyPoint getP2(){
        return p2;
    }
    
    public MyPoint getP3(){
        return p3;
    }
    public Triangle(){
        this(new MyPoint(),new MyPoint(1,1),new MyPoint(2,5));
    }

    public Triangle(MyPoint m1,MyPoint m2,MyPoint m3){
        p1 = m1;
        p2 = m2;
        p3 = m3;
    }

    public double getArea(){
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);

        double side = (side1+side2+side3)/2;

        return Math.sqrt(side*(side-side1)*(side-side2)*(side-side3));

    }
    public double getPerimeter(){
        
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean contains(MyPoint p){
        boolean a = sign(p , p1 ,p2) < 0;
        boolean b = sign(p,p2,p3) < 0;
        boolean c = sign(p,p1,p3) < 0;
        return ((a==b) && (b == c));
    }

    public boolean contains(Triangle t){
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    public boolean overlaps(Triangle t){
        if (contains(t))
            return true;
        MyPoint[] a = {p1,p2,p3};
        MyPoint[] b ={t.getP1(),t.getP2(),t.getP3()};

        for(int i =0 ; i < a.length; ++i){
            for( int j = 0; j < b.length; ++j){
                int k = i+1;
                int m = j+1;
                if (i == a.length -1)
                    k=0;
                if (j == b.length -1)
                    m=0;
                if (intersect(a[i],a[k],b[j],b[m]))
                    return true;
            }
        }
        return false;
    }
    public static boolean intersect(MyPoint p1, MyPoint q1, MyPoint p2,MyPoint q2){
        int o1 = orientation(p1,q1,p2);
        int o2 = orientation(p1,q1,q2);
        int o3 = orientation(p2,q2,p1);
        int o4 = orientation(p2,q2,q1);

        if ( o1 != o2 && o3 != o4)
            return true;
        
            return false;
    }
    public static int orientation(MyPoint p, MyPoint q , MyPoint r){
        double val = (q.getY() - p.getY())*(r.getX() -q.getX()) - (q.getX() - p.getX())*(r.getY() - q.getY());

        if (val == 0.0)
            return 0;
        return (val > 0 ? 1 : 2);
    }
    public static double sign(MyPoint p1, MyPoint p2,MyPoint p3){
        return (p1.getX() - p3.getX())*(p2.getY() - p3.getY()) - (p2.getX() - p3.getX())*(p1.getY() - p3.getY());
    }
}