package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void entryShouldBeReturnTwentyPercentOfTotalAmount() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		Financing fin = new Financing(totalAmount, income, months);

		Assertions.assertEquals(totalAmount*0.2, fin.entry());
	
	}
	
	@Test
	public void quotaShouldNotBeBiggerThanHalfIncome() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		Financing fin = new Financing(totalAmount, income, months);

		Assertions.assertEquals(1000.0, fin.quota());
	}
	
	@Test
	public void constructorShouldSetValuesWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(100000.0, fin.getTotalAmount());
		Assertions.assertEquals(2000.0, fin.getIncome());
		Assertions.assertEquals(80, fin.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 79);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetValuesWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		fin.setTotalAmount(100000.0);
		Assertions.assertEquals(100000.0, fin.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldSetValuesWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		fin.setIncome(3000.0);
		Assertions.assertEquals(3000.0, fin.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setIncome(1900.0);
		});
	}
	
	@Test
	public void setMonthsShouldSetValuesWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		fin.setMonths(80);
		Assertions.assertEquals(80, fin.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setMonths(79);
		});
	}
} 
