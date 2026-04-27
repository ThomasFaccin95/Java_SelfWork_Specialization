public class Teacher extends Employee {

    public String subject;

    public Teacher(String name, String surname, int age, int salary, String subject) {
        super(name, surname, age, salary);
        this.subject = subject;
    }

    
    public void infoSubject() {
        System.out.println(" Il docente " + name + " " + surname+ " insegna la materia " + subject + " !");
    }

    public void getSalary() {
        System.out.println( " Il compenso del docente " + name + " " + surname + " corrisponde a " + salary + " euro");
    }

}
