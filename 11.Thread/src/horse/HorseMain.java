package horse;

public class HorseMain {

	public static void main(String[] args) {
		ShareData share = new ShareData();
		
		Horse h1 = new Horse(share, "강철여걸");
		Horse h2 = new Horse(share, "마하비상");
		Horse h3 = new Horse(share, "당대초월");
		Horse h4 = new Horse(share, "빛의순간");
		Horse h5 = new Horse(share, "청산질주");
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}
	
	

}
