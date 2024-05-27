package Day0527;

public class Limit {
	//final : 대문자로 명명
	static final int UPPER = 100000;
	int no;
	//어떤 수가 상한을 넘어서면 상한으로 지정하자.
	void setNo(int no) {
		if(no >UPPER)
			this.no = UPPER;
		this.no = no;
	}

}
