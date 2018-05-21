package LR6_1a_agregation;

import java.util.List;

class Department {
    String name;
    private List<Student> students;

    Department(String name, List<Student> students){
        this.name = name;
        this.students = students;
    }

    public List <Student> getStudents() {
        return students;
    }
}
