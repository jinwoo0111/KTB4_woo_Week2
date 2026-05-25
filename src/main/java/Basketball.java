import java.util.Scanner;

public class Basketball extends Ball{
    private BasketballPosition position; // 포지션, 1. 가드 2. 포워드, 3. 센터

    public Basketball(String name, int age, MainHand hand, BasketballPosition position){
        super(name, age, hand);
        this.position = position;
    }

    public BasketballPosition getPosition(){
        return position;
    }

    @Override
    public void printInfo(){
        System.out.println("[농구선수 아바타 생성 완료]");
        super.printInfo();
        System.out.println("포지션: " + position);
    }
}
