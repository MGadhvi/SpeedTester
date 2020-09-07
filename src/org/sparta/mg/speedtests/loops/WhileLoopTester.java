package org.sparta.mg.speedtests.loops;

public class WhileLoopTester implements Loops {

	public void runLoop(int max) {
		int total = 0;
		int count = 0;
		while (count <= max) {
			total = total + count;
			count += 1;
		}
		System.out.print("Total for While Loop: " + total + ", ");
	}
}
