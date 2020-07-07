import java.util.Scanner;

class problem34{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      byte player=0,computer=0;
      byte count=0;
      do{
      System.out.println("scissor (0), rock(1), paper(2) :");
      byte answer = sc.nextByte();
      byte guess = (byte)(Math.random()*3);
      System.out.println(guess);
      if ((answer==0 && guess==2)||(answer == 2 && guess==1)||(answer==1 && guess==0) )
        player++;
      else{
        if((answer==2 && guess==0)||(answer == 1 && guess==2)||(guess==1 && answer==0))
        computer++;
      }
      System.out.println("Player Score: "+player+" Computer Score: "+computer);
    }while(Math.abs(player-computer)<=2);
  }
}
