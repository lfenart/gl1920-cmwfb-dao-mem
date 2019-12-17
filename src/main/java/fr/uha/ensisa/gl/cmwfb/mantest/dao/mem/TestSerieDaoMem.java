package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import fr.uha.ensisa.gl.cmwfb.mantest.Test;
import fr.uha.ensisa.gl.cmwfb.mantest.TestSerie;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestSerieDao;

public class TestSerieDaoMem implements TestSerieDao {

	private final Map<Long,TestSerie> store = Collections.synchronizedMap(new TreeMap<Long,TestSerie>());

	public TestSerieDaoMem() {
		create("First Test Serie");
	}
	
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
		TestSerie serie = new TestSerie(this.store.size()+1,nom);
		this.store.put(serie.getId(), serie);
		return serie;
	}
	
	@Override
	public TestSerie[] findAll() {
		TestSerie[] toReturn = new TestSerie[this.store.size()];
		int i = 0;
		for(Map.Entry<Long, TestSerie> item : this.store.entrySet()) {
			toReturn[i] = item.getValue();
			i++;
		}
		return toReturn;
	}
	
	@Override
	public void delete(TestSerie test) {
		this.store.remove(test.getId());

	}

}
