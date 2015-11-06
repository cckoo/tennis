/**
 * Created by chengwei07 on 2015-11-06.
 */
public class StartGame implements MatchScore {
    protected TennisScore p1Score = TennisScore.Love;
    protected TennisScore p2Score = TennisScore.Love;
    @Override
    public String scoreText() {
        return p1Score + " All";
    }

    @Override
    public MatchScore p1GetScore() {
        return new PlayerScore(p1Score.next(), p2Score);
    }

    @Override
    public MatchScore p2GetScore() {
        return new PlayerScore(p1Score, p2Score.next());
    }
}
