import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.println("Shuffled Array : " + Arrays.toString(shuffleArray(array)));
    }

    public static int[] shuffleArray(int[] originalArray) {

        int[] shuffledArray = new int[originalArray.length];
        Random random = new Random();

        for (int i = 0; i < originalArray.length; i++) {

            int randomIndex = random.nextInt(originalArray.length);

            while (shuffledArray[randomIndex] != 0)
                randomIndex = random.nextInt(originalArray.length);

            shuffledArray[randomIndex] = originalArray[i];
        }

        return shuffledArray;
    }
}
