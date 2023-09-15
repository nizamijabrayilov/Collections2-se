package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudents {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        var student1 = new Student();
        student1.name = "Nizami";
        student1.age = 19;
        student1.ID = 1002;

        var student2 = new Student();
        student2.name = "Rustem";
        student2.age = 18;
        student2.ID = 1001;

        var student3 = new Student();
        student3.name = "Rustem";
        student3.age = 20;
        student3.ID = 999;

        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list, new Student());

        System.out.println(list);
    }
}
