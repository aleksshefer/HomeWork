package variables;

public class Friend {
    String name;
    int age;
    boolean isFriendFromSchool;
    long phoneNumber;

    public Friend(String name, int age, boolean isFriendFromSchool, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFriendFromSchool=" + isFriendFromSchool +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
