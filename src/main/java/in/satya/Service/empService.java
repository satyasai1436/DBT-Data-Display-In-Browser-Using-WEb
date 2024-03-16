package in.satya.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satya.Entity.empData;
import in.satya.Repo.empRepo;

@Service
public class empService {

	@Autowired
	private empRepo Repo;

	public void setData() {
		empData emp = new empData("K.Satya", "Junior Developer", 26000.0);
		empData emp1 = new empData("Y.Raja Kiran", "Senior Developer", 38000.0);
		empData emp2 = new empData("P.Nikhil", "Web Developer", 32000.0);
		empData emp3 = new empData("Veera Babu", "SAP Developer", 29000.0);

		List<empData> saveAll = Repo.saveAll(Arrays.asList(emp, emp1, emp2, emp3));
		System.out.println(saveAll);

	}
	
	public List<empData> get() {
		List<empData> all = Repo.findAll();
		all.forEach(System.out::println);
		return all;
	}

}
