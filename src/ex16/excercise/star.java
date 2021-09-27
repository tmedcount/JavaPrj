package ex16.excercise;

public class star {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.printf("%c", '☆');
			}
			System.out.print("\n");
		}
		for (int i=0; i<10; i++) {
			for (int j=10; j>i; j--) {
				System.out.printf("%c", '☆');
			}
			System.out.print("\n");
		}

	}

}
