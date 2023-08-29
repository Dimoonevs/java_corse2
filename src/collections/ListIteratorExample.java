package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "MADAM";
        List<Character> list = new LinkedList<>();
        for (char ch:
             s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());
        boolean isPalindrome = true;

        while (iterator.hasNext() && reversIterator.hasPrevious()){
            if (iterator.next() != reversIterator.previous()){
                isPalindrome = false;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
