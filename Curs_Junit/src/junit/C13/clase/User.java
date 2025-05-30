package junit.C13.clase;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class User {
    private String username;
    private String email;
    private int age;
    private List<String> roles;
    private LocalDateTime createdAt;

    public User(String username, String email, int age, List<String> roles) {
        if (username == null || username.contains(" ")) throw new IllegalArgumentException("Invalid username");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (age < 0 || age > 150) throw new IllegalArgumentException("Invalid age");

        this.username = username;
        this.email = email;
        this.age = age;
        this.roles = Objects.requireNonNull(roles);
        this.createdAt = LocalDateTime.now();
    }

    public List<String> getRoles() {
        return roles;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
