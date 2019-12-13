package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

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
			fr.uha.ensisa.gl.cmwfb.mantest.TestReport testReport = new fr.uha.ensisa.gl.cmwfb.mantest.TestReport(sut.count(),test);
			assertEquals(testReport,sut.create(sut.count(), test));
			assertEquals(1,sut.count());
			}
}
