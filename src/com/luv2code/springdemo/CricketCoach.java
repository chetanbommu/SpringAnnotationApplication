package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private String email;
	private String team;
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach : Inside No-arg Constructor");
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach : Inside setEmail");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : Inside setTeam");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : Inside SetFortuneService method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Batting & Bowling for 4 hours daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
