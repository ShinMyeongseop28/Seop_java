package list;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		String texts[] = new String[2];
		
		ArrayList<String> list = new ArrayList<String>();
		//저장
		list.add("자바");
		list.add("오라클");
		System.out.println(list.size());
		//조회
		System.out.println(list.get(1));
		
		//중간 삽입저장
		list.add(1,"HTML");
		System.out.println(list.size());
		for(int idx=0; idx<list.size(); idx++) {
			System.out.println(idx + ". " + list.get(idx));
		}
		
		//삭제
		list.remove(0);
		//조회
		for(String subject : list) {
			System.out.println(subject);
		}
		
		//변경
		list.set(1, "자바");
		//조회
		for(String subject : list) {
			System.out.println(subject);
		}
		System.out.println("--------------");
		
		//삭제
		list.remove("HTML");
		//조회
		for(String subject : list) {
			System.out.println(subject);
		}
	}

}
