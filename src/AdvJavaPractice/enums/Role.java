package AdvJavaPractice.enums;

public enum Role {
    ROLE_ADMIN("admin"),
    ROLE_TEACHER("teacher"),
    ROLE_STUDENT("student");

    String name;

    //CONSTRUCOT
    Role(String name) {
        this.name = name;
    }

    //GETTER
    public String getName() {
        return name;
    }
}
