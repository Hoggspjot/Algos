import java.util.*;
import java.util.stream.Collectors;

public class PlayStream {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        List<Integer> newList = list.stream()
                .filter(num -> num < 50)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newList);

        List<Integer> newList2 = list.stream()
                .filter(num -> num < 50)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(newList2);

        Map<Integer, String> map = Map.of(
                123, "Henry",
                321, "Pavan",
                231, "Somy",
                213, "Azar",
                132,"Ira"
        );

        System.out.println(map);

        Map<Integer, String> newMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1,e2)-> e1,LinkedHashMap::new));

        System.out.println(newMap);

        Map<Integer, String> newMap2 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey
                        , Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(newMap2);


        List<Integer> newList3 = list.stream()
                .distinct()
                .limit(5)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(newList3);

    }
}
