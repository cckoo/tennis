/**
 * Created by chengwei07 on 2015-11-06.
 */
public class StartGame implements MatchScore {
    @Override
    public String scoreText() {
        return "Love All";
    }

    @Override
    public MatchScore p1GetScore() {
        return new PlayerScore("Fifteen");
    }
}
