package objectIO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonMain {

	public static void main(String[] args) {
		String filename = "person";
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream(filename));
			Person hong = new Person("홍길동", "남", 30);
			out.writeObject(hong);
			out.writeObject(new Person("심청", "여", 20));
			
		} catch (IOException e) {
		} finally {
			try { out.close(); }catch (Exception e) {}
		}
		System.out.println("쓰기 완료");
		
		ObjectInputStream in = null;
		
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
			while(true) {
				Person person = (Person)in.readObject();
				System.out.printf("성명:%s 성별:%s 나이:%d\n", 
						person.name, person.gender, person.age);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일없음> " + e.getMessage());
		} catch (EOFException e) {
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		} finally {
			if( in!=null ) {
				try { in.close(); }catch (Exception e) {}
			}
		}
	}

}
