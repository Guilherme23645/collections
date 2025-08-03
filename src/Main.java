import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        var user = new User(143,"Regina");
        users.add(user);
        users.add(new User(123, "Julius"));
        System.out.println(users.contains(user));
        System.out.println(users.get(0));
        System.out.println(user.equals(new User(143,"Regina")));
    }
}