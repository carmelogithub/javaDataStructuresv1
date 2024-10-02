package teoria.vistas;

import java.util.*;

public class DataStructures {
    public static void main(String[] args){
        //Conoces el número de elementos pero necesitas acceso rápido -> Array
        //int[] array = new int[10];
        int[]array = {51,2,73,4,52,6,7,18,94,10};
        System.out.println("Array: " + array[3]);//acceso rápido.


        //List ----------------------------------------------------
        //lista mutable y necesito acceso rápido -> ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(51);
        arrayList.add(2);
        arrayList.add(73);

        System.out.println("ArrayList: " + arrayList.get(2));//acceso rápido por índice
        arrayList.add(1, 4);//insertar en índice 1

        //necesitas muchas inserciones y eliminaciones -> LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hola");
        linkedList.add("Mundo");
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.remove("Java"); //eliminaciones
        linkedList.add(1, "C++");//inserciones

        for(String s: linkedList){
            System.out.println("LinkedList: " + s);
        }
    //Set - Conjuntos ------------------------------------------------------
        //elementos únicos y no importa el orden - muy eficiente en búsquedas rápidas -> HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("milano");
        hashSet.add("roma");
        hashSet.add("venezia");
        hashSet.add("firenze");
        hashSet.add("milano");
        //también puedes utilizar Iterator
        for(String s: hashSet){
            System.out.println("HashSet: " + s);
        }

    //elementos únicos pero con orden - TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("berlin");
        treeSet.add("munich");
        treeSet.add("hamburg");
        treeSet.add("berlin");
        treeSet.add("frankfurt");

        for(String s: treeSet){//mostrar en orden natural - alfabético
            System.out.println("TreeSet: " + s);
        }

    //Map --------------------------------------------------------------------
        //clave-valor y necesitas acceso rápido por clave -> HashMap
        HashMap<String, Float> hashMap = new HashMap<>();
        hashMap.put("lunes", 14.5f);
        hashMap.put("martes", 17.85f);
        hashMap.put("miércoles", 16.45f);

        for(String s: hashMap.keySet()){//acceso rápido por la clave
            System.out.println("HashMap: " + s + " - " + hashMap.get(s));
        }

        //clave-valor y necesitas acceso rápido por clave pero ordenado -> TreeMap
        TreeMap<String, Float> treeMap = new TreeMap<>();
        treeMap.put("lunes", 14.5f);
        treeMap.put("martes", 17.85f);
        treeMap.put("miércoles", 16.45f);
        treeMap.put("jueves", 18.45f);
        treeMap.put("viernes", 28.45f);

        for(String s: treeMap.keySet()){//acceso rápido por la clave
            System.out.println("TreeMap: " + s + " - " + treeMap.get(s));
        }

        //necesitas LIFO - Last In First Out -> Stack - pila
        Stack<String> stack = new Stack<>();
        stack.push("La colmena");
        stack.push("El túnel");
        stack.push("El extranjero");
        stack.push("El principito");
        stack.push("El retrato de Dorian Gray");

        stack.pop();//sacar el último elemento
        //si es una pila, debes eliminar el último elemento que has metido

        for(String s : stack){
            System.out.println("Stack: " + s);
        }
    //necesitas FIFO - First In First Out -> Queue - cola
        Queue<String> queue = new LinkedList<>();
        queue.add("La colmena");
        queue.add("El túnel");
        queue.add("El extranjero");
        queue.add("El principito");
        queue.add("El retrato de Dorian Gray");

        queue.remove();//sacar el primer elemento
        //si es una cola, debes eliminar el primer elemento que has metido
System.out.println("------");
        for(String s : queue){
            System.out.println("Queue: " + s);
        }

        //manejar datos relacionados como redes sociales -> Graph
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("Juan", Arrays.asList("María", "Pedro", "Luis"));
        graph.put("María", Arrays.asList("Juan", "Pedro"));
        graph.put("Pedro", Arrays.asList("Juan", "María", "Luis"));
        graph.put("Luis", Arrays.asList("Juan", "Pedro"));

        for(String s: graph.keySet()){
            System.out.println("Graph: " + s + " - " + graph.get(s));
        }

        //multinivel, estructura jerárquica -> Tree
        class Nodo {
            int valor;
            Nodo izquierda, derecha;

            public Nodo(int valor) {
                this.valor = valor;
                izquierda = derecha = null;
            }
        }//cierra clase Nodo

    }//cierra main
}//cierra clase DataStructures
