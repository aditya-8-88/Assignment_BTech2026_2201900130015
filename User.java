import java.util.*;

class User {
    private String name;
    private Set<User> followers = new HashSet<>();

    public User(String name) { this.name = name; }

    public void follow(User user) { user.followers.add(this); }

    public int getFollowerCount() { return followers.size(); }
}
