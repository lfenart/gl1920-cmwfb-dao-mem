package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import fr.uha.ensisa.gl.cmwfb.mantest.Step;
import fr.uha.ensisa.gl.cmwfb.mantest.StepReport;
import fr.uha.ensisa.gl.cmwfb.mantest.TestReport;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestReportDao;

public class TestReportDaoMemTest {
	fr.uha.ensisa.gl.cmwfb.mantest.dao.TestReportDao sut;

	
		@Before
		public void CreateTestReport() {
			sut = new fr.uha.ensisa.gl.cmwfb.mantest.dao.mem.TestReportDaoMem();
		}
		
		@Test
		public void Test1() {
			assertEquals(0,sut.count());
			fr.uha.ensisa.gl.cmwfb.mantest.Test test = new fr.uha.ensisa.gl.cmwfb.mantest.Test();
			int stepId = 0;
			TestReport t = sut.create(sut.count(), test);
			assertNotNull(sut.find(stepId));
			assertEquals(1,sut.count());
			
			}
}
