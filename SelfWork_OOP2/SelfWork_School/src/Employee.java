public class Employee extends Person {

   public int salary;

    public Employee(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println(" ciao a tutti, mi chiamo " + name + " " + surname + " e ho " + age + " anni e guadagno " + salary);
    }

}
