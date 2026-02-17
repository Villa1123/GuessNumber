import java.util.Scanner;

public class PlayerClass {
    private Scanner scanner = new Scanner(System.in);

    public int getUserInput(String promp) {
        System.out.print(promp + " ");

        return scanner.nextInt();
    }
}
