import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CheckLeapYearAnimalImplTest {

    CheckLeapYearAnimalImpl checkLeapYearAnimalImpl = new CheckLeapYearAnimalImpl();

    @Test
    public void CheckNonLeapYear() {
        Wolf wolf = new Wolf();
        wolf.birthDate = LocalDate.of(2021, 1, 8);
        wolf.name = "Fluff";

        Assertions.assertEquals(checkLeapYearAnimalImpl.checkLeapYearAnimal(wolf),"Fluff was born in a non-leap year");
    }

    @Test
    public void CheckLeapYear() {
        Cat cat = new Cat();
        cat.birthDate = LocalDate.of(2020, 7, 10);
        cat.name = "Vasya";

        Assertions.assertEquals(checkLeapYearAnimalImpl.checkLeapYearAnimal(cat),"Vasya was born in a leap year");
    }

    @Test
    public void CheckLeapYearNullException() throws InvalidAnimalException {
        InvalidAnimalException exception = Assertions.assertThrows(InvalidAnimalException.class,
                ()-> checkLeapYearAnimalImpl.checkLeapYearAnimal(null));
        Assertions.assertEquals("Invalid animal", exception.getMessage());
    }

}