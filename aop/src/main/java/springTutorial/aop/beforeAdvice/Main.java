package springTutorial.aop.beforeAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextBeforeAdvice.xml");

		CustomerRepo bean = context.getBean("customerRepoImplBean", CustomerRepo.class);
		System.out.println(bean.getCustomerName(1));
	}

}
