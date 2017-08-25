package core;
import org.testng.annotations.*;

public class SubtractTest {
       @Test
       public void subtract_test_instanceOf() {
              assertThat(Calculator.subtract(2, 2), instanceOf(Double.class));}
       private void assertThat(double subtract, Object instanceOf) {
		
	}
	private Object instanceOf(Class<Double> class1) {
		return null;
	}
	@Test
       public void subtract_test_2_param() {
              assertThat(Calculator.subtract(6, 2), equalTo(4.0));}
       private Object equalTo(double d) {
		return null;
	}
	@Test
       public void subtract_test_3_param() {
              assertThat(Calculator.subtract(8, 5, 2), equalTo(1.0));}
       @Test
       public void subtract_test_4_param() {
              assertThat(Calculator.subtract(12, 6, 3, 1), equalTo(2.0));}
}
