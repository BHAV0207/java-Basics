import java.util.*;

class Pqueue{
    PriorityQueue<Integer> left ;
    PriorityQueue<Integer> right;

    Pqueue(){
        left =  new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }


    public void add(int val) {
        if(right.size()>0 && val>right.peek()){
            right.add(val);
        }
        else{
            left.add(val);
        }

        if(left.size() - right.size() ==2){
            right.add(left.remove());
        }
        else if (right.size() - left.size() == 2){
            left.add(right.remove());
        }
    }
    
    public int remove(){
        if(left.size() == 0 && right.size()==0){
            return -1;
        }
        else if(left.size()>= right.size()){
            return left.remove();
        }else{
            return right.remove();
        }
    }

    public int peek(){
        if(left.size() == 0 && right.size()==0){
            return -1;
        }
        else if(left.size()>= right.size()){
            return left.peek();
        }else{
            return right.peek();
        }
    } 


    public int size(){
        return left.size() + right.size();
    }
    
    

}
public class AAAAAPriorityQueueMedian {
    
}
