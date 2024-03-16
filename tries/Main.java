

public class Main {
    public static void main(String[] args) {
        
        TrieArray t = new TrieArray();
        t.insert("abc");
        t.insert("abcd");

        System.out.println(t.search("abc")); // true
        System.out.println(t.hasPrefix("ab")); // true
        System.out.println(t.search("abcd")); // true
        System.out.println(t.search("abcde")); // false
    }
}
