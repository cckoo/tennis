/**
 * Created by chengwei07 on 2015-11-06.
 */
public enum TennisScore {
    GameOver(null), Forty(GameOver), Thirty(Forty), Fifteen(Thirty), Love(Fifteen);

    final TennisScore next;

    TennisScore(TennisScore next) {
        this.next = next;
    }

    TennisScore next() {
        return next;
    }
}
