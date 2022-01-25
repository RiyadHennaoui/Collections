import java.util.LinkedList;
import java.util.ListIterator;

public class SampleLinkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        System.out.print("Liste en A : ");
        affiche(linkedList);
    /*
    Pour ajouter un élément à la liste vous pouvez utliser la méthode add
     */
        linkedList.add("a");
        linkedList.add("b");

        System.out.print("Liste en B : ");
        affiche(linkedList);


        ListIterator<String> iterator;
        iterator = linkedList.listIterator();

        // on se place sur le premier élément
        iterator.next();
        //On ajoute deux éléments
        iterator.add("c");
        iterator.add("b");
        System.out.print("Liste en C : ");
        affiche(linkedList);


        iterator = linkedList.listIterator();
        iterator.next();
        iterator.add("b");
        iterator.add("b");
        System.out.print("Liste en D : ");
        affiche(linkedList);

        // utilisation de l'iterateur bidirectionnel avec previous.
        iterator = linkedList.listIterator(linkedList.size());
        // Suppression du dernier élément si c'est un "c".
        while (iterator.hasPrevious()){
            String ch = iterator.previous();
            if (ch.equals("c")){
                iterator.remove();
                break;
            }
        }
        System.out.print("Liste en E : ");
        affiche(linkedList);

        // Modifier un élément.
        iterator = linkedList.listIterator();
        // on se place en deuxième position de la liste
        iterator.next();
        iterator.next();
        iterator.set("x");

        System.out.print("Liste en F : ");
        affiche(linkedList);

    }


    private static void affiche(LinkedList<String> l){
        ListIterator<String> iterator = l.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

    }

}
