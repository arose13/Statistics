package me.anthonyrose.statistics;

import java.util.ArrayList;

public class BasicStatistics {
	
	private double sumX(ArrayList<Double> population) {
		double sumX = 0;		
		for (int i = 0; i < population.size(); i++) {
			sumX = sumX + population.get(i);
		}		
		return sumX;
	}
	
	private double sumXsq(ArrayList<Double> population) {
		double sumXsq = 0;
		for (int i = 0; i < population.size(); i++) {
			double sq = Math.pow(population.get(i),2); // x^y
			sumXsq = sumXsq + sq;
		}
		return sumXsq;
	}
	
	/* This computes the variance from a data set */
	public double variance(ArrayList<Double> population) {
		double sumX = sumX(population);
		double sumXsq = sumXsq(population);
		double n = population.size();
		
		double s2 = (sumXsq - ((Math.pow(sumX, 2))/n)) / (n-1);
		return s2;
	}
	
	/* This computes the Standard Deviation from a data set */
	public double stdev(ArrayList<Double> population) {
		double s = Math.sqrt( variance(population) );
		return s;
	}
	
}
