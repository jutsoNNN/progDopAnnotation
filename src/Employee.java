import java.lang.annotation.Annotation;

@Company
public class Employee {
    private int id;
    private String name;
    private String profession;
//Constructor
    public Employee(int id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }
//print information about Employee
    public void getEmployeeDetails(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee profession: " + profession);
        Annotation companyAnnotation = this
                .getClass()
                .getAnnotation(Company.class);
        Company company = (Company)companyAnnotation;
        System.out.println("Company Name: " + company.nameCopm());
        System.out.println("Company City: " + company.cityCopm());
    }
}
