public class QueueStack <AnyType extends Comparable<AnyType>>{

    private ListQueue<AnyType> queue1;
    private ListQueue<AnyType> queue2;

    public QueueStack(){
        queue1 = new ListQueue<AnyType>();
        queue2 = new ListQueue<AnyType>();
    }

    public void push(AnyType element){
        if(queue1.isEmpty()){
            queue1.enqueue(element);
            while(!queue2.isEmpty()){
                queue1.enqueue(queue2.dequeue());
            }
        }else{
            queue2.enqueue(element);
            while(!queue1.isEmpty()){
                queue2.enqueue(queue1.dequeue());
            }
        }
    }

    public AnyType pop(){
        if(queue1.isEmpty()){
            return queue2.dequeue();
        }else{
            return queue1.dequeue();
        }
    }

    public AnyType top(){
        if(queue1.isEmpty()){
            return queue2.getFront();
        }else{
            return queue1.getFront();
        }
    }

    public AnyType topAndPop(){
        if(queue1.isEmpty()){
            return queue2.dequeue();
        }else{
            return queue1.dequeue();
        }
    }

    public int Size(){
        return queue1.size() + queue2.size();
    }

    public void printStack(){
        if(queue1.isEmpty()){
            queue2.printQueue();
        }else{
            queue1.printQueue();
        }
    }
}
