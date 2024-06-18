package mail;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {
	
	void sendHtmlMail(String name, String email) {
		HtmlEmail mail = new HtmlEmail();
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		mail.setHostName("smtp.naver.com");
		mail.setAuthentication("dkrntm2714@naver.com", "@sksmscjswo151"); //보내는이의 메일서버에 로그인
		mail.setSSLOnConnect(true); //로그인버튼클릭
		
		try {
			//송신자
			mail.setFrom("dkrntm2714@naver.com", "쿠폰관리자");
			
			//수신자
			mail.addTo(email, name);
			
			//제목
			mail.setSubject("이벤트 쿠폰 당첨 메시지");
			
			//내용
			StringBuffer msg = new StringBuffer();
			msg.append("<h2>이벤트 쿠폰발급</h2>");
			msg.append("<strong>").append(name).append("</strong>님 당첨을 축하합니다!");
			msg.append("<div>50000캐쉬 쿠폰이 발급되었으니</div>");
			msg.append("<div><a href='https://www.naver.com/'>당사 사이트</a> 쿠폰함을 확인하세요.</div>");
			mail.setHtmlMsg(msg.toString());
			
			//파일 첨부하기
			EmailAttachment file = new EmailAttachment();
			file.setPath("C:\\Users\\HANUL\\Downloads\\SNL.zip");
			mail.attach(file);
			
			file = new EmailAttachment();
			file.setURL( new URL("https://img-s-msn-com.akamaized.net/tenant/amp/entityid/BB1okkon.img?w=768&h=512&m=6&x=211&y=173&s=256&d=256") );
			mail.attach(file);
			mail.send(); //메일보내기버튼 클릭
			
		} catch (EmailException e) {
		} catch (MalformedURLException e) {
		}
	}
	
	
	void sendMail(String name, String email) {
		//메일서버에 접속하기
		SimpleEmail mail = new SimpleEmail();
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		mail.setHostName("smtp.naver.com");  //메일서버지정
		mail.setAuthentication("dkrntm2714@naver.com", "@sksmscjswo151"); //보내는이 정보입력
		mail.setSSLOnConnect(true); //로그인 버튼 클릭
		
		//보내는이 정보 : 관리자
		try {
			mail.setFrom("dkrntm2714@naver.com", "한울자바 관리자");
			
			//받는이 정보
			mail.addTo(email, name);
//			mail.addTo(email, name);
			
			//메일제목
			mail.setSubject("이벤트 당첨 메시지");
			
			//메일내용
			StringBuffer msg = new StringBuffer();
			msg.append(name + " 고객님!\n ");
			msg.append("이벤트 당첨을 축하합니다!\n ");
			msg.append("이벤트 쿠폰이 발급되었습니다.\n ");
			msg.append("당사 사이트 쿠폰함을 확인하세요. ");
			mail.setMsg(msg.toString());
			
			//보내기 버튼 클릭
			mail.send();
			
		} catch (EmailException e) {
		}
	}

}
