package move;

public class LabelMain {

	public static void main(String[] args) {
		Label label = new Label("반란군 한신우", 200, 80, "yellow", "blue", "맑은고딕");
		info(label);
		
		label.resize(30, 500);
		label.setForgroundColor("")
	}
	static void info(Label label) {
		System.out.printf("%s : %d X %d 배경색(%s) 전경색(%s) 폰트(%s)", label.text, label.width, label.height,
				label.backgoround, label.foreground, label.font);
		System.out.println();
	}

}
