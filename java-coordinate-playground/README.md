# 자표 계산기

## 기능 요구사항 정리

### 선길이 요구사항
1. 좌표정보는 "(x,y)" 형식으로 전달한다.
   - ex) (10,10)-(14,15)
2. 좌표값 x, y는 24를 초과할 수 없다.
3. 입력 범위를 초과하면 에러 문구를 출력하고 재 입력
4. 정상 좌표 입력 시, 해당 좌표 표시
5. 좌표값이 2개인 경우 직선으로 가정
6. 직선인 경우 두 점 사이 거리 계산 가능

### 클래스 분리
1. Point 클래스

2. Points 클래스

3. InputView 클래스

4. ResultView 클래스


# 연료주입
## 기능 요구사항 정리
1. 차량의 종류와 개수
   - Sonata : 2대
   - Avante : 1대
   - K5 : 2대
2. 여행할 이동거리(distanceToTravel)를 입력
3. 차랑별 연비(fuelEfficiency) 가정
   - Sonata : 10 km/리터
   - Avante : 15 km/리터
   - K5 : 13 km/리터
4. 차량별 주입해야 할 연료량(injectedFuelAmount) 산출
---
## 클래스 구성
1. RentCompany
   - 클래스변수
      - private List<Car> cars
   - 메서드
      - static create() ==> 클래스 변수 cars를 초기화한다.
      - addCar(new Car( double distanceToTravel )) ==> 생성한 Car를 List에 추가한다.
      - generateReport() ==> cars를 순회하면서 주입해야 할 연료량을 가져온다.

2. Car
   - 메서드(추상)
      - double fuelEfficiency();
      - double getDistanceToTravel();
      - double getInjectedFuelAmount();
      - String getName();

3. 구현 클래스(Sonata, K5, Avante)
   - 추상 메서드 구현
     
