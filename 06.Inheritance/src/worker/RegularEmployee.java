package worker;

public class RegularEmployee extends Employee {
	// 사번
	// 이름
	// 급여(연봉)
	// 근로형태
	// 보너스
	int bonus;
	public RegularEmployee(String name, String workType, int pay, int bonus) {
		super(name, workType, pay);
		this.bonus = bonus;
	}
	
	//월급여를 계산한다
	//(연봉 + 연봉*0.5)/12
	int getMonthPay() {
		return (int)(pay * (1+bonus*0.01) / 12);
	}

}
