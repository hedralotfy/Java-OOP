package com.innovator.learnit.OOP.interfaces;

public class PayPalPaymentProcessor implements PaymentProcessor {

	//if this class was not inheriting any interface methods, it should be abstract.
	@Override
	public void processPayment(PaymentData payment) {
		/* PayPalForm paymentForm = PayPalApi.getPaymentFormByAppId(APP_ID);
		 * fillPaymentForm(paymentForm, payment);
		 * paymentForm.submit();
		 * ...
		 */
	}
	
}
