package pp.ua.standev.leetcode;

public class App {

	public static void main(String[] args) {

		Solution solution = new Solution();
		
		if (solution.climbStairs(3) != 3) {
			throw new RuntimeException("Failed");
		}
		
		System.out.println("Success");
		
	}
}
