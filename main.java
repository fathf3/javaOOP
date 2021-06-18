public  class main {

    public static void main(String[] args) {

        Student fatih = new Student(1,"Fatih","123","11-A");
        Instructor engin = new Instructor(2,"Engin","Matematik","5522330");

        UserManager userManager = new UserManager();

        User[] users = {fatih, engin};

        userManager.addMultiple(users);

        StudentManager studentManager = new StudentManager();
        studentManager.classroom(fatih);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.bolum(engin);

    }
}
