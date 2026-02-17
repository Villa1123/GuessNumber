public class GuessNumberApp {
    public static void main(String[] args){
        PlayerClass player = new PlayerClass();
        GameClass game = new GameClass();

        System.out.println("Hello and welcome to our magic guess the number game.");
        System.out.println("Let's see how long it will take you to guess the number we're thinking of.");

        int numGuesses = 0;

        boolean isGuessing = true;
        while (isGuessing){
            int guess = player.getUserInput("Enter your guess please");
            numGuesses++;

            String result = game.checkGuess(guess);
            System.out.println(result);

            if(result.equals("Correct!")){
                isGuessing = false;
                System.out.println("Victory! You guessed the number in " + numGuesses + " guesses!");
            }
        }

    }






}
