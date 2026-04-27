public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----------------------------------------");

        Employee antonio = new Employee("Antonio", "Rossi", 30, 3000);

        Student maria = new Student("Maria", "Bianchi", 20, 28);

        antonio.displayInfo();

        maria.displayInfo();

        System.out.println("----------------------------------------");

        Teacher mario = new Teacher("Mario", "Verdi", 40, 4000, "Matematica");

        mario.infoSubject();

        mario.getSalary();

        System.out.println("----------------------------------------");

        Freelancer luca = new Freelancer("Luca", "Neri", 25, 2000, "Sviluppo App");

        luca.workOnProject();
        
        luca.getSalaryCommission();
    }

}
