package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import fr.uha.ensisa.gl.cmwfb.mantest.TestSerie;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.mem.TestSerieDaoMem;

public class TestSerieDaoMemTest {

	@Test
	public void empty() {
		long id = 22L;
		TestSerieDaoMem testSerieDao = new TestSerieDaoMem();
		assertNull(testSerieDao.find(id));
		TestSerie[] all = testSerieDao.findAll();
		assertEquals(all.length,1);
	}
	
	@Test
	public void createAndFindOneTestSerie() {
		String name = "Test Serie One";
		TestSerieDaoMem testSerieDao = new TestSerieDaoMem();
		TestSerie serieCreated = testSerieDao.create(name);
		assertEquals(serieCreated,testSerieDao.find(serieCreated.getId()));
	}
	
}
