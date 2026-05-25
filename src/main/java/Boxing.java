import java.util.Scanner;

public class Boxing extends MartialArts{
    private BoxingStance stance; // 1. 사우스포 or 2. 오소독스
    public Boxing(String name, int age, WeightClass weight, BoxingStance stance){
        super(name, age, weight);
        this.stance = stance;
    }

    public BoxingStance getStance(){
        return stance;
    }

    @Override
    public void printInfo(){
        System.out.println("[복싱 선수 아바타 생성 완료]");
        super.printInfo();
        System.out.println("스탠스: " + stance);
    }
}
