package com.cekinmezyucel.hackerrank.artificialintelligence.statisticsandmachinelearning;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BasicStatisticsWarmup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();

		int t = scan.nextInt();

		while (t-- > 0) {
			numbers.add(scan.nextInt());
		}

		scan.close();

		NumberFormat formatter = new DecimalFormat("#0.0");

		System.out.println(mean(numbers));
		System.out.println(median(numbers));
		System.out.println((int) mode(numbers));
		System.out.println(formatter.format(standardDeviation(numbers)));
		System.out.println(formatter.format(confidenceIntervals(numbers, 1.96)[0]) + " "
				+ formatter.format(confidenceIntervals(numbers, 1.96)[1]));

	}

	static double mean(List<Integer> numbers) {
		double sum = 0;

		for (Integer number : numbers) {
			sum += number;
		}

		return sum / numbers.size();
	}

	static double median(List<Integer> numbers) {
		Collections.sort(numbers);
		int median = numbers.size() / 2;

		if (numbers.size() % 2 == 0) {
			double sum = (double) numbers.get(median) + (double) numbers.get(median - 1);
			return sum / 2;
		} else {
			return (double) numbers.get(median - 1);
		}
	}

	static double mode(List<Integer> numbers) {

		HashMap<Integer, Integer> modeMap = new LinkedHashMap<>();

		for (Integer number : numbers) {
			if (!modeMap.containsKey(number)) {
				modeMap.put(number, 1);
			} else {
				modeMap.put(number, modeMap.get(number).intValue() + 1);
			}
		}

		int mode = 0;
		int max = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entry : modeMap.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				mode = entry.getKey();
			}
		}

		return mode;

	}

	static double standardDeviation(List<Integer> numbers) {
		double mean = mean(numbers);

		double sumDifMean = 0;

		for (Integer number : numbers) {
			sumDifMean += Math.pow(number - mean, 2);
		}

		return Math.sqrt(sumDifMean / numbers.size());
	}

	static double[] confidenceIntervals(List<Integer> numbers, double errorConstant) {
		double mean = mean(numbers);
		double standardDeviation = standardDeviation(numbers);

		return new double[] { mean - (errorConstant * (standardDeviation / Math.sqrt(numbers.size()))),
				mean + (errorConstant * (standardDeviation / Math.sqrt(numbers.size()))) };
	}
}
