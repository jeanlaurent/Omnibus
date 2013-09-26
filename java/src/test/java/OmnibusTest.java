import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class OmnibusTest {


    @Test
    public void should_start_with_OPEN() {
        Omnibus omnibus = new Omnibus();
        assertThat(omnibus.next()).isEqualTo("OPEN");
    }

    @Test
    public void should_start_with_OPEN_CLOSE_UP() {
        Omnibus omnibus = new Omnibus();
        assertThat(omnibus.next()).isEqualTo("OPEN");
        assertThat(omnibus.next()).isEqualTo("CLOSE");
        assertThat(omnibus.next()).isEqualTo("UP");
    }

    @Test
    public void should_start_with_OPEN_CLOSE_UP_FIVE_TIME() {
        Omnibus omnibus = new Omnibus();
        for (int i = 0; i < 5; i++) {
            assertThat(omnibus.next()).isEqualTo("OPEN");
            assertThat(omnibus.next()).isEqualTo("CLOSE");
            assertThat(omnibus.next()).isEqualTo("UP");
        }
    }

    @Test
    public void should_goUPFiveTimes_thenGoDownFiveTimes() {
        Omnibus omnibus = new Omnibus();
        for (int i = 0; i < 5; i++) {
            assertThat(omnibus.next()).isEqualTo("OPEN");
            assertThat(omnibus.next()).isEqualTo("CLOSE");
            assertThat(omnibus.next()).isEqualTo("UP");
        }
        for (int i = 0; i < 5; i++) {
            assertThat(omnibus.next()).isEqualTo("OPEN");
            assertThat(omnibus.next()).isEqualTo("CLOSE");
            assertThat(omnibus.next()).isEqualTo("DOWN");
        }

    }

}
