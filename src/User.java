import java.util.Objects;

public class User {
    private int code;
    private String name;

    public User(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    } 

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object obj) {
        if(obj instanceof User user) {
            if (this == user) return true;
            if (this.code == user.code && Objects.equals(this.name, user.name)) return true;
        }
        return false;
    }
}
