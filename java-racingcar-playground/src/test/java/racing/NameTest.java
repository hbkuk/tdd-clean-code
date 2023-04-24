package racing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class NameTest {
    
    @Test
    void create() {
        Name name = new Name("pobi");
        assertThat(name).isEqualTo(new Name("pobi"));
    }
}
