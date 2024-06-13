package horse;

public class Horse extends Thread {
	ShareData share;
	String name;
	int seq;
	
	public Horse(ShareData share, String name) {
		this.share = share;
		this.name = name;
		this.seq = share.seq++;
	}

	@Override
	public void run() {
		for(int i=1; i<=4; i++) {
			System.out.printf("%d번말 %s이 %dm지점을 통과했습니다. \n", this.seq, this.name, i*20);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
		synchronized (share) {
			System.out.printf("%d번말 %s이 %d등으로 결승선에 도착했습니다.\n", this.seq, this.name, share.rank++);
		}
	}
	

}
