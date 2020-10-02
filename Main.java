import java.util.Scanner;
/**
 * Fizzbuzz until user number
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {


    //Had to redo because I forgot to save before


    // Creates scanner for user input
    Scanner input = new Scanner(System.in);

    //Gets number from user
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int num = input.nextInt();

    //start, fizz, and buzz variables
    int START = 0;
    int FIZZ = 3;
    int BUZZ = 5;

    //Fizzbuzz loop
    while(num > START){
      START = START + 1;
      if(START % FIZZ == 0 && START % BUZZ == 0){
        System.out.println("Fizzbuzz");
      }else if(START % FIZZ == 0){
        System.out.println("Fizz");
      }else if(START % BUZZ ==0){
        System.out.println("Buzz");
      }else
      System.out.println(START);
    }
    
  }
}