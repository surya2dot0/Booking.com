package in.learning.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportServiceImpl implements ReportService{

	

	
	@Autowired
	CitizenPlanRepository repo;

	@Override
	public List<String> getPlanNames() {
		return repo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatuses() {
		return repo.getPlanStatuses();
	}

	@Override
	public List<String> getCitizenPlans(SearchRequest request) {
		return null;
	}

	@Override
	public void exportExcel(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportPdf(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
}
