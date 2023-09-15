package comparator;

import java.util.Comparator;

public class Student implements Comparator<Student> {

    public String name;
    public Integer age;
    public Integer ID;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.ID == o2.ID ){
        return 0;} else if (o1.ID > o2.ID) {
return 1;

        }return -1;


    }
}
