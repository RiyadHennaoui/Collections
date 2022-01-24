# Les Collections


API Collections Existe depuis Java 1.2 en 1998.


### Interface Collection :
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

###Interface List
`java.util.List`

Cette interface étend l'interface Collection
Contrairement à Collection une List les éléments sont ordonnés (0, 1, 2, 3 ...)
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

`java.util.Map`
````mermaid

flowchart TD
F(Map)
F === G[HashMap]
F === H[TreeMap]

````


exemple de [ArrayList](main/java/test.java)

```java

import java.util.ArrayList;

public class SampleArrayList {

    public static void main(String[] args) {

        // Créer une ArrayList
        List<String> firstArrayList = new ArrayList<>();
        List<String> secondArrayList = Arrays.asList("One", "Two", "Three");
        
        
        monArrayList.add("1");
        monArrayList.add("2");
        monArrayList.add("3");
        
    }
    

}

```


| Collection | Ordonné | Accès direct |Clé/valeur| Doublons | Null |Thread Safe|
|------------|---------|--------------|-----------|----------|------|-----------|
| ArrayList  | Oui     | Oui          | Non| Oui      | Oui  |Non|
| LinkedList | Oui     | Non          | Non| Oui      | Oui  |Non|
| HashSet    | Non     | Non          | Non| Non      | Non  |Non|





 





En reconversion professionnelle, je suis actuellement une formation de concepteur développeur d'applications d'un niveau Bac +4, au centre AFPA de Balma jusqu'au 25 août 2022. 

J'ai l'opportunité de vous proposer mes compétences lors d'une période d'application en entreprise(P.A.E) de 3 mois, 
qui aura lieu du **16 mai 2022** au **10 août 2022**, intégralement pris en charge par mon organisme de formation. 


!!! L'entreprise !!! SII.



Passionné de développement, j’ai commencé mon apprentissage en **autoformation** via l’outil openclassrooms avec lequel j’ai réalisé des applications android et conçu deux sites web.

https://web.archive.org/web/20110810080649/http://www.urbanpicture.fr/
https://www.pyfacilityformation.com/

Cette formation se déroule sur neuf mois en apprentissage **mix Learning** : trois jours de présentiel et deux jours de distanciel qui sont de véritables mises en conditions professionnelles. 
C’est une formation complète agrémentée de projets concrets à réaliser pour des acteurs extérieurs, tels que la refonte du site du musée Fermat Science. 
Au-delà du plaisir de travailler en équipe, celui-ci me fait pratiquer, 
de la conception à la mise en ligne, différents langages et outils (Uml, Git, GitHub, Java, html, CSS, PSQL, Angular, etc.) et se coordonner avec la méthode agile (Scrum).


Fort d'une expérience de 20 ans dans le secteur du service, mon précédent poste de Responsable d'équipe m'a permis de développer des compétences transverses telles que l'encadrement d'une équipe, 
le sens de l'écoute, l'empathie, la planification et la capacité d'adaptation.

Je vous propose de nous rencontrer afin que nous puissions discuter plus en détail d'une future collaboration. 

formule de politesse.
















