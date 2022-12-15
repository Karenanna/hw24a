package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        new Passport("8787889", "Борис", "Харитонов", "Богданович",
                        LocalDate.now().minusYears(18));
        passports.add(
        new Passport("9876543", "Анна", "Рибенштейн", "Абрамовна",
                LocalDate.now().minusYears(28)));

        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
    }
}
