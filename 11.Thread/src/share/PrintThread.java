package share;

public class PrintThread extends Thread {
	ShareData share;
	
	public PrintThread(ShareData share) {
		this.share = share;
	}

	@Override
	public void run() {
		if(! share.finished) {
			try {
				//notify 가 오기를 기다리자
				synchronized (share) {
					share.wait();
				}
			} catch (InterruptedException e) {
			}			
		}
		// 원주율 출력
		System.out.println("원주율: " + share.pi);
	}

}
