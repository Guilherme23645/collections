import java.util.Optional;

import domain.User;

import static domain.SexEnum.MALE;

public class Main {
    public static void main(String[] args) {
        /*
        Optional enables NullPointerException handling by return Optional.empty() instead of null
        To be used when data retrieval methods return null
        */ 
        Optional<User> optional = Optional.of(new User("Lloyd",19,MALE));
        optional.ifPresent(System.out::println);
    }
}