/**
 * Created by chengwei07 on 2015-11-06.
 */
public class StartGame implements MatchScore {
    protected TennisScore score = TennisScore.Love;
    @Override
    public String scoreText() {
        return score + " All";
    }

    @Override
    public MatchScore p1GetScore() {
        return new PlayerScore(score.next());
    }
}
