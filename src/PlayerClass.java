
import java.util.Scanner;

public class PlayerClass {

    Scanner scanner = new Scanner(System.in);

 public int getGuess (String prompt) {
     System.out.print(prompt + " ");
     return scanner.nextInt();
 }






}
