package Chapter3.src.ch16.player;

public class Player {
    PlayerLevel level;
    public Player(PlayerLevel level) {
        this.level = level;
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }
    public void play(int count) {
        level.go(count);
    }
}
