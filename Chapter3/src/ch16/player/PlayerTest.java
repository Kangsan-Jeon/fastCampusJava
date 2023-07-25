package Chapter3.src.ch16.player;

public class PlayerTest {
    public static void main(String[] args) {

        BeginnerLevel bLevel = new BeginnerLevel();
        AdvancedLevel aLevel = new AdvancedLevel();
        SuperLevel sLevel = new SuperLevel();

        Player player1 = new Player(bLevel);
        player1.play(1);

        player1.upgradeLevel(aLevel);
        player1.play(2);

        player1.upgradeLevel(sLevel);
        player1.play(3);
    }
}
