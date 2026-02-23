package Pipeline.CICD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tester {

	Testing cal=new Testing();
	@Test
	void test1() {
		int result=cal.div(5,5);
		assertEquals(1,result);
	}
	@Test
	void test2() {
		int result=cal.sub(5, 5);
		assertEquals(0,result);
	}

}