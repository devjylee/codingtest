import java.util.Scanner;

//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int line = 2*n-1;
		
		for(int i=1; i<=line; i++) {
			int star=line-(Math.abs(n-i)*2);
			int space=(line-star)/2;
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<star; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
