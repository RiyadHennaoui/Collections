import java.util.LinkedList;
import java.util.ListIterator;

public class SampleLinkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

    /*
    Pour ajouter un élément à la liste vous pouvez utliser la méthode add
     */
        linkedList.add("a");
        linkedList.add("b");

        ListIterator<String> iterator;
        iterator = linkedList.listIterator();




    }


    private static void affiche(LinkedList<String> l){
        ListIterator<String> iterator = l.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

    }

}
