package luv2code.springdemo;

public class TrackCoach implements Coach {
private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
}

	
	public TrackCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it"+fortuneService.getFortune();
	}
//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
//add a destroy method	
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
}
