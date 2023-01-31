package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1=new Student("Andrew Demikov",3,7.8);
        Student st2=new Student("Evgeniy Ermishin",4,10);
        Student st3=new Student("Anastasia Khodakina",1,8.1);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
//        students.get(3);
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
