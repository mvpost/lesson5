import java.time.YearMonth;

public class CheckLeapYearAnimalImpl {
    void checkLeapYearAnimal(Animal animal) {
        if (animal == null)
            throw new InvalidAnimalException("На вход пришел некорректный объект животного");
        int year = animal.getBirthDate().getYear();
        int daysOfFebruary = YearMonth.of(year, 2).lengthOfMonth();

        if (daysOfFebruary == 29)
            System.out.println(animal.getName() + " рожден в високосный год");
        else
            System.out.println(animal.getName() + " рожден не в високосный год");
    }
}
