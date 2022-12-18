public class Person {
    private String husband;
    private String password;

    public Person(String husband, String password) {
        this.husband = husband;
        this.password = password;

    }

    @Override
    public String toString() {
        return "Person [husband = " + husband + ", password = " + password + "]";
    }

    public String gethusband() {
        return husband;
    }

    public void sethusband(String husband) {
        this.husband = husband;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

}