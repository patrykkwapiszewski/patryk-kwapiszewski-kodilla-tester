public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 2);
        System.out.println(notebook.weight + " " + notebook.price);
        System.out.println(notebook.price);

        Notebook heavyNotebook = new Notebook("1000g", 3);
        System.out.println(heavyNotebook.weight);
        System.out.println(heavyNotebook.price);
        Notebook oldNotebook = new Notebook("1500g", 100);
        System.out.println(oldNotebook.weight);
        System.out.println(oldNotebook.price);
    }
}
