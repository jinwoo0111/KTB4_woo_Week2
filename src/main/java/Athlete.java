public class Athlete {
    private String name;
    private int age;

    // 생성자
    public Athlete(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 선수 이름 getter
    public String getName(){
        return name;
    }

    // 선수 나이 getter
    public int getAge(){
        return age;
    }

    // 선수 정보 출력
    public void printInfo(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}
