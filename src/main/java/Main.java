import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String name;
        int age;
        SportCategory event = null; //Enum (운동 종목)
        Athlete avatar;
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("|    아바타 생성하기    |");
        System.out.println("---------------------");

        System.out.print("이름 입력: ");
        name = sc.next();
        while (true) {
            System.out.print("나이 입력: ");
            age = sc.nextInt();

            if (age <= 0 || age > 150) {
                System.out.println("[오류] 나이는 1살부터 150살 사이로 입력해주세요.");
            } else {
                break;
            }
        }

        while(true) {
            System.out.println("------------------------------------");
            System.out.print("[종목 선택] 1. 격투기 | 2. 구기    : ");

            int inputEvent = sc.nextInt();

            if(inputEvent == 1){
                event = SportCategory.MARTIAL_ARTS;
                break;
            }
            else if(inputEvent == 2){
                event = SportCategory.BALL;
                break;
            }
            else{
                System.out.println("1, 2중 하나를 선택하세요.");
            }
        }

        if(event == SportCategory.MARTIAL_ARTS){
            MartialArtsType martialCate = null; // 격투기 enum
            System.out.println("< 격투기 선택 >");

            while(true){
                System.out.println("------------------------------------");
                System.out.print("[세부 종목 선택] 1. 복싱 | 2. 주짓수   : ");
                int cate = sc.nextInt();
                if(cate == 1){
                    martialCate = MartialArtsType.BOXING;
                    break;
                }
                else if(cate == 2){
                    martialCate = MartialArtsType.JIUJITSU;
                    break;
                }
                else{
                    System.out.println("1, 2 중 하나를 선택하세요.");
                }
            }

            WeightClass weight = null; // 체급
            while (true) {
                System.out.print("[체급 선택] 1. 플라이급 | 2. 미들급 | 3. 헤비급   : ");
                int tmp = sc.nextInt();

                if (tmp == 1) {
                    weight = WeightClass.FLY;
                    break;
                } else if (tmp == 2) {
                    weight = WeightClass.MIDDLE;
                    break;
                } else if (tmp == 3) {
                    weight = WeightClass.HEAVY;
                    break;
                } else {
                    System.out.println("1, 2, 3 중 하나를 선택하세요.");
                }
            }
            if( martialCate == MartialArtsType.BOXING) {
                BoxingStance stance = null;
                while(true){
                    System.out.print("[스탠스 선택] 1. 사우스포 | 2. 오소독스   : ");
                    int tmp = sc.nextInt();
                    if(tmp == 1){
                        stance = BoxingStance.SOUTHPAW;
                        break;
                    }
                    else if(tmp == 2){
                        stance = BoxingStance.ORTHODOX;
                        break;
                    }
                    else{
                        System.out.println("1, 2 중 하나를 선택하세요.");
                    }
                }
                avatar = new Boxing(name, age, weight, stance);
            }
            else{
                JiujitsuStyle style = null;
                while(true){
                    System.out.print("[스타일 선택] 1. 브라질리언 | 2. 유러피안   : ");
                    int tmp = sc.nextInt();
                    if(tmp == 1){
                        style = JiujitsuStyle.BRAZILIAN;
                        break;
                    }
                    else if(tmp == 2){
                        style = JiujitsuStyle.EUROPEAN;
                        break;
                    }
                    else{
                        System.out.println("1, 2 중 하나를 선택하세요.");
                    }
                }
                avatar = new Jiujitsu(name, age, weight, style);
            }
        }
        else {
            BallType type = null;
            System.out.println("< 구기 선택 >");
            while(true){
                System.out.println("------------------------------------");
                System.out.print("[세부 종목 선택] 1. 야구 | 2. 농구   : ");
                int tmp = sc.nextInt();
                if(tmp == 1){
                    type = BallType.BASEBALL;
                    break;
                }
                else if(tmp == 2){
                    type = BallType.BASKETBALL;
                    break;
                }
                else{
                    System.out.println("1, 2 중 하나를 선택하세요.");
                }
            }
            MainHand hand = null;
            while(true){
                System.out.print("[주손 선택] 1. 왼손잡이 | 2. 오른손잡이   : ");
                int tmp = sc.nextInt();

                if(tmp == 1){
                    hand = MainHand.LEFT;
                    break;
                }
                else if(tmp == 2){
                    hand = MainHand.RIGHT;
                    break;
                }
                else{
                    System.out.println("1, 2 중 하나를 선택하세요.");
                }
            }
            if(type == BallType.BASEBALL){
                BaseballPosition position = null;
                while(true){
                    System.out.print("[포지션 선택] 1. 투수 | 2. 타자   : ");
                    int tmp = sc.nextInt();
                    if(tmp == 1){
                        position = BaseballPosition.PITCHER;
                        break;
                    }
                    else if(tmp == 2){
                        position = BaseballPosition.BATTER;
                        break;
                    }
                    else{
                        System.out.println("1, 2 중 하나를 선택하세요.");
                    }
                }
                avatar = new Baseball(name, age, hand, position);
            }
            else{
                BasketballPosition position = null;
                while(true){
                    System.out.print("[ 포지션 선택 ] 1. 가드 | 2. 포워드 | 3. 센터   :");
                    int tmp = sc.nextInt();

                    if(tmp == 1){
                        position = BasketballPosition.GUARD;
                        break;
                    }
                    else if(tmp == 2){
                        position = BasketballPosition.FORWARD;
                        break;
                    }
                    else if(tmp == 3){
                        position = BasketballPosition.CENTER;
                        break;
                    }
                    else{
                        System.out.println("1, 2, 3 중 하나를 선택하세요.");
                    }
                }
                avatar = new Basketball(name, age, hand, position);
            }
        }
        System.out.println("====================================");
        avatar.printInfo();
        System.out.println("====================================");
    }
}