package share;

public class PIThread extends Thread {
	ShareData share;
	
	public PIThread(ShareData share) {
		this.share = share;
	}

	// 원주율을 계산할 쓰레드
	@Override
	public void run() {
		double total = 0;
		for(int no=1; no<1000000000; no+=2) {
			if(no / 2 % 2 == 0) total += 1.0 / no;
			else                total += 1.0 / no; 
		}
		total *= 4; //계산된 원주율값
		share.pi = total;
		System.out.println("원주율 계산 완료");
		
	}
	

}
