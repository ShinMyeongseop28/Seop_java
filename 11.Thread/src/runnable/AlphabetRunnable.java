package runnable;

public class AlphabetRunnable implements Runnable{
	
	@Override
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
