import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class listEg {
    public static void main(String[] args) {
        List<List<Integer>> list=Arrays.asList(Arrays.asList(3,2,4),
                Arrays.asList(2,4),
                Arrays.asList(4,5,6));
        System.out.println(list);
        List<Integer> ans=list.stream().flatMap(Collection::stream).toList();
        System.out.println(ans);
    }
}
