package coordinatecalculator.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PointValueTest {
    @Test
    void 올바른_X좌표_생성_확인_테스트() {
        assertThat(new PointValue(6).getValue()).isEqualTo(6);
    }

    @Test
    void 옳바르지_않은_X좌표가_들어올때_테스트() {
        assertThrows(IllegalArgumentException.class, () -> new PointValue(25));
    }

    @Test
    void X좌표가_음수가_들어올때_테스트() {
        assertThrows(IllegalArgumentException.class, () -> new PointValue(-1));
    }
}
