package racing;

import java.util.List;
import java.util.Scanner;

public class PlayGameMain {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scan.nextLine();
        
        System.out.println("시도할 회수는 몇회인가요?");
        int tryNumber = scan.nextInt();
        
        PlayGame playGame = new PlayGame(carNames, tryNumber);
        scan.close();
        
        StringBuilder builder = new StringBuilder();
        builder.append("실행 결과").append(System.lineSeparator());
        
        List<Car> cars = playGame.getCars();
        for (int i = 0; i < tryNumber; i++) {
            playGame.race();
            PlayGameUtils.getResultPerRace(cars, builder);
        }
        
        List<Car> winners = Winners.findWinners(cars);
        for( Car car : winners ) {
            builder.append(car.getName()).append(", ");
        }
        
        builder.delete(builder.length() -2, builder.length());
        builder.append("가 최종 우승했습니다.");
        
        System.out.println( builder.toString() );
                
    }
}
