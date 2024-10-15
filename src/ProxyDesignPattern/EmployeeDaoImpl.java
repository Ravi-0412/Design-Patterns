package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		
		// creating a new row
		System.out.println("created new row in the employee table");
		
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		// delete a row
		System.out.println("deleted row with employeeId: " +employeeId);
		
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		
		// fetch row
		System.out.println("fetching data from DB");
		return new EmployeeDo();
		
	}

}
