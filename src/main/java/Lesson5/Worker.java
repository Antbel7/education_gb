package Lesson5;

public class Worker {

    private String name;
    private String post;
    private String email;
    private String number;
    private int money;
    private int age;

    public Worker (String name, String post, String email,
                   String number, int money, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.number = number;
        this.money = money;
        this.age = age;


    }
    public void base() {

       System.out.printf("Фамилия: %s \n" +
                          "Призвание: %s \n" +
                           "email: %s \n" +
                             "Номер телефона: %s \n" +
                                "Получка: %s \n"+
                                    "Возраст: %s \n",name, post, email, number, money,age );
    }

    public int getAge (){
        return age;
    }

}
