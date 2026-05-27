public class Athlete {
    private String name;
    private int age;
    private int hp; // 선수 체력
    private String currentWeather;

    // 생성자
    public Athlete(String name, int age){
        this.name = name;
        this.age = age;
        hp = 100; // 초기값 100
    }

    // 선수 이름 getter
    public String getName(){
        return name;
    }

    // 선수 나이 getter
    public int getAge(){
        return age;
    }

    // 선수 체력 getter
    public int getHp(){
        return hp;
    }

    //선수 체력 setter
    public void setHp(int hp){
        this.hp = hp;
    }

    //현재 날씨 getter
    public String getCurrentWeather(){
        return currentWeather;
    }

    //현재 날씨 setter
    public void setCurrentWeather(String currentWeather){
        this.currentWeather = currentWeather;
    }

    // 선수 정보 출력
    public void printInfo(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    // 선수 기초 훈련
    public void training(){
        hp -= 5;
        System.out.println("[훈련] 기초 훈련 중...(현재 HP: " + hp + ")");
    }

    // 선수 음식 먹기
    public void eating(){
        hp += 20;
        if(hp > 100){
            hp = 100; // 최대 체력 100 고정
        }
        System.out.println("[식사] 체력 회복 중...(현재 HP: " + hp + ")");
    }
}
