package com.bridgelabz.functionalPrograms;

import java.util.concurrent.TimeUnit;

import com.bridgelabz.functionalProgUtil.FunctionalProgUtil;

public class StopWatchFunction {

	public static void main(String[] args) {
		long startWatch = System.currentTimeMillis();
		System.out.println(startWatch);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long present = System.currentTimeMillis();
		System.out.println(present);
		double time = FunctionalProgUtil.functionStopWatch(present, startWatch);
		System.out.println("Elapsed timeis: " + time);
	}
}