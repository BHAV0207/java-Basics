
class Node {
    boolean isTerminal = false;
    Node[] children;
   

    Node() {
        children = new Node[26];
    }

    boolean hasChild(char child) {
        return children[child - 'a'] != null;
    }

    Node getChild(char child) {     
        return children[child - 'a'];
    }

    void insertChild(char child) {
        children[child - 'a'] = new Node();
    }
};

public class TrieArray {

    Node root;

    TrieArray() {
        root = new Node();
    }

    void insert(String s) {
        Node cur = root;
        for(int i = 0; i < s.length(); ++i) {
            char curChar = s.charAt(i);
            if(!cur.hasChild(curChar)) {
                cur.insertChild(curChar);
            }
            cur = cur.getChild(curChar);
        }
        cur.isTerminal = true;
    }

    boolean search(String s) {
        Node cur = root;
        for(int i = 0; i < s.length(); ++i) {
            char curChar = s.charAt(i);
            if(!cur.hasChild(curChar)) {
                return false;
            }
            cur = cur.getChild(curChar);
        }
        return cur.isTerminal;
    }

    boolean hasPrefix(String s) {
        Node cur = root;
        for(int i = 0; i < s.length(); ++i) {
            char curChar = s.charAt(i);
            if(!cur.hasChild(curChar)) {
                return false;
            }
            cur = cur.getChild(curChar);
        }
        return true;
    }
};