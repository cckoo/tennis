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
        return nextMatchScore(p1Score.next(), p2Score);
    }

    @Override
    public MatchScore p2GetScore() {
        return nextMatchScore(p1Score, p2Score.next());
    }

    private MatchScore nextMatchScore(TennisScore p1Score, TennisScore p2Score) {
        if (p1Score.equals(p2Score)) {
            if (p1Score.equals(TennisScore.Forty))
                return new DeuceScore();
            return new DrawScore(p2Score);
        }
        if (p1Score.equals(TennisScore.GameOver))
            return new WinScore("P1");

        return new PlayerScore(p1Score, p2Score);
    }
}
