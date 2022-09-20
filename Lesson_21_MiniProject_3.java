package intro;

public class Lesson_21_MiniProject_3 {

	public static void main(String[] args) {
//mükemmel sayı uygulaması

		int number = 5;
		int i = 0;
		int divisor = 0;

		for (i = 1; i < number; i++) {
			int remainder = number % i;
			if (remainder == 0) {
				divisor += i;
			}
		}
		System.out.println("Bölenler Toplamı : " + divisor);
		if (divisor == number) {
			System.out.println("Sayı Mükemmel Sayıdır");
		} else {
			System.out.println("Sayı mükemmel sayı değildir.");
		}
	}

}
