import org.junit.Test;

/**
 * Created by chengwei07 on 2015-11-06.
 */
public class TennisTest {
    @Test
    public void startLoveAll() {
        Tennis tennis = new Tennis();
        assertEquals("Love All", tennis.scoreText());
    }

}
