package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import fr.uha.ensisa.gl.cmwfb.mantest.Test;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestDao;

public class TestDaoMem implements TestDao {

	private final Map<Long, Test> store = Collections.synchronizedMap(new TreeMap<Long, Test>());

	public void persist(Test test) {
		this.store.put(test.getId(), test);
	}

	public void remove(Test test) {
		this.store.remove(test.getId());
	}

	public Test find(long id) {
		return this.store.get(id);
	}

	public Collection<Test> findAll() {
		return this.store.values();
	}

	public long count() {
		return this.store.size();
	}
	
	public Test modify(long id, String newName) {
		Test test = this.find(id);
		test.setName(newName);
		return test;
	}

}
