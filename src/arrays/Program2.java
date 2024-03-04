package arrays;

import java.util.ArrayList;

class Source {
    public ArrayList<String> changeOccurrence(ArrayList<String> a, String m, String n) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(m)) {
                a.set(i, n);
            }
        }
        return a;
    }
    public String listIndex(ArrayList<String> list) {
        return list.get(0);
    }
    public ArrayList<String> listAfter(ArrayList<String> a, String m, String n) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : a) {
            result.add(s);
            if (s.equals(m)) {
                result.add(n);
            }
        }
        return result;
    }
}
public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Source source = new Source();
        // Change all occurrences of "C" to "S"
        System.out.println(source.changeOccurrence(list, "C", "S"));
        source.changeOccurrence(list,"S","C");
        // Get the element present in the list at index 0
        System.out.println(source.listIndex(list));
        // Add string "E" after the string "D"
        System.out.println(source.listAfter(list, "D", "E"));
    }
}	
 
 
