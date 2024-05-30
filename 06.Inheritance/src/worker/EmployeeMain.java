package worker;

import java.text.DecimalFormat;

public class EmployeeMain {

	public static void main(String[] args) {
		//정규직 사원 홍길동, 연봉 2800만원, 보너스 300%
		RegularEmployee hong = new RegularEmployee("홍길동", "정규직", 280000000, 300);
		
		//비정규직 사원 박문수, 연봉 3200만원
		ContractEmployee park = new ContractEmployee("박문수", 32000000, "비정규직", 24);
		
		//일용직 사원 심청, 일당 10만원
		TemporaryEmployee sim = new TemporaryEmployee("심청", "일용직", 100000);
		sim.setWorkDays(15);
		//1,500,000
		employeeInfo(hong);
		employeeInfo(park);
		employeeInfo(sim);
	}
	
	static void employeeInfo(Employee worker) {
		DecimalFormat df = new DecimalFormat("###,###,###,000");
		System.out.println("사번: " + worker.employeeNo);
		System.out.println("사원명: " + worker.name);
		System.out.println("근로형태: " + worker.workType);
		System.out.println("월급여: " + df.format(worker.getMonthPay()));
		
	}

}
