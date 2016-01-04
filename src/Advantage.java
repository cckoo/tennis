/**
 * Created by chengwei07 on 2015-11-06.
 */
public class Advantage implements MatchScore {
    private Player advantager;
    public Advantage(Player advantager) {
        this.advantager = advantager;
    }

    @Override
    public String scoreText() {
        return advantager + " Advantage";
    }

    @Override
    public MatchScore p1GetScore() {
        return (advantager.equals(Player.P1)) ? new WinScore(advantager) : new DeuceScore();
    }

    @Override
    public MatchScore p2GetScore() {
        return (advantager.equals(Player.P2)) ? new WinScore(advantager) : new DeuceScore();
    }
}

