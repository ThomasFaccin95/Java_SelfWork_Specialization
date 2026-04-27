public class Student extends Person {

    public int everage;

    public Student(String name, String surname, int age, int everage) {
        super(name, surname, age);
        this.everage = everage;
    }

    @Override
    public void displayInfo() {
        System.out.println(" ciao a tutti, mi chiamo " + name + " " + surname + " e ho " + age + " anni e la mia media è di " + everage);
    }
    
}
