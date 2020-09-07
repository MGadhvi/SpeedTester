package org.sparta.mg.speedtests.testrunner;

import org.sparta.mg.speedtests.loops.Loops;

public class LoopTester {
	public void doTest(Loops loop, int maxValue) {
		double start = System.nanoTime();
		loop.runLoop(maxValue);
		double finish = System.nanoTime();
		double totalTime = finish - start;
		System.out.println("Time in milliseconds: " + totalTime / 1_000_000);
	}
}
