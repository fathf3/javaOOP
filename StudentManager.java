public class StudentManager extends UserManager {

    public void classroom(Student student){
        System.out.println(student.getName() +" isimli ogrenci "+ student.getClassroom() + " Sınıfında" );
    }

}
