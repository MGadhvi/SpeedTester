package org.sparta.mg.speedtests.loops;

public class ForLoopTester implements Loops {

	public void runLoop(int max) {
		int total = 0;
		for (int i = 0; i <= max; i++) {
			total = total + i;
		}
		System.out.print("Total for For Loop: " + total + ", ");
	}
}
