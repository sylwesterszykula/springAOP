package springTutorial.aop.beforeAdvice;

//import org.apache.log4j.Logger;

public class LoggingAspect {
	public void logExecution(){
		//Logger.getLogger(getClass().getName()).info("Method executing");
		System.out.println("Metoda logExecution");
	}
}
