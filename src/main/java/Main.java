import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService();
        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        CheckLeapYearAnimalImpl checkLeapYearAnimalImpl = new CheckLeapYearAnimalImpl();

        createAnimalService.createAnimals();
        createAnimalServiceImpl.createAnimals(5);
        createAnimalServiceImpl.createAnimals();

        Wolf wolf = new Wolf();
        wolf.birthDate = LocalDate.of(2021, 1, 8);
        wolf.name = "Пушок";

        Cat cat = new Cat();
        cat.birthDate = LocalDate.of(2020, 7, 10);
        cat.name = "Васька";

        Shark shark = new Shark();

        try {
            checkLeapYearAnimalImpl.checkLeapYearAnimal(wolf);
            checkLeapYearAnimalImpl.checkLeapYearAnimal(cat);
            //checkLeapYearAnimalImpl.checkLeapYearAnimal(shark);
            //checkLeapYearAnimalImpl.checkLeapYearAnimal(null);
        } catch (Exception e) {
            try {
                throw new InvalidAnimalBirthDateException("У животного "+ shark.getName()
                        + " не указана дата рождения");
            } catch (InvalidAnimalBirthDateException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}