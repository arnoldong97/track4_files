package org.ssglobal.training.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreInfo {

	private ArrayList<Score> scoreInfo;
	
	
	public ScoreInfo(Score score) {
		scoreInfo.add(score);
	}
	
	
	public int getNumScores() {
		return (int) scoreInfo.stream().count();
	}
	
	public double getAverage() {
		return scoreInfo.stream().mapToInt((s) -> s.getScore()).average().orElse(0);
	}
	
	public int getNumberAListers() {
		return (int) scoreInfo.stream().filter((s) -> s.getScore() >= 90).count();
	}
	
	public List<String> getFailingStudentList() {
		return scoreInfo.stream().filter((s) -> s.getScore() < 70).sorted()
				.map(s -> String.join(" ", s.getFirstName(), s.getLastName()))
				.collect(Collectors.toList());
	}
	
	public void printPassingStudents() {
		System.out.println(scoreInfo.stream().filter((s) -> s.getScore() >= 70).sorted()
				.map(s -> String.join(" ", s.getFirstName(), s.getLastName()))
				.collect(Collectors.toList()));
	}
	
	public void displayAllStudents() {
		System.out.println(scoreInfo.stream().sorted((s1, s2) -> 
		{if (s1.getLastName().compareTo(s2.getLastName()) == 0) {
			return 0;
		} else if (s1.getLastName().compareTo(s2.getLastName())> 0) {
			return 2;
		} else
			return -2;
		}).map(s -> String.join(" ", s.getLastName(), s.getFirstName(), 
				String.valueOf(s.getScore()))).collect(Collectors.toList()));
	}
	
	public List<String> getStudentRecords() {
		return scoreInfo.stream().sorted((s1, s2) -> 
		{if ((s1.getScore().compareTo(s2.getScore()) == 0)) {
			return 0;
		} else if (s1.getScore().compareTo(s2.getScore())> 0) {
			return 2;
		} else
			return -2;
		}).map(s -> String.join(" ", String.valueOf(s.getScore()),
				s.getFirstName(), s.getLastName())).collect(Collectors.toList());
	}
}

class Score {
	
	private String firstName;
	private String lastName;
	private Integer score;

	
	public Score (String lastName, String firstName, int score) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.join(" ", firstName, lastName, String.valueOf(score));
	}
}

