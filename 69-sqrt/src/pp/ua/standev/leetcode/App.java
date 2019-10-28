package pp.ua.standev.leetcode;

public class App {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		if (solution.mySqrt(8) == 2
				&& solution.mySqrt(578) == 24
				
				) {
			System.out.println("Success");
			return;
		}
		
		throw new RuntimeException("Failed");
		
	}
}
