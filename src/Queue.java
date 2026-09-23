import java.util.ArrayList;
//separate classes for each implementation
public class Queue <E>{
    private ArrayList<E> queue = new ArrayList<>();

    public void enqueue(E e){
        queue.add(e);
    }

    public E dequeue(){
        if (queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    public E peek(){
        if (queue.isEmpty()){
            return null;
        }
        return queue.get(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

}
