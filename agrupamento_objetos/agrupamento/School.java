package agrupamento_objetos.agrupamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private String name, CNPJ;
    private Address address;
    private List<Department> departments;
    private List<Student> students;

    public School(String name, String CNPJ) {
        this.name = name;
        this.CNPJ = CNPJ;
        this.departments = new ArrayList<Department>();
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public Address getAddress() {
        return address;
    }

    public boolean createDepartment(String name) {
        if (!departmentExists(name)) {
            return departments.add(new Department(name));
        }

        return false;
    }

    public void closeDepartment(Department department) {
        departments.remove(department);
    }

    private boolean departmentExists(String name) {
        boolean exists = false;
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                exists = true;
            }
        }

        return exists;
    }

    public boolean enrollStudent(Student student) {
        if (!studentExists(student)) {
            return students.add(student);
        }

        return false;
    }

    public void lockStudentRegistration(Student student) {
        students.remove(student);
    }

    private boolean studentExists(Student student) {
        return students.contains(student) ? true : false;
    }

    public void groupStudents() {
        Map<String, List<Student>> group = new HashMap<>();

        for (Student student : students) {
            if (!group.containsKey(student.getNaturalness())) {
                group.put(student.getNaturalness(), new ArrayList<>());
            }
            group.get(student.getNaturalness()).add(student);
        }

        System.out.println("Result of grouping by place of birth: " + group);
    }
}
