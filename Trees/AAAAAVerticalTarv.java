import java.util.*;
import java.io.*;

class node 
    {
        int val;
        node left;
        node right;

        node(int val) 
        {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

class pair{
    int hd;
    node nod;

    public pair(int hd , node nod){
        this.hd = hd;
        this.nod = nod;
    }
}


class AAAAAVerticalTrav{

    public static void verticalTrav(node root) {
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(0, root));

        while(!q.isEmpty()){
            pair curr = q.poll();

            if(map.containsKey(curr.hd)){
                map.get(curr.hd).add(curr.nod.val);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(curr.nod.val);
                map.put(curr.hd , list);
            }

            if(curr.nod.left != null){
                q.add(new pair(curr.hd-1, curr.nod.left));
            }
            if(curr.nod.right != null){
                q.add(new pair(curr.hd+1, curr.nod.right));
            }

        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : map.keySet()){
            for (int j : i) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}