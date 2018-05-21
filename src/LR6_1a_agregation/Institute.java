package LR6_1a_agregation;

import java.util.List;

public class Institute {
    String instituteName;
    private List<Department> departments;

    Institute(String instituteName, List<Department> departments){
        this.instituteName = instituteName;
        this.departments = departments;
    }
    // count total students of all departments in a given institute
    public int getTotalStudentsInInstitute(){
        int numoOfStudents = 0;
        List<Student> students;
        for (Department dept : departments){
            students = dept.getStudents();
            for (Student s : students){
                numoOfStudents++;
            }
        }
        return numoOfStudents;
    }

}
