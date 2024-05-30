package worker;

public class ContractEmployee {
	//사번 이름 급여(연봉) 근로형태 계약기간
	int period;
	ContractEmployee(String employeeNo, String name, int pay, String workType, int period) {
		super(employeeNo, name, workType, pay);
		this.period = period;
	}
	
	//월급여를 계산한다
	int getMonthPay() {
		return pay / 12;
	}

}
