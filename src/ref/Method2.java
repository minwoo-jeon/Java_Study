package ref;

public class Method2 {
    public static void main(String[] args) {
        // 리펙토링 작업
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name,int age, int grade) {
        Student student = new Student(); //x001
        student.name = name;
        student.age = age;
        student.grade =grade;
        return  student;
    }

    static void  printStudent(Student student){
        System.out.println("이름:"+ student.name + "나이:"+student.age+"학점:"+student.grade);
    }
}
