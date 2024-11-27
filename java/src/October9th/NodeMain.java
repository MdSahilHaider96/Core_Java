package October9th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NodeMain {
    public static void main(String[] args) {
       List<Node> list = getList();
        System.out.println(list);
        for (Node node : list) {
            System.out.println(node);
        }
        Collections.sort(list, (o1 , o2) -> o1.getId()- o2.getId());
        System.out.println("after Sorting by id");
        System.out.println(list );
        list=getList();
        Collections.sort(list, new SortbyName());
        System.out.println("Sorting by Name");
        System.out.println(list);

    }
    static  List<Node>  getList(){
        List<Node> listNode = new ArrayList<>();
        Node node = new Node(1,"Sahil");
        Node node2 = new Node(4,"Haider");
        Node node3 = new Node(3,"Md");
        listNode.add(node);
        listNode.add(node2);
        listNode.add(node3);
        return listNode;
    }
}
