import java.util.ArrayList;

public class Student {
    private int studentId;
    private String Name;
    private String Family;
    private int Age;
    ArrayList<Course> courseList=new ArrayList<>();

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void courseInfo() {
        for (Course item : courseList) {
            System.out.println("Course : " + "\n" + "Course Code :" + item.getCourseCode() + "\t\t" + "Course Name : " + item.getCourseName() + "\t\t" + "Course Unit : " + item.getCourseUnit());
            item.getTeacher().printTeacherInfo();
        }

    }


    public void printStudentInfo() {
        System.out.println("Id : " + studentId + "\t" + "Name : " + Name + "\t" + "Family : " + Family + "\t" + "Age : " + Age);
    }

    public Student() {
    }

    public Student(int studentId, String name, String family, int age) {
        this.studentId = studentId;
        Name = name;
        Family = family;
        Age = age;
    }

    public Student(int studentId, String name, String family, int age, ArrayList<Course> courseList) {
        this.studentId = studentId;
        Name = name;
        Family = family;
        Age = age;
        this.courseList = courseList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
