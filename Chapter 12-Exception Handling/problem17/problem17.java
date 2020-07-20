package problem17;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class problem17 {
    public static String getRandomWord(File file) {
        ArrayList<String> wordList = new ArrayList<>();
        
        try (Scanner sc = new Scanner(file)) {
            while(sc.hasNext()){
                wordList.add(sc.next());
            }
        } catch (Exception e) {
        }
        return wordList.get((int)(Math.random()*wordList.size()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (args.length != 0){
            System.out.println("Usage : java problem17");
            System.exit(0);
        }

        File file = new File("c:/users/pdevs/desktop/hangman.txt");

        String word = getRandomWord(file).toLowerCase();

        ArrayList<Character> wordLetters = new ArrayList<>();
        //split the words into letters in the ArrayList
        for(int i = 0;  i < word.length(); ++i){
            wordLetters.add(word.charAt(i));
        }
        int guessed = 0,total = 0;
       
        while(true){
            ++total;
            System.out.println("Guess the Word :");
            for(int i =0; i < wordLetters.size(); ++i){
                if (wordLetters.get(i) >= 'A' && wordLetters.get(i) <= 'Z'){
                    System.out.print(wordLetters.get(i));
                }
                else
                    System.out.print("*");
            }
            System.out.print("Enter letter:");
            char s = sc.next().toLowerCase().charAt(0);
            
            if ( wordLetters.contains(s)){
                wordLetters.set(wordLetters.indexOf(s), (s+"").toUpperCase().charAt(0));
                ++guessed;
            }
            else{
                System.out.println("Guess Again !");
            }
            
            //check if all guessed
            if (guessed == wordLetters.size()){
                break;
            }
        
        }
        System.out.println("you guessed the word \""+word+"\" in "+(total-guessed)+" gusses");
        sc.close();
    }    
}