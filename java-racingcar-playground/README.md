## 기능 요구사항
- 자동차 이름(Name)은 5글자를 초과할 수 없다.
    * case 1) "pobi" ===> 가능!
    * case 2) "braaaa" ===> 불가능!
- 자동차 이름을 문자열로 전달하며, 쉼표(,)로 구분한다.
    * case 1) "pobi,crong,honux"
- 자동차는 전진, 정지만 가능하며, 4 이상일 경우 전진, 4 미만일 경우 정지이다.
    * case 1) car.move(3) ===> Stop
    * case 2) car.move(4) ===> Forward
- 우승자를 찾는다. 단, 여러명일 경우 모두 다 출력한다.
    * case 1) "pobi,crong"
    
    
## 클래스 설계
- Car
    - 지역변수
        - 이름(name), 위치(position)
    - 메서드
        - void move(int number), int getRandomNumber();
- Winners
    - 메서드
        - static List<Car> findWinners(List<Car>)

- PlayGame
    - 지역변수
        - 자동차 목록(List<Car>), 시도횟수(tryNumber)
    - 메서드
        - List&#60;Car&#62; initCars(String carNames) : 문자열을 입력받아 차의 리스트를 리턴하는 메서드
        - boolean isGameEnd(): 게임이 종료되었는지 확인하는 메서드
        - void race() : 1 라운드를 진행하는 메서드
    