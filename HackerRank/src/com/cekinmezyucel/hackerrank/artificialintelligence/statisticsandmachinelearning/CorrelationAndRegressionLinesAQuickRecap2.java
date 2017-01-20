package com.cekinmezyucel.hackerrank.artificialintelligence.statisticsandmachinelearning;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrelationAndRegressionLinesAQuickRecap2 {

	public static void main(String[] args) {
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();

		x.addAll(Arrays.asList(15, 12, 8, 8, 7, 7, 7, 6, 5, 3));
		y.addAll(Arrays.asList(10, 25, 17, 11, 13, 17, 20, 13, 9, 15));

		NumberFormat formatter = new DecimalFormat("#0.000");

		System.out.println(formatter.format(slopeOfRegressionLine(x, y)));
	}

	static double slopeOfRegressionLine(List<Integer> x, List<Integer> y) {
		double meanX = mean(x);
		double meanY = mean(y);
		double sumDivided = 0;
		double sumDiviser = 0;

		for (int i = 0; i < x.size(); i++) {
			sumDivided += (x.get(i) - meanX) * (y.get(i) - meanY);
		}

		for (int j = 0; j < x.size(); j++) {
			sumDiviser += Math.pow(x.get(j) - meanX, 2);
		}

		return sumDivided / sumDiviser;
	}

	static double mean(List<Integer> numbers) {
		double sum = 0;

		for (Integer number : numbers) {
			sum += number;
		}

		return sum / numbers.size();
	}
}
