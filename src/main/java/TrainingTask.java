public class TrainingTask implements Runnable{
    private Athlete avatar;

    public TrainingTask(Athlete avatar){
        this.avatar = avatar;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1500); // 1.5초

                if(avatar.getHp() <= 0){ // 체력 0보다 낮으면 식사 대기
                    avatar.setHp(0);
                    System.out.println("[체력 고갈] 체력이 부족하여 기초 훈련을 일시 중단합니다. (현재 HP: " +  avatar.getHp() + ")");
                    System.out.println("[식사 필요] " + avatar.getName() + "에게 식사를 제공하세요.");
                    continue;
                }

                String currentWeather = avatar.getCurrentWeather();

                //currentWeather가 null인 순간으로 NullPointException 발생
                if(currentWeather == null){
                    continue;
                }

                if(currentWeather.equals("비") || currentWeather.equals("눈")){
                    System.out.println("[기상 악화] " + currentWeather + "(으)로 인해 기초 훈련을 취소하고 식사를 합니다.");
                    avatar.eating();
                    continue;
                }
                else{
                    avatar.training();
                }

            } catch (InterruptedException e){
                System.out.println("기초 훈련 강제 종료");
                break;
            }
        }
    }
}
