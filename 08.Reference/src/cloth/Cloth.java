package cloth;

public class Cloth {
	String code, name, material;
//	int season;
	Season season;
	
//	enum Season {
//		SPRING, SUMMER, FALL, WINTER
//	}
	
//	static final int SPRING = 1;
//	static final int SUMMER = 2;
//	static final int FALL = 3;
//	static final int WINTER = 4;
	
	public String toString() {
		StringBuffer content = new StringBuffer();
		content.append("의류코드: ").append(code);
		content.append("\t의류명: ").append(name);
		content.append("\t의류소재: ").append(material);
		content.append("\t착용계절: ").append(season.getName());
		return content.toString()
	}
	
	
	Cloth(String code, String name, String material, Season season) {
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}

}
