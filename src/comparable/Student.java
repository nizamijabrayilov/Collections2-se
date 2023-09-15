package comparable;

public class Student implements Comparable<Student>{

    public String name;
    public Integer age;
    public Integer ID;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Id='" + ID + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.ID == student.ID){
        return 0;} else if (this.ID > student.ID) {
            return 1;
        }return -1;
    }
}
