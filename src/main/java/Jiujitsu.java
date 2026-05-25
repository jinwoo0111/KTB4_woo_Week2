import java.util.Scanner;

public class Jiujitsu extends MartialArts{
    private JiujitsuStyle style; // 1. 브라질리언, 2. 유러피안
    public Jiujitsu(String name, int age, WeightClass weight, JiujitsuStyle style){
        super(name, age, weight);
        this.style = style;
    }

    public JiujitsuStyle getStyle(){
        return style;
    }

    @Override
    public void printInfo(){
        System.out.println("[주짓수 선수 아바타 생성 완료]");
        super.printInfo();
        System.out.println("스타일: " + style);
    }
}
