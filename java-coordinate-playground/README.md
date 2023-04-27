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
     
