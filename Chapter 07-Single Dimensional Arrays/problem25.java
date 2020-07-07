public class problem25 {
    public static int solveQuadratic(double[] eqn, double[] roots){
     double b = eqn[1]*eqn[1]-4*eqn[0]*eqn[2];

     if ( b > 0){
     roots[0] = (-eqn[1] + Math.sqrt(b))/(4*eqn[0]);
     roots[1] = (-eqn[1] + Math.sqrt(b))/(4*eqn[0]);
     return 2;
     }
     else if (b ==0){
        roots[0] = (-eqn[1] + Math.sqrt(b))/(4*eqn[0]);
        roots[1] = roots[0];
        return 1;
     }
     else
        return 0;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        System.out.print("Enter a,b,c values for quadratic equation:");
        eqn[0] = sc.nextDouble();
        eqn[1] = sc.nextDouble();
        eqn[2] = sc.nextDouble();

        int root = solveQuadratic(eqn, roots);
        if ( root ==2 ){
            System.out.println("There are "+ root +" roots");
            System.out.println("Roots are:"+roots[0]+" "+roots[1]);
    }   else if (root ==1){
        System.out.println("There are "+root+" roots");
        System.out.println("Toots are:"+roots[0]);

    }else
        System.out.println("There are no real roots");
    sc.close();
    }
}