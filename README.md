****# Les Collections


API Collections Existe depuis Java 1.2 en 1998.


## Interface Collection :
`java.util.Collection`
````mermaid

flowchart TD
A([ COLLECTIONS ])
A === B([Set])
A === C([List])
A === D([Queue])
B-.- M[HashSet]
B-.- N[TreeSet]
M-.- O[LinkedHashSet]
C -.- I[ArrayList]
C -.- J[Vector]
C -.- K[LinkedList]
D -.- K[LinkedList]
D -.- L[PriorityQueue]

````


L'interface représente un minimum commun pour les objets qui gèrent des collections :
* Ajout d'éléments
* Suppression d'éléments
* Vérification de la présence d'un objet dans la collection
* parcours de la collection
* etc...



| Méthode                                  | Rôle                                                                                                                                                                                                      |
|------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean add(E e)                         | Ajouter un élément à la liste                                                                                                                                                                             |
| boolean addAll(Collection<? extends E c) | Ajouter tous les éléments de la collection fournie en paramètre dans la collection                                                                                                                        |
| void clear()                             | Supprimer tous les éléments de la collection                                                                                                                                                              |
| boolean contains(Object o)               | Retourner un booléen qui précise si l'élément est présent dans la collection                                                                                                                              |
| boolean containsAll(Collection<?> c)     | Retourner un booléen qui précise si tout les éléments fournie en paramètre sont présents dans la collection                                                                                               |
| boolean equals(Object o)                 | vérifier l'égalité avec la collection fournie en paramètre                                                                                                                                                |
| int hashCode()                           | Retourner la valeur de hachage de la collection                                                                                                                                                           |
| boolean isEmpty()                        | Retourner un booléen qui précise si la collection est vide                                                                                                                                                |
| Iterator<E> iterator()                   | Retourner un iterator qui permet le parcours des éléments de la collection `while(c.hasNext){}`                                                                                                           |
| boolean remove(Object o)                 | Supprimer un élément de la collection                                                                                                                                                                     |
| boolean removeAll(Collection<?> c)       | Supprimer tous les éléments fournis en paramètres de la collection s'ils sont présents                                                                                                                    |
| boolean retainAll(Collection<?> c)       | Ne laisser dans la collection que les éléments fournis en paramètres : les autres éléments sont supprimés (optionnelle). Elle renvoie un booléen qui précise si le contenu de la collection a été modifié |
| int size()                               | Retourner le nombre d'éléments contenus dans la collection                                                                                                                                                |
| Object[] toArray()                       | Retourner un tableau contenant tous les éléments de la collection                                                                                                                                         |
| <T> T[] toArray(T[]a)                    | Retourner un tableau typé de tous les éléments de la collection                                                                                                                                           |

##Interface List
`java.util.List`

Cette interface étend l'interface Collection.
Contrairement à Collection, dans une List les éléments sont ordonnés (0, 1, 2, 3 ...)
Une collection de type List permet :

* de contenir des doublons
* d'interagir avec un élément de la collection en utilisant sa position
* d'insérer des éléments null

| Méthode                                     | Rôle                                                                                                                                                                                                      |
|---------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean add(int index, E e)                 | Ajouter un élément à la position fournie en paramètre.                                                                                                                                                    |
| boolean addAll(Collection<? extends E c)    | Ajouter des éléments à la position fournie en paramètre                                                                                                                                                   |
| E get(int index)                            | Retourner l'élément à la position fournie en paramètre                                                                                                                                                    |
| int indexOf(Object o)                       | Retourner la première position dans la liste du premier élément fourni en paramètre. Elle renvoie -1 si l'élément n'est pas trouvé                                                                        |
| int lastIndexOf(Object o)                   | Retourner la dernière position dans la liste du premier élément fourni en paramètre. Elle renvoie -1 si l'élément n'est pas trouvé                                                                        |
| ListIterator<E> listIterator()              | Renvoyer un Iterator positionné sur le premier élément de la liste                                                                                                                                        |
| ListIterator<E> listIterator(int index)     | Renvoyer un Iterator positionné sur l'élément dont l'index est fourni en paramètre                                                                                                                        |
| E remove(int index)                         | Supprimer l'élément à la position fournie en paramètre                                                                                                                                                    |
| E set(int index, E e)                       | Remplacer l'élément à la position fournie en paramètre                                                                                                                                                    |
| List<E> subList(int fromIndex, int toIndex) | Obtenir une liste partielle de la collection contenant les éléments compris entre les index fromIndex inclus et toIndex exclus fournis en paramètres                                                      |




##ArrayList

`java.util.ArrayList`

