package Chapter3.CH09;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop();
		// Computer 클래스에 있는 메서드 사용
		computer.display();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
		myNote.typing();
		myNote.display();
	}
}