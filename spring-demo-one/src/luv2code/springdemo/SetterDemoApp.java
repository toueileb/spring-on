package luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       //retrieve the bin from spring container
		CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
