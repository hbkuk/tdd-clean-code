## 기능 요구사항 정리

- [X] 좌표는 (x,y) 형식으로 구분한다. ==> Coordinate
- [X] 좌표는 정수로 최대 24까지 입력이 가능하다. ==> 지역변수 x,y를 클래스로 분리 후 유효성 검사 로직? 
- [X] 입력범위를 초과하거나 정수를 입력하지 않은 경우 Exception이 발생한다. ==> 지역변수 x,y를 클래스로 분리 후 유효성 검사 로직? 
- [X] 좌표값을 두 개 입력한 경우, 직선으로 간주한다. ==> InputView(입력 UI)에서 확인할 것.
- [X] 직선인 경우 두 점 사이 거리를 계산 후 출력한다. ==> coordinate calculator

## 클래스 분리

1. Coordinate(좌표)
    - 클래스변수
        - x
        - y
    - 생성자    
        - Coordinate(int x, int y)
    - 메서드
        - ?
        
2. Straight(직선)
    - 클래스변수
        - List<Coordinate>
    - 생성자
        - Straight( Coordinate x, Coordinate y )
    - 메서드
        - double calculateDistance();

3. InputView(입력 UI)

4. ResultView(출력 UI)

5. StringUtils(입력 받은 좌표 정보 분리)
    - 메서드
        - split()


        