import java.util.HashMap;

class Node {
    boolean isTerminal = false;
    HashMap<Character, Node> children; // {alphabet -> node}
    //Node[] children;

    Node() {
        children = new HashMap<>();
        //children = new Node[26];
    }

    boolean hasChild(char child) {
        return children.containsKey(child);
        //return children[child - 'a'] != null;
    }

    Node getChild(char child) {
        if(!hasChild(child)) { 
            return null;
        }
        return children.get(child);
        //return children[child - 'a'];
    }

    void insertChild(char child) {
        if(hasChild(child)) {
            return;
        }
        children.put(child, new Node());
        //children[child - 'a'] = new Node();
    }
};

public class TrieMap {

    Node root;

    TrieMap() {
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