La classe ArrayList est une liste ordonnée qui peux comprendre un nombre infini d'éléments, chaque instance lors de sa construction, possède une capacité de stockage initiale, si cette capacité est atteinte, elle est automatiquement ajustée. 


```java

import java.util.ArrayList;

public class SampleArrayList {

    public static void main(String[] args) {

        // Créer une ArrayList
        List<String> firstArrayList = new ArrayList<>();

        monArrayList.add("1");
        monArrayList.add("2");
        monArrayList.add("3");

        // Autre façon de créer une Arraylist
        List<String> secondArrayList = Arrays.asList("One", "Two", "Three");
    }
    

}

```
exemple de [ArrayList](main/java/SampleArrayList.java)


##LinkedList 
`java.util.linkedlist`

La classe **LinkedList** permet de manipuler des listes dites "doublement chaînées". Chaque élément de la collection, est associé deux informations supplémentaires qui ne sont autres que les références à l'élément précédent et au suivant. 

````mermaid
flowchart LR 
    A[Null] o--o B[Element 1]
  
    B --> C[Element 2]
    C --> B
    C --> D[Element 3]
    D --> C
    D o--o E[Null]
````

LinkedList peut être parcourue à l'aide d'un itérateur bidirectionnel de type `ListIterator`qui fournie les méthodes : 
* `hasNext()` renvoie `true` s'il existe un élément après la position courante. interface `Iterator<E>`
* `next()` fournit l'élément courant et avance l'itérateur. interface`Iterator<E>`
* `hasPrevious()`renvoie `true` s'il existe un élément avant la position courante. interface`ListeIterator<E>`
* `previous()` fournit l'élément précédent et y déplace l'itérateur. interface`ListeIterator<E>`
* `add()` ajoute un élément à la position courante. interface`ListeIterator<E>`
* `set()`remplace l'élément courant. interface`ListeIterator<E>`
* `remove()`supprime l'élément courant. interface`Iterator<E>`

exemple de [LinkedList](main/java/SampleLinkedList.java)

###Différences entre les Listes
| Collection | Ordonné | Accès direct |Clé/valeur| Doublons | Null |Thread Safe|
|------------|---------|--------------|-----------|----------|------|-----------|
| ArrayList  | Oui     | Oui          | Non| Oui      | Oui  |Non|
| LinkedList | Oui     | Non          | Non| Oui      | Oui  |Non|
| HashSet    | Non     | Non          | Non| Non      | Non  |Non|


##Queue


FIFO (First-In First-Out)

l'interface `Queue` est déstinée à la gestion des files d'attentes il s'agit de structures dans lesquelles on peut :

* `offer()` place un element dans la queue, si possible renvoie `true` sinon `false`.
* `element()` &  `peek()` fournit, sans le supprimer, le premier élélment de la `queue`.
* `poll()` fournit le premier élément de la `queue`, sans le supprimer (null si queue vide).
* `remove()` fournit le premier élément de la `queue` en le supprimant (exception si vide).

Les classes implémentant l'interface `Queue` : 

* `LinkedList`
* `PriorityQueue`

###LinkedList

![LinkedList](https://s1.o7planning.com/fr/13451/images/64435236.png)

###PriorityQueue

![LinkedList](https://s1.o7planning.com/fr/13451/images/64435224.png)


##Deque (JDK 6)

L'interface `Deque` dérivée de `Queue`, destinée à gérer des files d'attente à double entrée, c'est à dire dans les quelles on peut réaliser l'une des opération suivante à l'une des extrémités de la `queue`  :

* ajouter un élément, 
* examiner un élément,
* supprimer un élément.

Pour chacune de ces 6 possiblités 3 actions, 2 extrémités), il existe deux méthodes : 


* l'une déclenchant une exception quand l'opération échoue (pile pliene ou vide selon les cas),
* l'autre renvoyant une valeur particulière (`null` pour une méthode de prélévement ou d'éxamen, `false` pour une autre méthode)

|  |Exception|Valeur spéciale|
|------------|---------|--------------|
|Ajout|`addFirst()` & `addLast()`|`offerFirst()` & `offerLast()`|
|Examen|`getFirst()` & `getLast()`|`peekFirst()` & `peekLast()`|
|Suppression|`removeFirst()` & `removeLast()`|`pollFirst()` & `pollLast()`|


Les méthodes de l'interface `Queue` restent utilisables, sachant que celles d'ajout agissent sur la queue, tandis que celles d'exament ou de suppression agissent sur la tête.

Les classes implémentant l'interface `Deque`

* la classe `LinkedList`, modifiée à nouveau par Java 6.
* la classe `ArrayDeque`.






`java.util.Map`
````mermaid

flowchart TD
F(Map)
F === G[HashMap]
F === H[TreeMap]

````
