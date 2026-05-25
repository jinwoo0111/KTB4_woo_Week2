import java.util.Scanner;

public class Ball extends Athlete{
    private MainHand hand; // 주손 , 1.왼손 2. 오른손

    public Ball(String name, int age, MainHand hand){
        super(name, age);
        this.hand = hand;
    }

    public MainHand getHand(){
        return hand;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("주손: " + hand);
    }
}