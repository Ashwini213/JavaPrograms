package com.bridgelabz.functionalProgUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionalProgUtil {
	public static Scanner scanner = new Scanner(System.in);

	public static int getInt() {
		return scanner.nextInt();
	}

	public static String getstring() {
		return scanner.nextLine();
	}

	public static double getDouble() {
		return scanner.nextDouble();
	}

	static float h1 = 1;
	static int power = 1;
	static double heads = 0;
	static double tails = 0;
	static double count = 1;
	static double result = 0;

	// Prime Factors
	public static void primeFactors(int n) {
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n = n / 2;
		}
		for (int i = 3; i * i <= n; i = i + 2) {
			while (n % i == 0) {
				System.out.println(i + " ");
				n = n / i;
			}
		}
		if (n > 2) {
			System.out.println(n);
		}
	}

	// flip coin
	public static void toss(int flips) {

		while (count <= flips) {
			result = Math.random();
			if (result <= 0.5) {
				heads++;
			} else {
				tails++;
			}
			count++;
		}
		System.out.println(+heads + " is the number of heads");
		System.out.println(+tails + " is the number of tails");
		double headsPercent = (heads / flips) * 100;
		double tailsPercent = (tails / flips) * 100;
		System.out.println("Percentage of heads is: " + headsPercent);
		System.out.println("Percentage of tails is: " + tailsPercent);
	}

	// IntegerAddsThree
	public static void cubic(int[] arr, int N) {
		for (int a = 0; a < N - 2; a++) {
			for (int b = a + 1; b < N - 1; b++) {
				for (int c = b + 1; c < N; c++) {
					if (arr[a] + arr[b] + arr[c] == 0) {
						System.out.println(arr[a]);
						System.out.println(" ");
						System.out.println(arr[b]);
						System.out.println(" ");
						System.out.println(arr[c]);
					}

				}
			}
		}

	}

	// Harmonic number
	public static void harmonic(int a) {
		for (int i = 2; i <= a; i++) {
			h1 = h1 + (float) 1 / i;
		}
		System.out.println(h1);

	}

	// powerOfTwo
	public static void powertwo(int x) {
		int i = 0;
		if (x <= 31) {
			while (i <= x) {
				System.out.println("2^" + i + "= " + power);

				power = power * 2;
				i = i + 1;
			}
		}
	}

	// Array2D
	public static void inputsOfMatrix(Scanner scanner, int[][] matrix, int row, int column) {
		System.out.println("enter the elements of matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
	}

	public static void outputMatrix(int[][] matrix, int row, int column) {
		System.out.println("Matrix is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// distance
	public static void distance(int x, int y) {

		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println(" The distance is: " + distance);
	}

	// Leap year
	public static boolean yearLeap(int Year) {
		if (Year > 999) {
			if (Year % 4 == 0 || Year % 400 == 0) {
				System.out.println("Year " + Year + " is a leap year");
			} else if (Year % 100 == 0) {
				System.out.println("Year " + Year + " is not a leap year");
			} else {
				System.out.println("Year " + Year + " is not a leap year");
			}
		} else {
			System.out.println(+Year + " is a invalid year");
		}
		return false;

	}

	// QuadraticEuation
	public static void equationQuadratic(double a, double b, double c) {
		double root1, root2;
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.format("root1=%.2f and root2=%.2f", root1, root2);
		} else if (delta == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format(" root1=root2=%.2f", root1);
		} else {
			double v = -b / (2 * a);
			double u = Math.sqrt(-delta) / (2 * a);
			System.out.format("root1=%.2f+%.2fi and root2=%.2f-%.2fi", v, u, v, u);
		}
	}

	// ReplaceProgram
	public static void funtionReplace() {
		String firststr, secondstr, thirdstr, fourthstr;

		System.out.println("Enter a String: ");
		firststr = scanner.nextLine();

		System.out.println("Enter name to be replaced is: ");
		secondstr = scanner.nextLine();

		if (secondstr.length() >= 3) {
			System.out.println("Enter name to be replaced with is: ");
			thirdstr = scanner.nextLine();

			fourthstr = firststr.replaceAll(secondstr, thirdstr);

			System.out.println("New string is: " + fourthstr);
		} else {
			System.out.println("Username should have minimum 3 characters");
		}
	}

	// StringPermutations
	public static void stringPermutationRecurcive(String startAlphabet, String endAlphabet) {
		if (endAlphabet.length() == 0) {
			System.out.println(startAlphabet);
		}
		for (int i = 0; i < endAlphabet.length(); i++) {

			String newStart = startAlphabet + endAlphabet.charAt(i);
			String newEnd = endAlphabet.substring(0, i) + endAlphabet.substring(i + 1);
			stringPermutationRecurcive(newStart, newEnd);
		}
	}

	public static void stringPermutationIterative(String s) {
		List<String> list = new ArrayList<>();
		list.add(String.valueOf(s.charAt(0)));
		for (int i = 1; i < s.length(); i++) {
			for (int j = list.size() - 1; j > 0; j--) {
				String str = list.remove(j);
				for (int k = 0; k <= str.length(); k++) {
					list.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
					System.out.println(list);
				}
			}
		}
	}

	// StopWatch
	public static double functionStopWatch(long present, long startWatch) {
		Double time = (present - startWatch) / 1000.0;
		return time;
	}

	// WindChill
	public static void windchillFunction() {
		System.out.println("Enter the value of temperature");
		double temperature = scanner.nextDouble();

		System.out.println("Enter the value of speed");
		double speed = scanner.nextDouble();
		if (temperature < 50) {
			if (speed < 120 && speed > 3) {
				double temperature_windChill = 35.74 + (0.6215 * temperature)
						+ ((0.4275 * temperature) - 0.3575) * Math.pow(speed, 0.16);
				System.out.println(" windchill is " + temperature_windChill);
			}
		} else {
			System.out.println("Invalid data");
		}
	}

	// Coupon
	public static int number(int n) {
		boolean[] collectedValue = new boolean[n];
		int count = 0;
		int distinctNum = 0;
		while (distinctNum < n) {
			int num = (int) (Math.random() * n);
			count++;
			if (!collectedValue[num]) {
				distinctNum++;
				System.out.println(distinctNum);
				collectedValue[num] = true;
			}
		}
		return count;

	}// gambler

	public static void gambler(int stake, int goals, int trails) {
		int loss = 0;
		int wins = 0;
		for (int x = 0; x < trails; x++) {
			int cash = stake;
			while (cash > 0 && cash < goals) {
				double r = Math.random();
				if (r < 0.5)
					cash++;
			}

			if (cash == goals) {
				wins++;
			} else
				loss++;
		}
		System.out.println(wins + " wins of " + trails);
		System.out.println("Percentage of winning is game is: " + 100.0 * wins / trails);
		System.out.println("Percentage of loss is: " + 100.0 * loss / trails);

	}

	// replace_regex
	public static String replaceName(String sentance, String userName) {
		final String REGEX_USERNAME = "<<username>>";
		Pattern p = Pattern.compile(REGEX_USERNAME);
		Matcher m = p.matcher(sentance);
		String message = m.replaceFirst(userName);

		return message;

	}
	
	
}