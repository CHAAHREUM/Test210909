package Test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] score = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0, 80.0, 90.0, 70.0, 60.0 };

		int cl1 = sc.nextInt();
		int cl2 = sc.nextInt();
		sc.close();

		double sum = score[cl1 - 1] + score[cl2 - 1];

		System.out.printf("%.1f", sum);

	}

}
