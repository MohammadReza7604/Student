public class MainClass {
    public static void main(String[] args) {
        Student student1;
        Course course1;
        Course course2;
        Course course3;
        Teacher teacher1;
        Teacher teacher2;
        student1=new Student(2646,"Mohammad Reza","Behzadi Moqadam",23);
        teacher1=new Teacher(799,"Mehdi","Abbasi");
        teacher2=new Teacher(135,"Qafar","Qafari");
        course1=new Course(4564,"Database",2,new Teacher(5645,"Ali","Sarhadi"));
        course2=new Course(454,"Java",3,teacher1);
        course3=new Course(313,"Erfan",3,teacher2);
        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);
        student1.printStudentInfo();
        student1.courseInfo();
    }
}
