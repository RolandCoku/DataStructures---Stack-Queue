public class Test {
    public static void main(String[] args) {
//        ArrayStack<Integer> stack = new ArrayStack<>();
//        stack.push(1);
//        stack.push(6);
//        stack.push(3);
//        stack.push(8);
//        stack.push(5);
//        System.out.println("Stack size: " + stack.getStackSize());
//        System.out.println("Stack elements: ");
//        stack.printStack();
//        System.out.println("Sorting stack: ");
//        stack.sortStack();
//        stack.printStack();
//
//        ArrayStack<Integer> stack2 = new ArrayStack<>();
//        stack2.push(1);
//        stack2.push(0);
//        stack2.push(1);
//        stack2.push(2);
//        stack2.push(1);
//        stack2.push(3);
//
//        System.out.println("Stack 2 elements: ");
//        stack2.printStack();
//        System.out.println("Copying stack to stack2: ");
//        stack.copyStack(stack2);
//        System.out.println("Stack elements: ");
//        stack.printStack();
//        System.out.println("Stack 2 elements: ");
//        stack2.printStack();
//
//        ArrayStack<Integer> stack3 = new ArrayStack<>();
//        stack3.push(1);
//        stack3.push(1);
//        stack3.push(1);
//        stack3.push(1);
//        stack3.push(0);
//        stack3.push(0);
//
//        ArrayStack<Integer> stack4 = new ArrayStack<>();
//        stack4.push(1);
//        stack4.push(1);
//        stack4.push(1);
//        stack4.push(1);
//        System.out.println("Printing the number with the biggest value: ");
//        ArrayStack.printBiggestBinary(stack3, stack4);
//
//        System.out.println("Move 3rd element to the peek: ");
//        stack.printStack();
//        stack.moveToTheTop(3);
//        stack.printStack();
//
//        System.out.print("123 in Hex = ");
//        ArrayStack.convertToHex(123);
//
//        ListQueue<Integer> queue = new ListQueue<>();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        System.out.println();
//
//        System.out.println("Queue elements: ");
//        queue.printQueue();
//        System.out.println("Reversing queue: ");
//        queue.reverseQueue();
//        queue.printQueue();
//
//
//        QueueStack<Integer> queueStack = new QueueStack<>();
//        queueStack.push(1);
//        queueStack.push(2);
//        queueStack.push(3);
//        queueStack.printStack();
//        System.out.println("Top element: " + queueStack.peek());
//        queueStack.printStack();
//        System.out.println("Size: " + queueStack.Size());
//        System.out.println("Top and pop element: " + queueStack.pop());
//        queueStack.printStack();

//        DoubleStackArray<Integer> doubleStackArray = new DoubleStackArray<>();
//        doubleStackArray.push1(1);
//        doubleStackArray.push1(2);
//        doubleStackArray.push1(3);
//        doubleStackArray.push2(3);
//        doubleStackArray.push2(2);
//        doubleStackArray.push2(1);
//        doubleStackArray.print1();
//        doubleStackArray.print2();
//
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        arrayQueue.enqueue(1);
//        arrayQueue.enqueue(2);
//        arrayQueue.enqueue(3);
//        arrayQueue.enqueue(4);
//        System.out.println("Queue elements: ");
//        arrayQueue.printQueue();
//        arrayQueue.dequeue();
//        arrayQueue.dequeue();
//        System.out.println("Queue elements: ");
//        arrayQueue.printQueue();
//        arrayQueue.enqueue(5);
//        arrayQueue.enqueue(6);
//        System.out.println("Queue elements: ");
//        arrayQueue.printQueue();

//        ArrayDoubleEndedQueue<Integer> arrayDoubleEndedQueue = new ArrayDoubleEndedQueue<>();
//        arrayDoubleEndedQueue.enqueueFront(1);
//        arrayDoubleEndedQueue.enqueueFront(2);
//        arrayDoubleEndedQueue.enqueueFront(3);
//        arrayDoubleEndedQueue.enqueueFront(7);
//        arrayDoubleEndedQueue.enqueueFront(10);
//        arrayDoubleEndedQueue.enqueueBack(4);
//        arrayDoubleEndedQueue.enqueueBack(5);
//        arrayDoubleEndedQueue.enqueueBack(6);
//        arrayDoubleEndedQueue.enqueueBack(8);
//        arrayDoubleEndedQueue.enqueueBack(9);
//        System.out.println(arrayDoubleEndedQueue.getFront());
//        System.out.println(arrayDoubleEndedQueue.getBack());
//        arrayDoubleEndedQueue.printQueue();
//        System.out.println(arrayDoubleEndedQueue.dequeueFront());
//        System.out.println(arrayDoubleEndedQueue.getFront());
//        arrayDoubleEndedQueue.enqueueFront(11);
//        arrayDoubleEndedQueue.printQueue();
//        System.out.println(arrayDoubleEndedQueue.getFront());
//        System.out.println(arrayDoubleEndedQueue.dequeueBack());
//        System.out.println(arrayDoubleEndedQueue.getBack());
//        arrayDoubleEndedQueue.enqueueFront(12);
//        arrayDoubleEndedQueue.printQueue();

        ListDoubleEndedQueue<Integer> listDoubleEndedQueue = new ListDoubleEndedQueue<>();
        listDoubleEndedQueue.enqueueFront(1);
        listDoubleEndedQueue.enqueueFront(2);
        listDoubleEndedQueue.enqueueFront(3);
        listDoubleEndedQueue.enqueueFront(7);
        listDoubleEndedQueue.enqueueFront(10);
        listDoubleEndedQueue.enqueueBack(4);
        listDoubleEndedQueue.enqueueBack(5);
        listDoubleEndedQueue.enqueueBack(6);
        listDoubleEndedQueue.printQueue();
        System.out.println(listDoubleEndedQueue.getFront());
        System.out.println(listDoubleEndedQueue.getBack());
    }
}