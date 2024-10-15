package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {
	
	EmployeeDao employeeDaoObj;
	
	EmployeeDaoProxy() {
		employeeDaoObj = new EmployeeDaoImpl(); // impl ka object create karo with reference of 'dao'.
												// agar allowed hua to 'impl' wale function ko create karega.
	}

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		
		if(client.equals("ADMIN")) {
			employeeDaoObj.create(client, obj);
			return;
		}
		
		throw new Exception("Access denied");
		
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {


		if(client.equals("ADMIN")) {
			employeeDaoObj.delete(client, employeeId);
			return;
		}
		
		throw new Exception("Access denied");
		
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		
		if(client.equals("ADMIN") || client.equals("USER")) {
			return employeeDaoObj.get(client, employeeId);
		}
		
		throw new Exception("Access denied");
		
	}

}
