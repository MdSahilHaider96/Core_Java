package October9th;

import java.util.Comparator;

public class SortbyName implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
