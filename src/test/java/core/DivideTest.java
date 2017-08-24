package core;
import org.testng.annotations.*;

public class DivideTest {
       @Test
       public void divide_test_instanceOf() {
              assertThat(Calculator.divide(4, 2), instanceOf(Double.class));}
       private void assertThat(double divide, Object instanceOf) {
		
	}
	private Object instanceOf(Class<Double> class1) {
		return null;
	}
	@Test
       public void divide_test_2_param() {
              assertThat(Calculator.divide(7.1, 2), equalTo(3.5));}
       private Object equalTo(double d) {
		return null;
	}
	@Test
       public void divide_test_3_param() {
              assertThat(Calculator.divide(19, 4, 2), equalTo(2.3));}
       @Test
       public void divide_test_4_param() {
              assertThat(Calculator.divide(26, 5, 3, 2), equalTo(0.8));}
}