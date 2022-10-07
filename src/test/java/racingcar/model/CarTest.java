package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

    @DisplayName("자동차 이름에 빈 문자열을 입력하면 예외가 발생한다. args={0}")
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", " ", "  "})
    void constructor_자동차_이름은_NULL이나_빈문자열이면_예외가_발생한다(String name) {
        Assertions.assertThatThrownBy(() -> new Car(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차 이름의 길이는 1이상 5이하여야 한다. 그렇지 않으면 예외가 발생한다. args={0}")
    @ParameterizedTest
    @ValueSource(strings = {"666666", "a1b2c3", ""})
    void constructor_자동차_이름의_길이는_1이상_5이하_여야한다_그렇지않으면_예외가_발생한다(String name) {
        Assertions.assertThatThrownBy(() -> new Car(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차의 이름의 길이가 1이상 5이하면 이름이 잘 부여된다.")
    @ParameterizedTest
    @ValueSource(strings = {"1", "22", "333", "4444", "55555", "a", "b2", "c33", "d444", "e5555"})
    void constructor_자동차_이름의_길이가_1이상_5이하면_자동차_이름이_부여된다(String name) {
        // when
        Car car = new Car(name);
        // then
        Assertions.assertThat(car.getName()).isEqualTo(name);
    }

    @DisplayName("자동차 이름 앞뒤에 빈 문자열이 있으면 예외가 발생한다. args={0}")
    @ParameterizedTest
    @ValueSource(strings = {" hi", "hi ", " hi "})
    void constructor_자동차_이름_앞뒤에_빈문자열이_오면_예외가_발생한다(String name) {
        Assertions.assertThatThrownBy(() -> new Car(name))
                .isInstanceOf(IllegalArgumentException.class);
    }


}