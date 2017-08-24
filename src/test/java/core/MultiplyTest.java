package core;
import org.testng.annotations.*;

public class MultiplyTest {
       @Test
       public void multiply_test_instanceOf() {
              assertThat(Calculator.multiply(2, 2), instanceOf(Double.class));}
       private void assertThat(double multiply, Object instanceOf) {
		
	}
	private Object instanceOf(Class<Double> class1) {
		return null;
	}
	@Test
       public void multiply_test_2_param() {
              assertThat(Calculator.multiply(2, 2), equalTo(4.0));}
       private Object equalTo(double d) {
		return null;
	}
	@Test
       public void multiply_test_3_param() {
              assertThat(Calculator.multiply(2, 2, 2), equalTo(8.0));}
       @Test
       public void multiply_test_4_param() {
              assertThat(Calculator.multiply(2, 2, 2, 2), equalTo(16.0));}
}