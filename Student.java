public class Student extends User{

    private String studentNumber;
    private String classroom;


    public Student(int id, String name, String studentNumber, String classroom) {
        super(id, name);
        this.studentNumber = studentNumber;
        this.classroom = classroom;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
