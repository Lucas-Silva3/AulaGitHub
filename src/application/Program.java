package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i<m; i++) {
			for (int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		int positionM = 0;
		int positionN = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] == x) {
					positionM = m;
					positionN = n;
				}
			}
		}

		System.out.println();
		System.out.println("Position "+m+","+n+":");

		sc.close();

	}

}
