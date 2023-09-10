package Basic;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[10];

		BufferReader bufferedReader = new BuffereReader(new InputStreamReader(system.in));
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter element at " + i + " index position");
			ar[i] = Integer.parseInt(bufferedReader.readLine());
		}
		int max = ar[0];
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
			if (ar[i] < min) {
				min = arr[i];
			}
		}
	}

}
