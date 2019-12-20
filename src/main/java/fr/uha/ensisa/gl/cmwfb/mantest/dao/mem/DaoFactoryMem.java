package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestSerieDao;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.DaoFactory;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestBookDao;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestDao;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestReportDao;

public class DaoFactoryMem implements DaoFactory {
	
	public final TestDao testDao = new TestDaoMem();
	public final TestReportDao testReportDao = new TestReportDaoMem();
	public final TestSerieDao testSerieDao = new TestSerieDaoMem();
	public final TestBookDao testBookDao = new TestBookDaoMem();

	public TestDao getTestDao() {
		return this.testDao;
	}
	
	@Override
	public TestSerieDao getTestSerieDao() {
		return this.testSerieDao;
	}

	@Override
	public TestReportDao getTestReportDao() {
		return this.testReportDao;
	}
	
	public TestBookDao getTestBookDao() {
		return this.testBookDao;
	}
}
