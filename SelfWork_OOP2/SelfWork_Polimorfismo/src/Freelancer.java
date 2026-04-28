public class Freelancer extends Employee{

    public String project;

    public Freelancer(String name, String surname, int age, int salary, String project) {
        super(name, surname, age, salary);
        this.project = project;
    }

    public void workOnProject() {
        System.out.println(" Il Freelancer " + name + surname + " lavora al progetto " + project + " !");
    }

    public void  getSalaryCommission() {
        System.out.println(" La provigione per il progetto " + project + " è pari a " + salary + " euro");
    }
}
