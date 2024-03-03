package agrupamento_objetos.agrupamento;

public class Main {
    private static Student student1, student2, student3, student4, student5, student6, student7, student8, student9;
    private static School school;

    private static void makeStudents() {
        student1 = new Student("Alice", "Nova York");
        student2 = new Student("Bob", "Dallas");
        student3 = new Student("Carol", "Chicago");
        student4 = new Student("David", "Houston");
        student5 = new Student("Eve", "Houston");
        student6 = new Student("Frank", "Filadélfia");
        student7 = new Student("Grace", "San Diego");
        student8 = new Student("Henry", "San Diego");
        student9 = new Student("Ivy", "Dallas");
    }

    private static void enrollStudents() {
        school.enrollStudent(student1);
        school.enrollStudent(student2);
        school.enrollStudent(student3);
        school.enrollStudent(student4);
        school.enrollStudent(student5);
        school.enrollStudent(student6);
        school.enrollStudent(student7);
        school.enrollStudent(student8);
        school.enrollStudent(student9);
    }

    public static void main(String[] args) {
        school = new School("School Example", "00.000.000/0000-11");
        makeStudents();
        enrollStudents();

        school.groupStudents();
    }
}
