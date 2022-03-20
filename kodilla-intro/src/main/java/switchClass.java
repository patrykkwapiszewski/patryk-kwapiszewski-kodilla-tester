import java.util.Scanner;

public class switchClass {
//    enum colorSelector {
//        BL,
//        RE,
//        YE,
//        GR
//    }
        public static String getUserColor () {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Select color (BL=blue, RE=red, YE=yellow, GR=green):");
                String color = scanner.nextLine().trim().toUpperCase();
                String result = new String();
                switch (color) {
                    case "BL":
                        result = "BLUE";
                        break;
                    case "RE":
                        result = "RED";
                        break;
                    case "YE":
                        result = "YELLOW";
                        break;
                    case "GR":
                        result = "GREEN";
                        break;
                    default:
                        System.out.println(result);
                }
            }
        }
        public static void main(String[] args) {
        switchClass.getUserColor();
        }
    }

