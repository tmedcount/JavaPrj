package ex19.array;

public class Program4 {

	public static void main(String[] args) {
		int[] nums = {2,3,6,4,1,5};
		
		for (int i=0; i<6; i++)
			System.out.printf("%d", nums[i]);
		
		System.out.println();
		
		int temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		
		for (int i=0; i<6; i++)
			System.out.printf("%d", nums[i]);
		
		
	}

}
