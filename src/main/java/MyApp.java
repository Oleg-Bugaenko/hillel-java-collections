
import java.util.*;

public class MyApp {
    public static void main(String[] args) {
// 1)
        System.out.println("++++ task 1 +++");
        List<String> text = new ArrayList<>(Arrays.asList("two", "green", "want", "chair", "music", "hot dog",
                "year", "winter", "warm", "chair", "white", "coat", "scarf", "green", "music", "chair", "year"));
        countOccurence(text, "chair");

// 2)
        System.out.println("\n++++ task 2 +++");
        Integer[] num = {20, 10, 34, 56, 2};
        List<Integer> list = toList(num);
        System.out.println(list.toString());

// 3)
        System.out.println("\n++++ task 3 +++");
        List<Integer> numInt = Arrays.asList(10, 56, 67, 98, 45, 56, 18, 4, 45);
        System.out.println(findUnique(numInt));
        List<Double> numDouble = Arrays.asList(23.5, 67.45, 56., 98.6, 67.45, 12.3);
        System.out.println(findUnique(numDouble));

// 4)
        System.out.println("\n++++ task 4 +++");
        List<String> words = new ArrayList<>(Arrays.asList("two","two", "green", "year", "coat", "scarf", "green"));
        calcOccurence(words);

// 5)
        System.out.println("\n++++ task 5 +++");
        List<String[]> occurenceWord = findOccurence(words);
        if (occurenceWord != null) {
            for (String[] array: occurenceWord) {
                System.out.println(Arrays.toString(array));
            }
        }
    }


    public static void countOccurence(List<String> list, String word) {
        if (list.size() == 0) {
            System.out.println("There are no words in the passed array");
        } else if (word.equals("")) {
            System.out.println("Тo search word passed");
        } else {
            int count = 0;
            for (String text: list) if (word.equals(text)) count++;
            if (count == 0) {
                System.out.println("The search word is not in the set");
            } else System.out.printf("The word '%s' occurs %d times\n", word, count);
        }
    }

    public static <T> List<T> toList(T[] array) {
        return Arrays.stream(array).toList();
    }

    public static <T> List<T> findUnique (List<T> source) {
        if (source.size() <= 1) return source;

        List<T> destination = new ArrayList<>();
        destination.add(source.get(0));

        for (int i = 1; i < source.size(); i++) {
            T value = source.get(i);
            if ( ! destination.contains(value)) destination.add(value);
        }
        return destination;
    }

    public static void calcOccurence(List<String> words) {
        if (words.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        List<String> source = new ArrayList<>(words);
        int counter;
        for (int i = 0; i < source.size(); i++) {
            counter = 1;
            String word = source.get(i);
            for (int j = i+1; j < source.size() ; j++) {
                if (word.equals(source.get(j))) {
                    source.remove(j);
                    counter++;
                    j--;
                }
            }
            System.out.printf("Word '%s' occurs %d times \n", word, counter);
        }
    }

    public static List<String[]>  findOccurence(List<String> words) {
        if (words.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }

        List<String[]> occurence = new ArrayList<>();
        List<String> source = new ArrayList<>(words);

        int counter;
        for (int i = 0; i < source.size(); i++) {
            counter = 1;
            String word = source.get(i);
            for (int j = i+1; j < source.size(); j++) {
                if (word.equals(source.get(j))) {
                    source.remove(j);
                    counter++;
                    j--;
                }
            }
            occurence.add(new String[]{"name: " + "\"" + word + "\"",  "occurrence: " + counter});
        }
        return occurence;
    }

}
