package problem2;
public class answer2{
    public static void main(String[] args) {
        Stock myStock = new Stock("ORCL","Oracle Corporation");
    
        myStock.currentPrice = 34.35;
        myStock.previousClosingPrice = 34.5;
    
        System.out.println("The percentage change in stock price is:"+myStock.getChangePercent());
    }
  
}