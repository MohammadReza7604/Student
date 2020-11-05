public class Teacher {
    private int teacherCode;
    private String Name;
    private String Family;

    public void printTeacherInfo(){
        System.out.println("Teacher : "+"\n"+"Code : "+teacherCode+"\t\t"+"Name : "+Name+"\t\t"+"Family : "+Family);
    }

    public Teacher() {
    }

    public Teacher(int teacherCode, String name, String family) {
        this.teacherCode = teacherCode;
        Name = name;
        Family = family;
    }

    public int getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(int teacherCode) {
        this.teacherCode = teacherCode;
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
}
