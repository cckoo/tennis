/**
 * Created by chengwei07 on 2015-11-06.
 */
public class PlayerScore implements MatchScore {
    private TennisScore p1Score;
    private TennisScore p2Score;

    public PlayerScore (TennisScore p1Score, TennisScore p2Score) {
        this.p1Score = p1Score;
        this.p2Score = p2Score;
    }
    @Override
    public String scoreText() {
        return p1Score + " " + p2Score;
    }

    @Override
    public MatchScore p1GetScore() {
        if (isDraw(p1Score.next(), p2Score))
            return new DrawScore(p2Score);

        return new PlayerScore(p1Score.next(), p2Score);
    }

    @Override
    public MatchScore p2GetScore() {
        if (isDraw(p1Score, p2Score.next()))
            return new DrawScore(p1Score);

        return new PlayerScore(p1Score, p2Score.next());
    }

    private Boolean isDraw(TennisScore p1Score, TennisScore p2Score) {
        return p1Score.equals(p2Score);
    }
}
