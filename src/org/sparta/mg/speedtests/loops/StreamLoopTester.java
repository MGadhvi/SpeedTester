package org.sparta.mg.speedtests.loops;

import java.util.stream.IntStream;

public class StreamLoopTester implements Loops {
	public void runLoop(int max) {
		int total = IntStream.rangeClosed(0,max)
				.sum();
		System.out.print("Total for Stream Loop: " + total + ", ");
	}
}
