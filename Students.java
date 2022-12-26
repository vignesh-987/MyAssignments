package week5.assign3;

public class Students {
	public void getStudentInfo(int studentId) {
		System.out.println(studentId);
	}
	public void getStudentInfo(int studentId, String studentName) {
		System.out.println(studentId+" "+studentName);
	}
	public void getStudentInfo(String studentEmailId, long studentPhoneNumber) {
		System.out.println(studentEmailId+" "+studentPhoneNumber);
	}
	public static void main(String[] args) {
		Students studentinfo=new Students();
		studentinfo.getStudentInfo(1056);
		studentinfo.getStudentInfo(1056, "vignesh");
		studentinfo.getStudentInfo("vignesh.pg01@gmail.com", 9003893172L);
	}

}
