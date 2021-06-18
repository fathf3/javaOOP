public class UserManager {

    public void add(User user){
        System.out.println(user.getName() + " is Save");
    }
    public void addMultiple(User[] users){
        for (User user : users){
            add(user);
        }
    }


}
