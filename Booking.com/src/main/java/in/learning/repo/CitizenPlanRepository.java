package in.learning.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.learning.binding.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Serializable> {

	@Query("select distinct(planName) from citizenPlan")
	public List<String> getPlanNames();
	
	@Query("select distinct(planStatus) from citizenPlan")
	public List<String> getPlanStatuses();
}
