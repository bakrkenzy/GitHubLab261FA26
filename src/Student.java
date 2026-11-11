public class Student {
    private String name;
    private int age;
    private String gitHubLogin;

    public Student(String name, int age, String gitHubLogin) {
        this.name = name;
        this.age = age;
        this.gitHubLogin = gitHubLogin;
    }

    @Override
    public String toString() {
        return name + "\t|\tage " + age + "\t|\tlogin: " + gitHubLogin;
    }
}
