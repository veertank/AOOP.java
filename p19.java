interface Emotion {
    void showEmotion();
}

interface Behavior {
    void takeAction();
}

class Individual implements Emotion, Behavior {
    public void showEmotion() {
        System.out.println("Feeling happy!");
    }

    public void takeAction() {
        System.out.println("Just ignore it, everyone!");
    }
}

public class Main {
    public static void main(String[] args) {
        Individual person = new Individual();
        person.showEmotion();
        person.takeAction();
    }
}
