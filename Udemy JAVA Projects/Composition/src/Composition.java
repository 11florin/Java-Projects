public class Composition {
    //Human has brain
    //Employees has a manager
    //House has an address
    //Book has pages
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Florin Albu");
        student.setDateOfBirth("30/06/1998");
        student.setStudentHousing(true);
        student.setCourse(new Course()); //this 4 lines
        student.getCourse().setTitle("Computer Science");
        student.getCourse().setLevel("undergraduate");
        student.getCourse().setStartDate("15/02/2024");


        Course c = student.getCourse();
        c.setTitle("Computer Science");
        c.setLevel("Undergraduate");
        c.setStartDate("24/02/2024");//this 4 lines does the same as

        System.out.println("Name: " + student.getName());
        System.out.println("DoB: " + student.getDateOfBirth());
        System.out.println("Housing: " + (student.hasStudentHousing() ? "yes" : "no"));
        System.out.println("The student: " + student.getName() + " is enrolled " + student.getCourse().getTitle() + " course due to start on " + student.getCourse().getStartDate());
    }
}