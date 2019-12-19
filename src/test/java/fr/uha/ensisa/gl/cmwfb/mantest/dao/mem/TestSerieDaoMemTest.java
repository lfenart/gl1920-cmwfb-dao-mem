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
	
	@Test
	public void persistTestSerie() {
		fr.uha.ensisa.gl.cmwfb.mantest.TestSerie testserie = new fr.uha.ensisa.gl.cmwfb.mantest.TestSerie(1, "hello");
		TestSerieDaoMem testSerieDao = new TestSerieDaoMem();
		testSerieDao.persist(testserie);
		assertEquals(testserie,testSerieDao.find(1));
	}
	
	@Test
	public void deleteATest() {
		String name = "Test Serie Two";
		TestSerieDaoMem testSerieDao = new TestSerieDaoMem();
		TestSerie serieCreated = testSerieDao.create(name);
		testSerieDao.deleteSerie(serieCreated);
		assertNull(testSerieDao.find(serieCreated.getId()));
	}
	
	@Test
	public void modifyATest() {
		String name = "Test Serie One";
		TestSerieDaoMem testSerieDao = new TestSerieDaoMem();
		TestSerie serieCreated = new TestSerie(2L,name);
		testSerieDao.persist(serieCreated);
		TestSerie serieDao = testSerieDao.find(serieCreated.getId());
		assertEquals(serieCreated,serieDao);
	}
	
	
}
