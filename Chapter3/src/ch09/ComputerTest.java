package Chapter3.src.ch09;

public class ComputerTest {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        desktop.turnOff();

        MyNoteBook mynotebook = new MyNoteBook();
        mynotebook.typing();
    }
}
