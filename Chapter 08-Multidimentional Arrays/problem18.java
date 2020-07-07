public class problem18 {
    public static void shuffle(int[][] m) {
        for( int i =0; i < m.length; ++i){
            int j = (int)(Math.random()*(m.length));
            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }

        for(int i = 0; i < m.length; ++i){
                System.out.print(java.util.Arrays.toString(m[i])+" ");
            
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        shuffle(m);
    }
}