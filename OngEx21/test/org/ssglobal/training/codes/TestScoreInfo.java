package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestScoreInfo {
	
	private Score s1 = new Score("Smith","John",70);
	private Score s2 = new Score("Doe","Mary",85);
	private Score s3 = new Score("Page","Alice",82);
	private Score s4 = new Score("Cooper","Jill",97);
	private Score s5 = new Score("Flintstone","Fred",66);
	private Score s6 = new Score("Rubble","Barney",80);
	private Score s7 = new Score("Smith","Judy",48);
	private Score s8 = new Score("Dean","James",90);
	private Score s9 = new Score("Russ","Joe",55);
	private Score s10 = new Score("Wolfe","Bill",73);
	private Score s11 = new Score("Dart","Mary",54);
	private Score s12 = new Score("Rogers","Chris",78);
	private Score s13 = new Score("Toole","Pat",51);
	private Score s14 = new Score("Khan","Omar",93);
	private Score s15 = new Score("Smith","Ann",95);
	private ScoreInfo si;
	@BeforeEach
	public void setup() {
		si = new ScoreInfo(s1);
		si = new ScoreInfo(s2);
		si = new ScoreInfo(s3);
		si = new ScoreInfo(s4);
		si = new ScoreInfo(s5);
		si = new ScoreInfo(s6);
		si = new ScoreInfo(s7);
		si = new ScoreInfo(s8);
		si = new ScoreInfo(s9);
		si = new ScoreInfo(s10);
		si = new ScoreInfo(s11);
		si = new ScoreInfo(s12);
		si = new ScoreInfo(s13);
		si = new ScoreInfo(s14);
		si = new ScoreInfo(s15);
	}
	
	@AfterEach
	public void teardown() {
		si = null;
	}

	@Test
	public void testGetNumScoresTestData1() {
		
	}
	
	@Test
	public void testGetAverageTestData1() {
		
	}
	
	@Test
	public void testGetNumberAListersTestData1() {
		
	}
	
	@Test
	public void testGetFailingStudentListTestData1() {
		
	}
	
	@Test
	public void testPrintPassingStudentsTestData1() {
		
	}
	
	@Test
	public void testDisplayAllStudentsTestData1() {
		
	}
	
	@Test
	public void testGetStudentRecordsTestData1() {
		
	}
	
}
