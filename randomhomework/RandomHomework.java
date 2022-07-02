package randomhomework;

import java.util.Random;
import java.util.Scanner;

public class RandomHomework {
    public static String[] nameList() {
        String[] list = {"Ali Furkan Erguven", "Alim Yogurtcu", "Arda Kozan", "Beytullah Zor", "Burak Can Gultekin",
                "Dogus Saglam", "Emre Yildiz", "Furkan Gurcay", "Huseyin Baris Aktas", "Ibrahim Bayramli",
                "Kadir Irpik", "Kubilay Alp Agacan", "Mehmet Mustafa Ozcelik", "Mustafa Kemal", "Omer Faruk Caliskan",
                "Seyda Ozdemir", "Tolga Gureli", "Tuba Argin", "Yigit Ozen"};
        return list;
    }

    public static void randomHomework(String list[], String homework) {
        int mathRandom = (int) Math.round(Math.random() * 18 + 1);
        for (int i = 0; i < list.length; i++) {
            if (mathRandom == i) {
                System.out.println(homework + " will do the homework person : " + list[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Homework : ");
        String homework = scan.nextLine();
        String[] list = nameList();
        randomHomework(list, homework);
    }

}
