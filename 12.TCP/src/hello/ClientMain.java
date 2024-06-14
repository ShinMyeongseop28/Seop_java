package hello;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket client = null;
		DataOutputStream out = null;
		DataInputStream in = null;		
		Scanner scan = new Scanner(System.in);
		
		//서버의 IP로 약속된 포트를 통해 서버에게 요청하기
		try {
			client = new Socket("192.168.0.67", 8000);  // localhost == 127.0.0.1
			System.out.println("서버와 연결 완료");
			
//			OutputStream stream = client.getOutputStream();
//			// 내보낼 문자열 -> 바이트 변환해서 내보내기
//			new DataOutputStream(Stream);
			out = new DataOutputStream(client.getOutputStream());
			out.writeUTF(scan.nextLine());
			
			//서버가 보낸 메시지 출력하기
			in = new DataInputStream(client.getInputStream() );
			String msg = in.readUTF();
			System.out.println("서버로부터 수신> " + msg);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				out.close(); } catch (Exception e1) {}
			try {
				client.close(); } catch (Exception e) {}
		}
		
		scan.close();
	}

}
