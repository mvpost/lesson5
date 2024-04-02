public class CheckLeapYearAnimalImpl {
    void checkLeapYearAnimal(Animal animal) {
        if (animal == null)
            throw new InvalidAnimalException("На вход пришел некорректный объект животного");

        System.out.printf("%s рождён в %s год%n", animal.getName(),
                animal.getBirthDate().isLeapYear() ? "високосный" : "невисокосный");
    }
}
