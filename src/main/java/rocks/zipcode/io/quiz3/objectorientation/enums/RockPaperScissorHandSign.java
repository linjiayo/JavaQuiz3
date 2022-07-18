package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK ("PAPER", "SCISSOR"),
    PAPER ("SCISSOR", "ROCK"),
    SCISSOR ("ROCK", "PAPER");

    String weakness;
    String strength;

    RockPaperScissorHandSign(String weakness, String strength) {
        this.weakness = weakness;
        this.strength = strength;
    }

    public RockPaperScissorHandSign getWinner() {
        return RockPaperScissorHandSign.valueOf(this.weakness);
    }

    public RockPaperScissorHandSign getLoser() {
        return RockPaperScissorHandSign.valueOf(this.strength);
    }
}
