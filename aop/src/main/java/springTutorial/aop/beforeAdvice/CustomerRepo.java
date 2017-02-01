package springTutorial.aop.beforeAdvice;

public interface CustomerRepo {
	Customer customer (int customerID);
	String getCustomerName(int customerID);
}
