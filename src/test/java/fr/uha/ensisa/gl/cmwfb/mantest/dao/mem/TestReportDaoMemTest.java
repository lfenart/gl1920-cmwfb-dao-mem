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
			fr.uha.ensisa.gl.cmwfb.mantest.Test test = new fr.uha.ensisa.gl.cmwfb.mantest.Test();
			long stepId = test.getId();
			TestReport t = sut.create(test);
			assertEquals(t,sut.find(stepId));
			}
		
		@Test 
		public void remove() {
			fr.uha.ensisa.gl.cmwfb.mantest.Test test = new fr.uha.ensisa.gl.cmwfb.mantest.Test();
			TestReport testReport = new TestReport(0,test);
			sut.create(test);
			assertEquals(1,sut.count());
			sut.remove(testReport);
			assertEquals(0,sut.count());			
		}
}