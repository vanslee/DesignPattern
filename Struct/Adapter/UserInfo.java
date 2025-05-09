package Struct.Adapter;

public class UserInfo {
    private String id;
    private String name;
    private String email;
    
    public UserInfo(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserInfo [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
    
}
