package move;

public interface Label implements Changable{
	//라벨지에 출력할 문구
	String text;
	int width, height;
	String backgoround, foreground, font;
	
	label(String text, int width, int height, String background, String foreground, String font){
	this.text = text;
	this.width = width;
	this.height = height;
	this.background = background;
	this.foreground = foreground;
	this.font = font;
	}
	
	
	public void resize (int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	public void setBackgroundColor (String color) {
		this.backgoround = color;
	}
	
	public void setForegroundColor(String color) {
		this.foreground = color;
	}
	
	public void setFont (String font) {
		this.font = font;
		
		
	}

}
