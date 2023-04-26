## 1. 선길이 - 기능 요구사항 정리

- [O] 좌표는 (x,y) 형식으로 구분한다. ==> Coordinates
- [O] 좌표는 0보다 작은 값을 입력할 수 없다. ==> Coordinate 클래스 생성 시 유효성 검사 로직
- [O] 좌표는 정수로 최대 24까지 입력이 가능하다. ==> Coordinate 클래스 생성 시 유효성 검사 로직 
- [O] 입력범위를 초과하거나 정수를 입력하지 않은 경우 Exception이 발생한다. ==> Coordinate 클래스 생성 시 유효성 검사 로직 
- [O] 좌표값을 두 개 입력한 경우, 직선으로 간주한다. ==> Coordinates init()메서드 호출 시 확인
- [O] 직선인 경우 두 점 사이 거리를 계산 후 출력한다. ==> coordinates calculatorDistance

## 클래스 분리
1. Coordinate(좌표 하나)
    - 클래스변수
        - x
        - y
    - 생성자    
        - Coordinate(int x, int y)
        
2. Coordinates(좌표s)
    - 클래스변수
        - List<Coordinate>
        - Shape
    - 생성자
        - Coordinates(String line)

3. InputView(입력 UI)

4. ResultView(출력 UI)

## 2. 사각형 면적 - 기능 요구사항 정리

- [X] 좌표 값을 네개 입력한 경우, 네 점을 연결하는 사각형으로 간주. ==> Rectangle
- [X] 유효성 검사를 통해 뒤틀어진 사다리꼴, 마롬모는 아닌지(직사각형인지) 확인 ==> 비정상일 경우 Exception
- [X] 사각형인 경우 사각형의 넓이를 계산 후 출력한다. ==> double calculateArea()


        