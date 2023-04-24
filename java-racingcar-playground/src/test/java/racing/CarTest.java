package racing;

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
}
