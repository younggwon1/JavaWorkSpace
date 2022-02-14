package Chapter6.CH09;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
    	try (obj){
    		// Exception 강제 발생
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외 부분 입니다");
		}
	}
}