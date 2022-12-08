@Apple
public class Rabotnik {
    private int id;
    private String name;
    private String profession;
//Constructor
    public Rabotnik(int id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }
//print information about Employee
    public void getRabotnikDetails(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee profession: " + profession);
    }
}
