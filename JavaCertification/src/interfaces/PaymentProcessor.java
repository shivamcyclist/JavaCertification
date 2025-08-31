package interfaces;

public interface PaymentProcessor {
	
	int RETRY_PAYMENT_ATTEMPTS = 5;
	
	void processPayment(PaymentData payment);
	
	default void someDefaultMethod() {
		System.out.println("This is a default method");
	}
	
	static void someStaticMethod() {
		System.out.println("This is some static method");
	}

}
