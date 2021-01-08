import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloRunnerTest {

	@Test
	void testName() throws Exception {
		assertEquals("(r hello rudolf)", new HelloRunner().main("hello rudolf"));
	}

}
