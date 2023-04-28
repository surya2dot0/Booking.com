package in.learning.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.learning.binding.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Serializable> {

}
