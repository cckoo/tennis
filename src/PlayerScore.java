/**
 * Created by chengwei07 on 2015-11-06.
 */
public class PlayerScore implements MatchScore {
    private String score;
    public PlayerScore (String score) {
        this.score = score;
    }
    @Override
    public String scoreText() {
        return score + " Love";
    }

    @Override
    public MatchScore p1GetScore() {
        return new PlayerScore("Thirty");
    }
}
