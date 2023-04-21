package racingcar;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. 이름 입력 
        System.out.println( "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)." );
        String names = scan.nextLine();
        Cars cars = new Cars( CarsGenerateUtils.toList(names) );
        
        // 2. 시도 횟수 입력
        System.out.println( "시도할 회수는 몇회인가요?" );
        int tryNumber = Integer.parseInt( scan.nextLine() );
        scan.close();
        
        // 3-1. 경주 시도
        StringBuilder stringBuilder = new StringBuilder();
        
        Random random = new Random();
        stringBuilder.append( "실행결과\n" );
        for (int i = 0; i < tryNumber; i++) {
            for( Car car : cars.getCars() ) {
              int randomNumber = random.nextInt(8) + 1;
              car.move(randomNumber);
            }
            // 3-2. 매회 출력
            List<String> hyphens =
                    Result.getHyphenPerPosition(cars);
            for (int j = 0; j < cars.getCars().size(); j++) {
                stringBuilder.append( cars.getCars().get(j).getName() + " : " + hyphens.get(j) + "\n" );
            }
            stringBuilder.append("\n");
        }
        
        // 4. 결과 정리
        List<Car> winningCars = 
                Result.getWinningCars(cars);
        
        if( winningCars == null ) {
            stringBuilder.append( "우승자는 없습니다." );
            System.out.println( stringBuilder.toString() );
            return;
        }
        for( Car car : winningCars ) {
            stringBuilder.append(car.getName() + ",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("가 최종 우승했습니다.");
        System.out.println( stringBuilder.toString());
    }
}
