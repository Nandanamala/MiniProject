package Aggregation;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			private Job job;

			public Employee() {
				this.job = new Job();
				job.setSalary(20000);
				job.setDesignation("Developer");
//				job.getSalary();

			}
			int getSalary() {
				return job.getSalary();
				
			}
			String getDesignation() {
				return job.getDesignation();
	}

}
