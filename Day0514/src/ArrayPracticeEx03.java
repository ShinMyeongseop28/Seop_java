
public class ArrayPracticeEx03 {

	public static void main(String[] args) {
		
		String name[][] = {{"홍길동", "심청", "박문수"},{"Hong", "Sim", "Park"}};
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1)+"행: ");
			for(int j=0; j<name[i].length; j++) {
				System.out.print(name[i][j] + " ");
			}
			System.out.println();
		}
	}

}
