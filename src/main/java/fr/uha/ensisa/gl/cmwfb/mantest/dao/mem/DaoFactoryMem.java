package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestSerieDao;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.DaoFactory;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestDao;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestReportDao;

public class DaoFactoryMem implements DaoFactory {
	
	public final TestDao testDao = new TestDaoMem();
<<<<<<< HEAD
	public final TestReportDao testReportDao = new TestReportDaoMem();
=======
	public final TestSerieDao testSerieDao = new TestSerieDaoMem();
>>>>>>> 6efeea2a5f317913161bdfbcb70298e9f81d3691

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

}
