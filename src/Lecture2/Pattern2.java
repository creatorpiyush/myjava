package Lecture2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int row = 1;
		int nst = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}
}
