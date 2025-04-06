class Person {
    void displayMood() {
        System.out.println("Stay relaxed and enjoy life.");
    }
}

class Emotion extends Person {
    void giveAdvice() {
        System.out.println("Just ignore it, everyone.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person individual = new Person();
        individual.displayMood();

        Emotion currentEmotion = new Emotion();
        currentEmotion.giveAdvice();
    }
}
