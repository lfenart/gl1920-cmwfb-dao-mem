package fr.uha.ensisa.gl.cmwfb.mantest.dao.mem;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import fr.uha.ensisa.gl.cmwfb.mantest.Test;
import fr.uha.ensisa.gl.cmwfb.mantest.TestReport;
import fr.uha.ensisa.gl.cmwfb.mantest.dao.TestReportDao;

public class TestReportDaoMem implements TestReportDao {
	
	private final Map<Long,TestReport> store = Collections.synchronizedMap(new TreeMap<Long,TestReport>());

	@Override
	public TestReport find(long id) {
		return this.store.get(id);
	}
	
	@Override
	public TestReport create(Test t) {
		TestReport testReport = new TestReport(t.getId(),t);
		this.store.put(testReport.getId(),testReport);
		return testReport;
	}
	
	/*@Override
	public long getNextId() {
		return this.store.size()+1L;
	}*/

}
