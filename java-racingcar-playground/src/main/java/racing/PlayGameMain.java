package racing;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PlayGameMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("경주할 자동차 이름을 입력하세요.");
        String carNames = scan.nextLine();
        
        System.out.println("시도할 횟수는 몇회인가요?");
        int tryNumber = scan.nextInt();
        
        PlayGame playGame = new PlayGame(carNames, tryNumber);
        while( !playGame.isGameEnd() ) {
            playGame.race();
            for (int i = 0; i < playGame.getCars().size(); i++) {
                System.out.print(playGame.getCars().get(i).getName() + " : " );
                for( int j =0; j < playGame.getCars().get(i).getPosition(); j++ ) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        List<Car> winners =  Winners.findWinners(playGame.getCars());
        
        StringBuilder sb = new StringBuilder();
        for( Car car : winners ) {
            sb.append(car.getName() + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println( sb.toString() + "가 최종 우승했습니다.");
    }
}
