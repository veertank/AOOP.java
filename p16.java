class Automobile {
    void displayFullForm() {
        System.out.println("Full form of BMW is Bayerische Motoren Werke");
    }
}

class MSeries extends Automobile {
    void showLove() {
        System.out.println("This series is loved!");
    }
}

class ZSeries extends Automobile {
    void showResponse() {
        System.out.println("Okay");
    }
}

public class Main {
    public static void main(String[] args) {
        MSeries myMSeries = new MSeries();
        myMSeries.displayFullForm();
        myMSeries.showLove();

        ZSeries myZSeries = new ZSeries();
        myZSeries.displayFullForm();
        myZSeries.showResponse();
    }
}
