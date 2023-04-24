package racing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 자동차_5글자_이하_이름_생성() {
        Car car = new Car("pobi");
    }
    
    @Test
    void 자동차_5글자_초과_이름_생성시_Exception_발생() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {Car car = new Car("qudrnr");})
                .withMessageMatching("자동차의 이름이 5글자를 초과할 수 없습니다.");
    }
    
    @Test
    void 자동차_전진() {
        Car car = new Car("pobi");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }
    
    @Test
    void 자동차_정지() {
        Car car = new Car("pobi");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }
    
    @Test
    void 자동차_전진_레거시_리팩토링() {
        Car car = new Car("pobi");
        car.move(new MovingStrategy() { 
            @Override
            public boolean movable() {
                return true;
            }
        });
        assertThat(car.getPosition()).isEqualTo(1);
    }
    
    @Test
    void 자동차_정지_레거시_리팩토링() {
        Car car = new Car("pobi");
        car.move(new MovingStrategy() {
            @Override
            public boolean movable() {
                return false;
            }
        });
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
