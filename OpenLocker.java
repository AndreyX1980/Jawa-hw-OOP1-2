public class OpenLocker {
    Person p;
    Locker l;

    public OpenLocker(Person p, Locker l) {
        this.p = p;
        this.l = l;
    }

    public Locker openLocker() {
        if (p.getpassword() == "O.K." && l.getStatus() == "Close") {
            l.setStatus("Open");
            System.out.println("Шкаф открыт!");
        }
        return l;

    }

}