package Basic;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String calculateGrade(int marks) {
	        if (marks >= 90 && marks <= 100) {
	            return "A+";
	        } else if (marks >= 76 && marks <= 89) {
	            return "A";
	        } else if (marks >= 66 && marks <= 75) {
	            return "B+";
	        } else if (marks >= 50 && marks <= 65) {
	            return "B";
	        } else {
	            return "Fail";
	        }
		}
	}
}
