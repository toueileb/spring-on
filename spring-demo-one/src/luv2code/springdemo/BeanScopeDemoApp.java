package luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScopeapplicationContext.xml");
		
		
		//retrieve bean from spring container
  Coach theCoach=context.getBean("myCoach",Coach.class);
  Coach alphCoach=context.getBean("myCoach",Coach.class);
  //check if they are thesame
  Boolean resultat=theCoach==alphCoach;
  //print out the result
  System.out.println("\nPointing to the same object "+resultat);
  System.out.println("\nmemory location for theCoach: "+theCoach);
  System.out.println("\nmemory location for alphaCoach: "+alphCoach);
  //close the context
  context.close();
	}

}
