package ex17.test;

public class Program {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			if (i==4) {
				System.out.printf("%c", 'A'+i);
				System.out.println();
			} else if (i%2==0) {
				System.out.printf("%c, ", ' ');
			} else {
				System.out.printf("%c, ", 'A'+i);
			}
		}
		
		System.out.println("-------------------------");
		
		for (int y=0; y<3; y++) {
			for (int x=0; x<3; x++) {
				System.out.printf("%d ", y*3+x+1);
			}
			System.out.println();
		}

	}

}
