import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_Lambda {
    public static void main(String[] args) {
        List<String> allcollors =  new ArrayList<String>();
        allcollors.add("zielony");
        allcollors.add("Niebieski");
        allcollors.add("pomaranczowy");
        allcollors.forEach(System.out::println);

        List<String> newstream = allcollors.stream().sorted((s1,s2) ->s1.compareToIgnoreCase(s2)).limit(2).collect(Collectors.toList());
        System.out.println(newstream);


    }
}
