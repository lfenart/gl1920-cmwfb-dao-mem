package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class TestBookDaoMemTest {
	fr.uha.ensisa.gl.cmwfb.mantest.dao.TestBookDao sut;
	
	@Before
	public void createTestBook() {
		sut = new fr.uha.ensisa.gl.cmwfb.mantest.dao.mem.TestBookDaoMem();
	}
		@Test
		public void persistFind() {
			assertEquals(0, sut.count());
			String name = "Cahier de Test N°1";
			int id = 0;
			fr.uha.ensisa.gl.cmwfb.mantest.TestBook testBook = new fr.uha.ensisa.gl.cmwfb.mantest.TestBook(id,name);
			sut.persist(testBook);
			assertEquals(1, sut.count());
			assertEquals(testBook, sut.find(id));
		}

		@Test
		public void remove() {
			assertEquals(0, sut.count());
			String name = "Cahier de Test N°1";
			int id = 0;
			fr.uha.ensisa.gl.cmwfb.mantest.TestBook testBook = new fr.uha.ensisa.gl.cmwfb.mantest.TestBook(id,name);
			sut.persist(testBook);
			assertEquals(1, sut.count());
			sut.remove(testBook);
			assertEquals(0, sut.count());
		}

		@Test
		public void findAll() {
			Collection<fr.uha.ensisa.gl.cmwfb.mantest.TestBook> all = sut.findAll();
			assertNotNull(all);
			assertEquals(0, all.size());
		}

	}
