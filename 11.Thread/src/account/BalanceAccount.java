package account;

public class BalanceAccount extends Thread {
	ShareAccount share;
	
	public BalanceAccount(ShareAccount share) {
		this.share = share;
	}
	@Override
	public void run() {
		//두 통장의 잔고의 합계는 늘 같다
		for(int no=1; no<=5; no++) {
			synchronized (share) {
				int sum = share.hong.balance + share.park.balance;
				System.out.println("두 통장 잔고합계: " + sum);				
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
	

}
