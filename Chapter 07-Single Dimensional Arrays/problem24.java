public class problem24 {
    public static String pickASuit(){
        int num = (int)(Math.random()*4);
        switch( num ){
            case 0: return "Clubs";
            case 1: return "Spades";
            case 2: return "Diamonds";
            case 3: return "Hearts";
        }

        return "";
    }

    public static String pickACard(){
        int num = (int)(Math.random()*13);
        switch( num ){
            case 0: return "Ace";
            case 1: return "Two";
            case 2: return "Three";
            case 3: return "Four";
            case 4: return "Five";
            case 5: return "Six";
            case 6: return "Seven";
            case 7: return "Eight";
            case 8: return "Nine";
            case 9: return "Ten";
            case 10: return "Jack";
            case 11: return "Queen";
            case 12: return "King";
        }
        return "";
    }

    public static void main(String[] args) {
        // 1 -> hearts, 2 -> diamonds, 3 -> spades, 4-> clubs
        int count=0;
        int[] array = new int[4];
        for( int i =0; ; ++i){
            if( array[0] == 1 && array[1] == 1 && array[2] == 1 && array[3] == 1 )
                break;
            
            count++;
            String card = pickACard();
            String suit = pickASuit();
            
            if (suit.equals("Spades")){
                array[2] = 1;
                System.out.println(card+" of "+suit);
            }
            else if( suit.equals("Diamonds")){
                array[1] = 1;
                System.out.println(card+" of "+suit);
        }
            else if ( suit.equals("Hearts")){
                array[0] = 1;
                System.out.println(card+" of "+suit);
        }
                else {
                array[3]= 1;
                System.out.println(card+" of "+suit);
            }
        }
        System.out.println("Count is: "+count);
    }
}