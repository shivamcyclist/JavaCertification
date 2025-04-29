package com.javatest.shivam;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntegersAndDouble {
	
	public static void main(String[] args) {
		int i = 20;
		BigDecimal rideAmount = BigDecimal.valueOf(20).setScale(2);
		BigDecimal noOfPerson = BigDecimal.valueOf(3).setScale(2);
		BigDecimal perPersonCharge = rideAmount.divide(noOfPerson, RoundingMode.HALF_UP);
		System.out.println(perPersonCharge);
	}

}
