package covid;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HospitalList {
	void display() {
		// https://api.odcloud.kr/api/15077586/v1/centers?
		// page=1
		// &perPage=10
		// &serviceKey=data-portal-test-key

		StringBuffer url = new StringBuffer("https://api.odcloud.kr/api/15077586/v1/centers?");
		url.append("page=").append(1);
		url.append("&perPage=").append(20);
		url.append("&serviceKey=").append("data-portal-test-key");
		// http통신으로 데이터요청하기
		String response = requestAPI(url); // Json 형태로 된 문자열
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
