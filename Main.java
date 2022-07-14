package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	// 3. Se dau doua liste de numere întregi (sau string-uri la alegerea voastră). Sa se creeze o lista ce conțin elementele comune din
        //cele doua liste
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        lista1.add(6);
        lista1.add(7);
        lista1.add(8);
        lista1.add(9);
        lista1.add(10);
        System.out.println("Elementele din prima lista sunt: " + lista1);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(3);
        lista2.add(5);
        lista2.add(7);
        lista2.add(9);
        lista2.add(11);
        lista2.add(13);
        lista2.add(15);
        lista2.add(17);
        System.out.println("Elementele celei de a doua lista sunt: " + lista2);

        lista1.retainAll(lista2);

        System.out.println("Elementele comune celor doua liste sunt: " + lista1);
    }
}
