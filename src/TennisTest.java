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
        p1GetScores(1);
        assertScoreEqualsWith("Fifteen Love");
    }
    @Test
    public void ThirtyLove() {
        p1GetScores(2);
        assertScoreEqualsWith("Thirty Love");
    }

    private void assertScoreEqualsWith(String scoreText) {
        assertEquals(scoreText, tennis.scoreText());
    }

    private void p1GetScores(int times) {
        while (times-- > 0)
            tennis.p1GetScore();
    }
}
