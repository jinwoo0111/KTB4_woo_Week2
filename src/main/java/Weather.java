import java.util.Random;

public class Weather implements Runnable{
    private String[] weathers = {"맑음", "흐림", "비", "눈"};
    private Random random = new Random();
    private Athlete avatar;

    public Weather(Athlete avatar){
        this.avatar = avatar;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(5000); // 5
                int index = random.nextInt(weathers.length);
                String currentWeather = weathers[index];
                avatar.setCurrentWeather(currentWeather);
                System.out.println("[현재 날씨] " + currentWeather); // 현재 날씨 출력
            } catch(InterruptedException e){
                System.out.println("[알림] 날씨 스레드가 종료되었습니다.");
                break;
            }
        }
    }
}
