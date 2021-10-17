package ex19.array;

import java.util.Random;

public class Program5 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] lottos = new int[6];
		
		for(int i=0; i<6; i++)
			lottos[i] = rand.nextInt(45)+1;
				
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lottos[i]);
		
	}

}
