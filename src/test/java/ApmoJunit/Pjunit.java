package ApmoJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pjunit {
	

		@Test
		public void f1()
		{
			int a=110;
			int b=0;
			assertTrue(a>b);
		}
		@Test
		public void f2()
		{
			String s="biswajit";
			String s1="biswajit";
			assertEquals(s,s1);
		}
}

