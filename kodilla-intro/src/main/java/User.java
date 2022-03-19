public class User {

    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    static User patryk = new User(24, "Patryk");
    static User  jakub = new User(23, "Jakub");
    static User martyna = new User(23, "Martyna");
    static User kacper = new User(27, "Kacper");
    static User karol = new User(31, "Karol");

    public static User[] users = {patryk, jakub, martyna, kacper, karol};

    public static void main(String[] args) {
        int sumAge = 0;
        for (int i = 0; i < users.length; i++) {
            sumAge = sumAge + users[i].age;
        }
        int ageAvg = sumAge / users.length;
        System.out.println(sumAge + " " + ageAvg);
    }


}
