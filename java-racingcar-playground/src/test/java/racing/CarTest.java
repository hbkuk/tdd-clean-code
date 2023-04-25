package racing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

public class CarTest {
    
    @Test
    void car_생성_공백() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {Car car = new Car("");})
                .withMessageMatching("1글자 이상을 입력해야 합니다.");
    }
    
    @Test
    void car_생성_5글자_이하() {
        Car car = new Car("pobi");
    }
    
    @Test
    void car_생성_5글자_초과() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {Car car = new Car("braaaa");})
                .withMessageMatching("5글자를 초과할 수 없습니다.");
    }
    
    @Test
    void car_전진_4이상의_값이_주어짐() {
        Car car = new Car("pobi");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }
    
    @Test
    void car_정지_4미만의_값이_주어짐() {
        Car car = new Car("pobi");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }
}
