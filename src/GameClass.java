import java.util.Random;
public class GameClass {
    private Random random = new Random();
    private int number;

    public GameClass() {
        number = random.nextInt(100) + 1;
    }

    public String checkGuess(int guess) {
        if (guess > number) {
            return "Too high...";
        } else if (guess < number) {
            return "Too low...";
        } else {
            return "Correct!";
        }
    }
}

