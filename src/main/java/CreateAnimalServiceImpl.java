public class CreateAnimalServiceImpl extends CreateAnimalService {
    public static void createAnimals(int N) {
        System.out.println("Create Animal with cycle for:");
        for (int i = 0; i < N; i++) {
            Animal animal;
            byte remainder = (byte) (N % 4);
            switch (remainder) {
                case 3:
                    animal = new Wolf();
                    break;
                case 2:
                    animal = new Shark();
                    break;
                case 1:
                    animal = new Cat();
                    break;
                case 0:
                    animal = new Dog();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + remainder);
            }
            System.out.println("Created a new animal " + i + ": " + animal.getName());
        }
    }

    @Override
    public void createAnimals() {
        byte count = 0;
        System.out.println("Create Animal with cycle do-while:");

        do {
            Animal animal;
            byte remainder = (byte) (count % 4);
            switch (remainder) {
                case 3:
                    animal = new Wolf();
                    break;
                case 2:
                    animal = new Shark();
                    break;
                case 1:
                    animal = new Cat();
                    break;
                case 0:
                    animal = new Dog();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + remainder);
            }

            System.out.println("Created a new animal " + count + ": " + animal.getName());
            count++;
        }
        while (count < 10);
    }
}
