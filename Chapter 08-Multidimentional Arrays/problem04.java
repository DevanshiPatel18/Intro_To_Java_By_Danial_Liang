public class problem4 {
    public static int[][] getTotalHoursOfEmplyeeWork(int[][] employee){
        int[][] hours = new int[2][employee.length];
        for( int i =0; i < employee.length; ++i){
                hours[1][i] = i;
                int sum = 0;
            for( int j =0; j < employee[0].length; ++j){
                sum += employee[i][j];
            }
            hours[0][i] = sum;
        }
    return hours;
    }

    public static void main(String[] args) {
        int[][] employee = {
            {2,4,3,4,5,8,8},
            {7,3,4,3,3,4,4},
            {3,3,4,3,3,2,2},
            {9,3,4,7,8,4,1},
            {3,5,4,3,6,3,8},
            {3,4,4,6,3,4,4},
            {3,7,4,8,3,8,4},
            {6,3,5,9,2,7,9}
        };

        int[][] hours = getTotalHoursOfEmplyeeWork(employee);

        //arrange in decresing order

        for( int i =0; i < hours[0].length - 1; ++i){
            for( int j =i+1; j < hours[0].length; ++j){
                if (hours[0][i] < hours[0][j]){
                    int temp;
                    temp = hours[0][i];
                    hours[0][i] = hours[0][j];
                    hours[0][j] = temp;

                    temp = hours[1][i];
                    hours[1][i] = hours[1][j];
                    hours[1][j] = temp;
                }
            }
        }

        for( int i = 0; i < hours[0].length; ++i){
            System.out.println("The employee "+hours[1][i]+" works for "+hours[0][i]+" hours");
        }
    }
}