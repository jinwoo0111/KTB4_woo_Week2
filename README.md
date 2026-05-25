### 풀스택 1주차 과제

속성, 메소드, 상속을 알아보기 위한 과제 주제로 '운동 선수 아바타 만들기 프로그램을 제작하였다.

#### 클래스 상속 구조
1. Athelete
2. MartialArts (투기 종목) , Ball(구기 종목)
3. MartialArts 상속 -> Boxing(복싱), Jiujitsu(주짓수) / Ball 상속 -> Baseball(야구), Basketball(농구)

#### 객체별 속성
Athlete
 name : String (아바타 이름)
 age : int (아바타 나이)

MartialArts (투기)
 size : String (체급 - 플라이급/미들급/헤비급)

Boxing (복싱)
 stance : String (스탠스 : 사우스포/오소독스)

Jiujitsu (주짓수)
 style : String (스타일 : 브라질리언/유러피안)

Ball (구기)
 handed : String (주손 - 왼손잡이 / 오른손잡이)

Baseball(야구)
 pos : String (포지션 - 투수/타자)

Basketball(농구)
 pos : String (포지션 - 가드/포워드/센터)

#### 결과
<img width="442" height="1092" alt="image" src="https://github.com/user-attachments/assets/98959885-30fb-406d-ac01-aa077deae2ce" />


#### 회고
최근에 코딩 테스트를 준비하며 절차지향으로만 코드를 작성해와서, 개발을 위한 코딩을 오랜만에 해보았다. 
객체지향적 관점에서 코드를 작성하는 것이 어색해서 주제를 선정하고 구현하는데 시간이 좀 걸렸다. 다 작성하고 보니, 
변수들에 대한 상속은 있는데 동작에 대한 상속을 생각하지 못했다. 이 부분에 대해서 적응과 공부가 더 필요해 보인다.

