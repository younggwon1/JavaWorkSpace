package Chapter3.CH09;

public abstract class NoteBook extends Computer{
	
	// 상위 클래스의 추상 메서드를 하위 클래스에서 모두 구현을 안하면(추상 메서드의 일부만 구현)
	// 하위 클래스는 추상 클래스가 된다 (abstract class)
	@Override
	public void typing() {
		System.out.println("NoteBook typing");		
	}
}