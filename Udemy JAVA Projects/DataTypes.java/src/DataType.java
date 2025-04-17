public class DataType {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp.name = "Jeff";
        emp.age = 32;
        emp.jobTitle = "Constructor Worker";

        emp2.name = "Sarah";
        emp2.age = 28;
        emp2.jobTitle = "Electrician";

        emp3.name = "Bill";
        emp3.age = 37;
        emp3.jobTitle = "Project Manager";
        bar(emp);
        bar(emp2);
        bar(emp3);
    }
    static void bar(Employee e) {
        System.out.println(e.name + " is " + e.age + " years old and is a " + e.jobTitle);
    }
}