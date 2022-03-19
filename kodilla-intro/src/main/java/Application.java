public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    static Application adam = new Application("Adam", 23, 1.82);

    public static void main(String[] args){
        if (adam.name != null){
            if (adam.age > 30 && adam.height > 1.6){
                System.out.println("User is older than 30 and higher than 1.6m");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
