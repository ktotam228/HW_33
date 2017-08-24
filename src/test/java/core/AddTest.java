package core;
import org.testng.annotations.*;
public class AddTest {
       @Test
       public void add_test_instanceOf() {
              assertThat(Calculator.add(2, 2), instanceOf(Double.class));}
       private void assertThat(double add, Object instanceOf) {
		
	}
	private Object instanceOf(Class<Double> class1) {
		return null;
	}
	@Test
       public void add_test_2_param() {
              assertThat(Calculator.add(2, 2), equalTo(4.0));}
       private Object equalTo(double d) {
		return null;
	}
	@Test
       public void add_test_3_param() {
              assertThat(Calculator.add(2, 2, 2), equalTo(6.0));}
       @Test
       public void add_test_4_param() {
              assertThat(Calculator.add(2, 2, 2, 2), equalTo(8.0));}
}