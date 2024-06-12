package thread;

public class AlphabetThread extends Thread {

	@Override
	public void run() {
		// 알파벳 문자를 출력하기
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(" Alphabet thread finished");
	}

}
