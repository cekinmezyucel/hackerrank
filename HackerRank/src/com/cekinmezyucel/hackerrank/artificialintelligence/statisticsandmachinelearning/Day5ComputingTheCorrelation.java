package com.cekinmezyucel.hackerrank.artificialintelligence.statisticsandmachinelearning;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day5ComputingTheCorrelation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scores = scan.nextInt();
		List<Integer> M = new ArrayList<>();
		List<Integer> P = new ArrayList<>();
		List<Integer> C = new ArrayList<>();

		while (scores-- > 0) {
			M.add(scan.nextInt());
			P.add(scan.nextInt());
			C.add(scan.nextInt());
		}

		scan.close();

		NumberFormat formatter = new DecimalFormat("#0.00");

		System.out.println(formatter.format(karlPearsonsCoefficient(M, P)));
		System.out.println(formatter.format(karlPearsonsCoefficient(P, C)));
		System.out.println(formatter.format(karlPearsonsCoefficient(C, M)));
	}

	static double karlPearsonsCoefficient(List<Integer> x, List<Integer> y) {

		int n = x.size();
		double sumX = x.stream().mapToInt(Integer::intValue).sum();
		double sumY = y.stream().mapToInt(Integer::intValue).sum();
		double sumXY = sumOfmultiplyValuesOfTwolist(x, y);
		double sumX2 = sumOfPow(x, 2);
		double sumY2 = sumOfPow(y, 2);

		double r = ((n * sumXY) - (sumX * sumY))
				/ Math.sqrt(((n * sumX2) - (Math.pow(sumX, 2))) * ((n * sumY2) - (Math.pow(sumY, 2))));

		return r;

	}

	static double sumOfmultiplyValuesOfTwolist(List<Integer> x, List<Integer> y) {
		double sum = 0;
		for (int i = 0; i < y.size(); i++) {
			double multiple = (double) x.get(i) * (double) y.get(i);
			sum += multiple;
		}

		return sum;
	}

	static double sumOfPow(List<Integer> list, double pow) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			double power = Math.pow(list.get(i), pow);
			sum += power;
		}
		return sum;
	}

	/*
	 * Σx = 247 Σy = 486 Σxy = 20,485 Σx2 = 11,409 Σy2 = 40,022 n is the sample
	 * size, in our case = 6
	 */

}
