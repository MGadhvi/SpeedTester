package org.sparta.mg.speedtests.loader;

import org.sparta.mg.speedtests.loops.ForLoopTester;
import org.sparta.mg.speedtests.loops.StreamLoopTester;
import org.sparta.mg.speedtests.loops.WhileLoopTester;
import org.sparta.mg.speedtests.testrunner.LoopTester;

public class SpeedTestLoader {

	public static void runLoopTests(int maxValue) {
		ForLoopTester forLoopTester = new ForLoopTester();
		StreamLoopTester streamLoopTester = new StreamLoopTester();
		WhileLoopTester whileLoopTester = new WhileLoopTester();
		LoopTester loopTester = new LoopTester();

		loopTester.doTest(forLoopTester, maxValue);
		loopTester.doTest(streamLoopTester, maxValue);
		loopTester.doTest(whileLoopTester, maxValue);
	}
}
