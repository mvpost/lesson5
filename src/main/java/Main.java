import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        CreateAnimalService createAnimalService = new CreateAnimalService();
        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        CheckLeapYearAnimalImpl checkLeapYearAnimalImpl = new CheckLeapYearAnimalImpl();

        createAnimalService.createAnimals();
        createAnimalServiceImpl.createAnimals(5);
        createAnimalServiceImpl.createAnimals();
    }
}