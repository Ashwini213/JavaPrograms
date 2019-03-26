package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.algorithmProUtil.AlgotithmProgUtil;

public class TemperatureConvertion {

	public static void main(String[] args) {
		System.out.println("Choose the type of convertion. " + " 1 for fahaenheit to celsius. "
				+ " 2 for celsius to fahrenheit. ");
		double fahrenheit = 0;
		double celsius = 0;

		AlgotithmProgUtil.temperatureConvertion(fahrenheit, celsius);
	}
}