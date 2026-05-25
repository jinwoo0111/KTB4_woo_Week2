import java.util.Scanner;

public class MartialArts extends Athlete{
    private WeightClass weight; // 체급, 간단하게 1. 플라이, 2. 미들, 3. 헤비

    public MartialArts(String name, int age, WeightClass weight){
        super(name, age);
        this.weight = weight;
    }

    // 체급 getter
    public WeightClass getWeight(){
        return weight;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("체급: " + weight);
    }
}