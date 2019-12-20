package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DaoFactoryMemTest {
	fr.uha.ensisa.gl.cmwfb.mantest.dao.DaoFactory sut; // System Under Test
	
	@Before
	public void createTest() {
		sut = new fr.uha.ensisa.gl.cmwfb.mantest.dao.mem.DaoFactoryMem();
	}

	@Test
	public void getTestDao() {
		assertNotNull(sut);
		assertNotNull(sut.getTestDao());
	}
	
	@Test
	public void getTestReportDao() {
		assertNotNull(sut);
		assertNotNull(sut.getTestReportDao());
	}

	@Test
	public void getTestSerieDao() {
		assertNotNull(sut);
		assertNotNull(sut.getTestSerieDao());	
	}
	
	@Test
	public void getTestBookDao() {
		assertNotNull(sut);
		assertNotNull(sut.getTestBookDao());	
	}
}
