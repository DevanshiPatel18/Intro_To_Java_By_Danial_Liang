class problem40{
  public static void main(String[] args) {
    long count=0;
    long tails=0,heads=0;
    while(count<=Math.pow(10,7)){

    Math.abs((byte)(Math.random()*2)==0?tails++:heads++);
    ++count;
  }
  System.out.println("Heads: "+heads+" Tails: "+tails);
  }
}
