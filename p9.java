public class Player {
    static int score = 0;

    static void increaseScore() {
        score++;
    }

    public static void main(String[] args) {
        increaseScore();
        System.out.println("Score: " + score);
    }
}
