package Builder1;

class TestBuilder {
    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasCar(false).setHasBike(true).build();
        // Print the employee details using toString()
        System.out.println(employee.toString());
    }
}