package in.learning.repo;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ReportService {

	public List<String> getPlanNames();
	public List<String> getPlanStatuses();
	public List<String> getCitizenPlans(SearchRequest request);
	public void exportExcel(HttpServletResponse response);
	public void exportPdf(HttpServletResponse response);
}
