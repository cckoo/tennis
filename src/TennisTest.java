import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chengwei07 on 2015-11-06.
 */
public class TennisTest {
    private Tennis tennis = new Tennis();
    @Test
    public void startLoveAll() {
        assertScoreEqualsWith("Love All");
    }
    @Test
    public void FifteenLove() {
        tennis.p1GetScore();
        assertScoreEqualsWith("Fifteen Love");
    }

    private void assertScoreEqualsWith(String scoreText) {
        assertEquals(scoreText, tennis.scoreText());
    }
}
