public class Course {
    private int courseCode;
    private String courseName;
    private int courseUnit;
    private Teacher teacher;

    public Course() {
    }

    public Course(int courseCode, String courseName, int courseUnit, Teacher teacher) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseUnit = courseUnit;
        this.teacher = teacher;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

    public void setCourseUnit(int courseUnit) {
        this.courseUnit = courseUnit;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
