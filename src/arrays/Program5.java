package arrays;


import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;



class Program5 {

    public List<String> sortBooks(List<String> bookList) {

        // Custom comparator to sort based on name length and then lexicographical order

      //  Comparator<String> comparator = Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder());

        // Sort the bookList using the custom comparator

        Collections.sort(bookList, comparator);

        return bookList;

    }

    public static void main(String[] args) {

       Program5 res = new Program5();

        List<String> list = new ArrayList<>();

        list.add("beloved");

        list.add("dune");

        list.add("perfume");

        list.add("watchmen");

        list.add("vox");

        System.out.println(res.sortBooks(list));

    }

}
