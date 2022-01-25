import java.util.ArrayList;

public class SampleArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        /*
        A - Afficher la taille de la liste
         */
        System.out.println("En A : taille de la liste = " + arrayList.size());

        /*
        B - Ajouter 10 objets de type Integer
         */
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.print("En B : taille de la liste = " + arrayList.size());

        /*
        B - Afficher le contenu de la liste
         */
        System.out.print("En B : contenue de la liste = ");
        for (Integer e : arrayList) {
            System.out.print(e + " ");
        }
        System.out.println();


        /*
        C - suppression des éléments dans une position donnée
         */
        arrayList.remove(3);
        arrayList.remove(5);
        arrayList.remove(5);

        System.out.println("En C : contenue de la liste = " + arrayList);

        /*
        D - ajout d'éléments à une position donnée
         */

        arrayList.add(2, 100);
        arrayList.add(2, 200);

        System.out.println("En D : contenue de la liste après ajout = " + arrayList);

        /*
        D - modification d'éléments à une position donnée'
         */

        arrayList.set(2, 1000);
        arrayList.set(5, 2000);

        System.out.println("En D : contenue de la liste après modifications = " + arrayList);


    }

}
