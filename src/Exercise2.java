
public class Exercise2 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println(total);
	}

}
