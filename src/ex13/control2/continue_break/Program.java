package ex13.control2.continue_break;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 sp로 구분해서 5개 이상 입력하세요."); // 34 5 6 234 345 54 45
		
		while(sc.hasNext()) {
			n = sc.nextInt();
			
			if (n < 10) {
				continue;
			}
			
			if (n > 300) {
				break;
			}
			
			System.out.println(n);
		}
		
	}
}
