package coffeeshop;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
//		menu.load();
		
//		m: 메뉴관리
//		o: 주문받기
//		s: 실적보기
//		x: 프로그램 종료.
		
		System.out.println("명령어를 입력하세요.(m, o, s, x)");
		
		Scanner sc = new Scanner(System.in);
		String comm = sc.nextLine();
		
		while(!comm.equals("x")) {
			switch(comm) {
			case "m":
				System.out.println("메뉴관리");
				break;
			case "o":
				System.out.println("주문받기");
				break;
			case "s":
				System.out.println("실적보기");
				break;
			}
			comm = sc.nextLine();
		}
		System.out.println("프로그램 종료.");	

//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		
//		System.out.println("메뉴명 입력: ");
//		String name=s1.nextLine();
//		while(!name.equals("")) {
//			System.out.println("가격 입력: ");
//			int price = s2.nextInt();
//			menu.addName(name);
//			menu.addPrice(price);
//			System.out.println("메뉴명 입력: ");
//			name=s1.nextLine();
//		}
//		System.out.println("메뉴 목록");
		menu.showMenu();
//		s1.close(); s2.close();
	}
}
