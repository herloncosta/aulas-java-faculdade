import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class School {

    private String name;
    private List<Department> departments;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<Department>();
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void createDepartment(String name) {
        departments.add(new Department(name));
    }

    public void closeDepartment(Department department) {
        departments.remove(department);
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void registrationLocking(Student student) {
        students.remove(student);
    }

    // Primeira abordagem
    public void groupingStudentsList() {
        Map<String, List<Student>> grouping = students.stream().collect(Collectors.groupingBy(Student::getNaturalness));
        System.out.println("Grouping result: ");
        grouping.forEach((String key, List<Student> list) -> System.out.println(key + " - " + list));
    }

    // Segunda abordagem
    public void groupingStudentsSet(int x) {
        Map<String, Set<Student>> grouping = students.stream()
                .collect(Collectors.groupingBy(Student::getNaturalness, Collectors.toSet()));
        System.out.println("Grouping result: ");
        grouping.forEach((String key, Set<Student> set) -> System.out.println(key + " - " + set));
    }

    // Terceira abordagem
    public void groupingStudentsTreeMap(double x) {
        Map<String, Set<Student>> grouping = students.stream()
                .collect(Collectors.groupingBy(Student::getNaturalness, TreeMap::new, Collectors.toSet()));
        System.out.println("Grouping result: ");
        grouping.forEach((String key, Set<Student> set) -> System.out.println(key + " - " + set));
    }
}
