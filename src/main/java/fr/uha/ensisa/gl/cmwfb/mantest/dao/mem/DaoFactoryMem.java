package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import fr.uha.ensisa.gl.cmwfb.mantest.dao.DaoFactory;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestDao;

public class DaoFactoryMem implements DaoFactory {
	
	public final TestDao testDao = new TestDaoMem();

	public TestDao getTestDao() {
		return this.testDao;
	}

}
