package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import fr.uha.ensisa.gl.cmwfb.mantest.Test;
import fr.uha.ensisa.gl.cmwfb.mantest.TestSerie;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestSerieDao;

public class TestSerieDaoMem implements TestSerieDao {

	private final Map<Long, TestSerie> store = Collections.synchronizedMap(new TreeMap<Long, TestSerie>());

	@Override
	public TestSerie find(long id) {
		return this.store.get(id);
	}

	@Override
	public void persist(TestSerie test) {
		this.store.put(test.getId(), test);

	}

	@Override
	public TestSerie create(String nom) {
		long id = this.store.size() + 1;
		while (this.find(id) != null)
			id++;
		TestSerie serie = new TestSerie(id, nom);
		this.store.put(id, serie);
		return serie;
	}

	@Override
	public void deleteSerie(TestSerie test) {
		this.store.remove(test.getId());
		for (TestSerie testSerie : this.store.values()) {
			testSerie.removeSerie(test);
		}

	}

	@Override
	public Collection<TestSerie> findAll() {
		return this.store.values();
	}

}
