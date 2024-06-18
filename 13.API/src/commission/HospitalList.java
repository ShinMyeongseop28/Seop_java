package commission;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class HospitalList {
	void display() {
		// https://api.odcloud.kr/api/apnmOrg/v2/list?
		// page=1
		// &perPage=10
		// &serviceKey=data-portal-test-key

		StringBuffer url = new StringBuffer("https://api.odcloud.kr/api/apnmOrg/v2/list?");
		url.append("page=").append(1);
		url.append("&perPage=").append(20);
		url.append("&serviceKey=").append("data-portal-test-key");
		// http통신으로 데이터요청하기
		String response = requestAPI(url);
		// json형태의 문자열을 json 타입으로 변환
		JSONObject json = new JSONObject(response);
		JSONArray list = json.getJSONArray("data");

		// viewConsole(list); //콘솔에 출력해보기
		viewHtml(list); // html 페이지에 출력하기
	}

	void viewHtml(JSONArray list) {
		String path = "D:/io/hospital2/";
		File dir = new File(path);
		if (!dir.exists())
			dir.mkdirs();

		String filename = "list2.html";

		PrintWriter writer = null;
		String lunchstt;
		String lunchend;
		try {
			writer = new PrintWriter(path + filename);
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h2>코로나19 예방접종 위탁의료기관</h2>");
			writer.print("<table border='1'>");
			writer.print("<colgroup><col width='300px'>" + "<col width='150px'><col width='400px'>"
					+ "<col width='150px'>" + "<colgroup>");
			writer.print("<tr><th>의료기관명</th><th>전화번호</th><th>주소</th><th>점심시간</th></tr>");

			for (int idx = 0; idx < list.length(); idx++) {
				JSONObject json = list.getJSONObject(idx);
				lunchstt = json.get("lunchSttTm").toString();
				lunchend = json.get("lunchEndTm").toString();
				writer.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>", json.getString("orgnm"),
						json.getString("orgTlno"), json.getString("orgZipaddr"),
						lunchstt.equals("null") ? "없음"
								: (lunchstt.substring(0, 2) + ":" + lunchstt.substring(2) + "~"
										+ lunchend.substring(0, 2) + ":" + lunchend.substring(2)));
			}

			writer.print("</table>");
			writer.print("</body>");
			writer.print("</html>");
		} catch (IOException e) {
		} finally {
			writer.close();
		}

		// file:///D:/io/hospital/list.html
		// 생성된 html 파일 실행하기
		String url = "file:///" + path + filename;
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (IOException | URISyntaxException e) {
		}
	}

	void viewConsole(JSONArray list) {
		for (int idx = 0; idx < list.length(); idx++) {
			JSONObject json = list.getJSONObject(idx);
			System.out.printf("%s \t %s \t %s \n", json.getString("centerName"), json.getString("phoneNumber"),
					json.getString("orgZipaddr"), json.getString("lunchSttTm"), json.getString("lunchEndTm"));
		}
	}

	String requestAPI(StringBuffer urlBuilder) {
		String response = null;
		URL url;
		try {
			url = new URL(urlBuilder.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code: " + conn.getResponseCode());
			BufferedReader rd;
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();
			conn.disconnect();
			response = sb.toString();
			System.out.println(response);
		} catch (Exception e) {
		}
		return response;
	}

}
