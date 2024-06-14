package thread;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		Socket client = null;
		
		try {
			client = new Socket("127.0.0.1", 8000);
			System.out.println("서버에 연결됨");
			
			Thread receive = new ReceiveThread(client);
			Thread send = new SendThread(client);
			receive.start();
			send.start();
			
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}
	}

}
