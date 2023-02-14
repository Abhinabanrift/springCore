package com.springcore.aspect;

public class PaymentServiceImp implements PaymentService{

	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Amount debited");
		
		System.out.println("Amount Credited");
	}

	@Override
	public String toString() {
		return "PaymentServiceImp [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
