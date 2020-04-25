import java.util.ArrayList;

public class UserList {

    private ArrayList<User> users;

    public UserList(){
        users = new ArrayList<User>();
    }

    public void addUser(User toAdd){
        users.add(toAdd);
    }

    public ArrayList<User> getList(){
        return users;
    }

    public void showUsers(){
        int count = users.size();
        int iter = 0;
        while(iter < count){
            System.out.println(users.get(iter).getName());
            iter++;
        }
    }

}
