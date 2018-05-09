package calculator;

import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
	
	@Test
	public void shouldAddTwoNumbers() {
		Calc calculator = new Calc();
		
		int result = calculator.add(5, 7);
		
		assertThat(result).isEqualTo(12);
	}
	
	@Test
	public void shouldSubtractTwoNumbers() {
		Calc calculator = new Calc();
		
		int result = calculator.subtract(12, 7);
		
		assertThat(result).isEqualTo(5);
	}
	
	@Test
	public void shouldMultiplyTwoNumbers() {
		Calc calculator = new Calc();
		
		int result = calculator.multiply(3, 4);
		
		assertThat(result).isEqualTo(12);
	}
	
	@Test
	public void shouldDivideTwoNumbers() {
		Calc calculator = new Calc();
		
		int result = calculator.divide(12, 4);
		
		assertThat(result).isEqualTo(3);
	}
	
	@Test
	public void shouldMultiplyByZero() {
		Calc calculator = new Calc();
		
		int result = calculator.multiply(3, 0);
		
		assertThat(result).isEqualTo(0);
	}
	
	/* Already handled
	@Test
	public void shouldNotDivideByZero() {
		Calc calculator = new Calc();
		
		int result = calculator.divide(3, 0);
		
		assertThat(result).isNotEqualTo(0);
	}*/
}
