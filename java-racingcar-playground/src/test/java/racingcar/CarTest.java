package racingcar;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void Car_이름_5글자_이하() {
        Car car = new Car("crong");
    }
    
    @Test
    void Car_이름_5글자_초과() {
        assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> {Car car = new Car("crongc");})
        .withMessageMatching("차의 이름을 5글자를 초과할 수 없습니다.");
    }

}
