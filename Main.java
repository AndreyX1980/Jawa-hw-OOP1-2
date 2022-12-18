public class Main {
    public static void main(String[] args) {

        Person Mike = new Person("Mike", "No");
        Locker locker = new Locker("Close");

        SearchKey ishem = new SearchKey(Mike, locker);
        OpenLocker open = new OpenLocker(Mike, locker);

        // начальное сотояние
        System.out.println("Вошел в комнату");
        System.out.println(Mike);
        System.out.println(locker);

        if ((Mike.getpassword() == "O.K." || Mike.getpassword() == "No") && locker.getStatus() == "Open") {
            System.out.println("Шкаф открыт!");
        } else if (Mike.getpassword() == "O.K." && locker.getStatus() == "Close") {
            // знаем пароль (шкаф закрыт), в OpenLocker запускаем openLocker()
            open.openLocker();
            System.out.println(Mike);
            System.out.println(locker);
        } else if (Mike.getpassword() == "No" && locker.getStatus() == "Close") {
            // не знает пароль (шкаф закрыт)
            // в SearchKey, запускаем poisk()
            ishem.poisk();
            // меняем статус пароля No на O.K.
            System.out.println(Mike);
            System.out.println(locker);

            // есть пароль (шкаф закрыт), в OpenLocker запускаем openLocker()
            open.openLocker();
            System.out.println(locker);

        }
    }
}