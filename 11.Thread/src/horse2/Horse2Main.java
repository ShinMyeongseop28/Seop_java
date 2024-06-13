package horse2;

import horse.Horse;

public class Horse2Main {

	public static void main(String[] args) {
		ShareRank share = new ShareRank();
		
		Horse2 h1 = new Horse2("강철여걸", 1, share);
		Horse2 h2 = new Horse2("마하비상", 2, share);
		Horse2 h3 = new Horse2("당대초월", 3, share);
		Horse2 h4 = new Horse2("빛의순간", 4, share);
		Horse2 h5 = new Horse2("청산질주", 5, share);

		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}

}
