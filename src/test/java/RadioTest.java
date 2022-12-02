import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void regular() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}

   // @Test
   // public void nextVolume() {
      //  Radio radio = new Radio();
       // radio.setCurrentVolume(6);

       // radio.next();

      //  int expected = 7;
      //  int actual = radio.getCurrentVolume();
      //  Assertions.assertEquals(expected, actual);
   // }

   // @Test
    //public void prevVolume() {
        //Radio radio = new Radio();
       // radio.setCurrentVolume(2);

        //radio.prev();

       // int expected = 1;
        //int actual = radio.getCurrentVolume();
       // Assertions.assertEquals(expected, actual);
   // }
//}

