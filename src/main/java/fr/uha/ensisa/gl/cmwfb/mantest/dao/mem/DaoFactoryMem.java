package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import fr.uha.ensisa.gl.cmwfb.mantest.dao.DaoFactory;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestDao;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestReportDao;

public class DaoFactoryMem implements DaoFactory {
	
	public final TestDao testDao = new TestDaoMem();
	public final TestReportDao testReportDao = new TestReportDaoMem();

	public TestDao getTestDao() {
		return this.testDao;
	}

	@Override
	public TestReportDao getTestReportDao() {
		return this.testReportDao;
	}

}
