import java.util.Scanner;

public class Main {
	static int desen(int n) {
		int num = n;
		if (n > 0) {
			System.out.print(n + " ");
			return desen(n - 5);
		}
		desen2(n, num);
		return n;
	}

	static int desen2(int n, int num) {
		if (n < num) {
			System.out.print(n+" ");
			return desen2(n + 5, num);
		}
		return n;
	}

	public static void main(String[] args) {
		int n;
		Scanner deger = new Scanner(System.in);
		System.out.print("lutfen sayi giriniz: ");
		n = deger.nextInt();
		desen2(desen(n),n);
	}

}
