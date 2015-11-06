/**
 * Created by chengwei07 on 2015-11-06.
 */
public class Tennis {

    MatchScore score = new StartGame();

    public String scoreText() {
        return score.scoreText();
    }

    public void p1GetScore() {
        score = score.p1GetScore();
    }

    public void p2GetScore() {
        score = score.p2GetScore();
    }
}
