public class Student {
    private String firstname;
    private String lastname;
    int age;

    public String getName() {
        return firstname + "" +lastname;
    }
    public void setName(String name) {
        this.firstname = name.split(" ")[0];
        this.lastname = name.split(" ")[1];
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
