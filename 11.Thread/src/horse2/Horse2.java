package horse2;

//Thread 클래스를 상속받아 Horse 클래스 선언
public class Horse2 extends Thread{
	String name;
	int no;
	ShareRank share;

	public Horse2(String name, int no, ShareRank share) {
		this.name = name;
		this.no = no;
		this.share = share;
	}

	@Override
	public void run() {
		//100미터 달리기
		//20미터 간격으로 현재 지나치는 지점과 경주마 이름 출력하기
		//20미터 통과시마다 1초정도 sleep(1000) 지정하기
		for(int m=0; m<=100; m+=20) {
			if(m==0) {
				System.out.printf("%d번 경주마[%s] 막 출발!\n", no, name);
				
			}else if(m==100) {
				//100미터 지점을 통과하면 어떤 경주마가 몇 등으로
				synchronized(share) {
					++share.rank;
					System.out.printf("%d위 %d번 말 [%s]\n", share.rank, no, name);
					
				}
			}else {
				System.out.printf("현재 %dM 지점 통과 %d번 경주마 [%s]\n", m, no, name);
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
	}

}
