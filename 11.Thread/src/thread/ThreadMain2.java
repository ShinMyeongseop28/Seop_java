package thread;

public class ThreadMain2 {

	public static void main(String[] args) {
		Thread alphabet = new AlphabetThread();
		Thread digit = new DigitThread();
		
		alphabet.start();
		digit.start();
		
		System.out.println("main thread finished");
	}

}
