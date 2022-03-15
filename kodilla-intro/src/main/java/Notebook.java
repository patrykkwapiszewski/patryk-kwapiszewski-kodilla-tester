public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap");
        } else {
            if (this.price < 1000) {
                System.out.println("The price is good");
            } else {
                System.out.println("This notebook is expensive");
            }
        }
    }

    public void checkWeight() {
        if (this.weight < 900) {
            System.out.println("This notebook is light");
        } else {
            if (this.weight < 2000) {
                System.out.println("This notebook is middle_weight");
            } else {
                System.out.println("This notebook is heavy");
            }
        }
    }

    public void checkLaptop() {
        if (this.price < 1500 & year > 2017) {
            System.out.println("This notebook is good");
        } else {
            System.out.println("This laptop is bad");
        }
    }

}
