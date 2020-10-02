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
    int fizz = 3;
    int buzz = 5;

    //Fizzbuzz loop
    while(num > START){
      START = START + 1;
      if(START % fizz == 0 && START % buzz == 0){
        System.out.println("Fizzbuzz");
      }else if(START % fizz == 0){
        System.out.println("Fizz");
      }else if(START % buzz ==0){
        System.out.println("Buzz");
      }else
      System.out.println(START);
    }
    
  }
}