package ProxyDesignPattern;

public interface EmployeeDao {
	
	public void create(String client, EmployeeDo obj) throws Exception;  // craeting an object of 'EmployeeDo'
	public void delete(String client, int employeeId) throws Exception;  // deleting employee detail with employee_id 'employeeID'
	public EmployeeDo get(String client, int employeeId) throws Exception;  // returning employee from db with id 'employeeId'.

}
