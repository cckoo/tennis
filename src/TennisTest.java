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
    @Test
    public void FortyLove() {
        p1GetScores(3);
        assertScoreEqualsWith("Forty Love");
    }
    @Test
    public void FifteenAll() {
        drawScore(1);
        assertScoreEqualsWith("Fifteen All");
    }
    @Test
    public void ThirtyAll() {
        drawScore(2);
        assertScoreEqualsWith("Thirty All");
    }
    @Test
    public void Deuce() {
        deuce();
        assertScoreEqualsWith("Deuce");
    }
    @Test
    public  void p1Advantage() {
        p1AdvantageScore();
        assertScoreEqualsWith("P1 Advantage");
    }
    @Test
    public void p2Advantage() {
        p2AdvantageScore();
        assertScoreEqualsWith("P2 Advantage");
    }
    @Test
    public void p1AdvantageP2getScoreIsDeuce() {
        p1AdvantageScore();
        tennis.p2GetScore();
        assertScoreEqualsWith("Deuce");
    }
    @Test
    public void p2AdvantageP1getScoreIsDeuce() {
        p2AdvantageScore();
        tennis.p1GetScore();
        assertScoreEqualsWith("Deuce");
    }

    private void assertScoreEqualsWith(String scoreText) {
        assertEquals(scoreText, tennis.scoreText());
    }

    private void p1GetScores(int times) {
        while (times-- > 0)
            tennis.p1GetScore();
    }

    private void p2GetScores(int times) {
        while (times-- > 0)
            tennis.p2GetScore();
    }

    private void drawScore(int score) {
        p1GetScores(score);
        p2GetScores(score);
    }

    private void deuce() {
        drawScore(3);
    }

    private void p1AdvantageScore() {
        deuce();
        tennis.p1GetScore();
    }

    private void p2AdvantageScore() {
        deuce();
        tennis.p2GetScore();
    }
}
