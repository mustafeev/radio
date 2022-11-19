import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {
    private int currentVolume;

    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();
        cond.currentVolume = 2;
        int expected = 2;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }
}


