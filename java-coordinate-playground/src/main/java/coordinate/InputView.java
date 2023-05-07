package coordinate;

import java.util.Scanner;

public class InputView {
    public static Scanner scanner = new Scanner(System.in);

    public static Points input() {
        while (true) {
            try {
                System.out.println("좌표를 입력하세요.");
                String line = scanner.nextLine();
                Points points = new Points(line);
                return points;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
