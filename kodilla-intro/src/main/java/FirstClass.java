public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 900, 2019);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkLaptop();

        Notebook heavyNotebook = new Notebook(1500, 1500, 2017);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkLaptop();

        Notebook oldNotebook = new Notebook(2000, 500, 1998);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkLaptop();

//        if (notebook.price < 900) {
//            System.out.println("This notebook is cheap");
//        } else {
//            System.out.println("This notebook is quie expensive");
//        }
    }
}
