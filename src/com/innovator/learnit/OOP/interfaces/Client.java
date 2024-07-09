package com.innovator.learnit.OOP.interfaces;

public class Client {

	//paymentProcessor variable has PaymentProcessor type.
	private PaymentProcessor paymentProcessor;

	{
		//This variable now references to PayPalPaymentProcessor() object.
		//the object has PaymentProcessor type.
		paymentProcessor = new PayPalPaymentProcessor();
	}

	public void checkout(PaymentData payment) {
		// ... some methods calls goes here
		paymentProcessor.processPayment(payment);
		PaymentProcessor.someStaticMethod(); // demo of static method invocation
	}

	//the method accepts a variable of type PaymentProcessor, which means
	// that the method can work with any object that implements that interface.
	public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
}
