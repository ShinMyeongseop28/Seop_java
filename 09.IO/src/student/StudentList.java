package student;

import java.io.File;
import java.io.PrintWriter;

import dto.StudentDTO;

public class StudentList {
	private StudentDTO[] students;
	
	public StudentList(StudentDTO[] students) {
		this.students = students;
	}
	
	public void display() {
//		String htmlFile = "src/buffer/학생명단list.html";
		
		String folder = "d:/io/student";
//		파일을 저장할 디렉토리(폴더)가 없다면 폴더를 만들어야 한다
		File dir = new File(folder);
		if ( ! dir.exists()) {
			dir.mkdirs();
		}
		
		String htmlFile = "/학생명단list.html";
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(folder + htmlFile);

			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h2>학생명단목록</h2>");
			writer.print("<table border='1'>");
			writer.print("<tr> <th>성명</th> <th>성별</th> <th>전화번호</th> </tr>");

			for (StudentDTO student : students) {
				if (student == null) continue;
				writer.printf("<tr> <td>%s</td> <td>%s</td> <td>%s</td> </tr>", student.getName(), student.getGender(), student.getPhone());
			}

			writer.print("</table>");
			writer.print("</body>");
			writer.print("</html>");

		} catch (Exception e) {
		} finally {
			writer.close();
		}
		
	}

}
