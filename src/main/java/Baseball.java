import java.util.Scanner;

public class Baseball extends Ball{
    private BaseballPosition position; // 포지션 1. 투수, 2. 타자

    public Baseball(String name, int age, MainHand hand, BaseballPosition position){
        super(name, age, hand);
        this.position=  position;
    }

    public BaseballPosition getPosition(){
        return position;
    }

    @Override
    public void printInfo(){
        System.out.println("[야구선수 아바타 생성 완료]");
        super.printInfo();
        System.out.println("포지션: " + position);
    }
}
