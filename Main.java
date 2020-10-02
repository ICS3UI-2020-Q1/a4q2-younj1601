import java.util.Scanner;
/**
 *Prompt user for positive interger until they enter negative interger
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //declare variable
    int num;
    do{
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      num = input.nextInt();
    }while(num > 0);
    System.out.println("All done!");
    
  }
}
