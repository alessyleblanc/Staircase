package modulePackage;

public class Staircase {
	public static void main(String[] args) {
		int n = 10;
		int f = n - 1;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (count > 0) {
				System.out.print("\n");
			}
			count++;
			for (int z = 0; z < f; z++) {
				System.out.print(" ");
			}
			f--;
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
		}
	}
}
