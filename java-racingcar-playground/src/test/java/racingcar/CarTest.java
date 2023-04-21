package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
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
    
    @Test
    void Car_move_4이상_증가함() {
        Car car = new Car("pobi");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }
    
    @Test
    void Car_move_4이하_증가안함() {
        Car car = new Car("pobi");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }

}
