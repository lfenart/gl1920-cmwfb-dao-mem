package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class TestDaoMemTest {
	fr.uha.ensisa.gl.cmwfb.mantest.dao.TestDao sut; // System Under Test

	@Before
	public void createTest() {
		sut = new fr.uha.ensisa.gl.cmwfb.mantest.dao.mem.TestDaoMem();
	}

	@Test
	public void persistFind() {
		assertEquals(0, sut.count());
		fr.uha.ensisa.gl.cmwfb.mantest.Test test = new fr.uha.ensisa.gl.cmwfb.mantest.Test();
		long id = 1;
		test.setId(id);
		sut.persist(test);
		assertEquals(1, sut.count());
		assertEquals(test, sut.find(id));
	}
	
	@Test
	public void remove() {
		assertEquals(0, sut.count());
		fr.uha.ensisa.gl.cmwfb.mantest.Test test = new fr.uha.ensisa.gl.cmwfb.mantest.Test();
		sut.persist(test);
		assertEquals(1, sut.count());
		sut.remove(test);
		assertEquals(0, sut.count());
	}
	
	@Test
	public void findAll() {
		Collection<fr.uha.ensisa.gl.cmwfb.mantest.Test> all = sut.findAll();
		assertNotNull(all);
		assertEquals(0, all.size());
	}
	
	@Test
	public void modify() {
		fr.uha.ensisa.gl.cmwfb.mantest.Test test = new fr.uha.ensisa.gl.cmwfb.mantest.Test();
		test.setId(1);
		test.setName("hello");
		sut.persist(test);
		sut.modify(1, "new");
		assertEquals("new", sut.find(1).getName());
	}

}
