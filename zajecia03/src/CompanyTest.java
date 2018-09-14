public class CompanyTest {
    public static void main(String[] args) {
        Employee employee1=new Employee("Jan", "Kowalski", 3000);
        Company company =new Company();
        company.increaseSalary(employee1);

        System.out.println(employee1.salary);
    }
}
