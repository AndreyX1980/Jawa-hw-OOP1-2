public class SearchKey {

    Person p;
    Locker l;

    public SearchKey (Person p, Locker l){
        this.p = p;
        this.l = l;
    }

    public Person poisk (){

        if (p.getpassword() == "No" && l.getStatus() == "Close"){
            System.out.println("Закрыто! Введите пароль!");
            System.out.println("Подсказка: Дата первого свидания?");
            System.out.println("Вспомнил!");
            p.setpassword("O.K.");
        }
        return p;
    }

}