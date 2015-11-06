/**
 * Created by chengwei07 on 2015-11-06.
 */
public class WinScore implements MatchScore {
    private String winer;
    public WinScore(String winer) {
        this.winer = winer;
    }

    @Override
    public String scoreText() {
        return winer + " Win";
    }

    @Override
    public MatchScore p1GetScore() {
        throw new IllegalStateException("GameOver");
    }

    @Override
    public MatchScore p2GetScore() {
        throw new IllegalStateException("GameOver");
    }
}
