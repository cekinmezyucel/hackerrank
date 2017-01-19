package com.cekinmezyucel.hackerrank.artificialintelligence.statisticsandmachinelearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrelationAndRegressionLinesAQuickRecap1 {

	public static void main(String[] args) {
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();

		x.addAll(Arrays.asList(15, 12, 8, 8, 7, 7, 7, 6, 5, 3));
		y.addAll(Arrays.asList(10, 25, 17, 11, 13, 17, 20, 13, 9, 15));

		System.out.println(karlPearsonsCoefficient(x, y));
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
