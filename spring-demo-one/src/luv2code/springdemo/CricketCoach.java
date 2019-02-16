package luv2code.springdemo;

public class CricketCoach implements Coach {
	private String email;
	private String team;
	
public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}

public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

private FortuneService fortuneService;
//create a no-arg constructor

public CricketCoach() {
System.out.println("CricketCoach: inside no arg-constructor");
}
//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
	this.fortuneService = fortuneService;
}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
