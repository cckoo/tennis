/**
 * Created by chengwei07 on 2015-11-06.
 */
public class PlayerScore extends StartGame {
    public PlayerScore (TennisScore score) {
        this.score = score;
    }
    @Override
    public String scoreText() {
        return score + " Love";
    }
}
