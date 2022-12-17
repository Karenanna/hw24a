import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            try {
                Product banana = new Product("Банан", 70, 2000);
                Product apple = new Product("Яблоки", 67, 1500);
                Product tomato = new Product("Томаты", 99, 3000);
                Product cherry = new Product("Вишня", 150, 1000);
                System.out.println("Продукт добавлен");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }

        }
        for (int i = 0; i < 2; i++) {
            try {
                Recipe dolma = new Recipe("Долма", 23, 400);
                Recipe borsh = new Recipe("Борщ", 24, 800);
                System.out.println("Продукты добавлены");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}

