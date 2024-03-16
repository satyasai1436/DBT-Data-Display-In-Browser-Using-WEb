package in.satya.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.satya.Entity.empData;

public interface empRepo extends JpaRepository<empData, Integer>{
	
	
	public List<empData> findAll();
	

}
