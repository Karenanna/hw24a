package passport;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PassportList passportList = new PassportList(Set.of(
                new Passport("8787889", "Борис", "Харитонов", "Богданович",
                        LocalDate.now().minusYears(18))));
        new Passport("9876543", "Анна", "Рибенштейн", "Абрамовн",
                LocalDate.now().minusYears(28));
        System.out.println(passportList);
    }
}
