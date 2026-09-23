public class Main {
    public static void main(String[] args){
        int[] testNumbers = {
                15, 25, 35, 45, 55
        };
        Stack<Integer> stack = new Stack<>();
        /*
        ----------------------
          Stack test section
        ----------------------
        */
        System.out.println("Stack Demonstration\nAdding: ");

        for (int testNumber : testNumbers) {//pushing testNumbers in stack
            System.out.println(testNumber);
            stack.push(testNumber);

        }
        System.out.println("TopItem: "+stack.peek());
        System.out.println("Removing: "+stack.pop());
        System.out.println("Removing: "+stack.pop());
        System.out.println("New Top: "+stack.peek());
        System.out.println("Is stack empty?: "+stack.isEmpty());

        /*
        ----------------------
          Queue test section
        ----------------------
        */
        Queue<Integer> queue = new Queue<>();
        System.out.println("Queue Demonstration\nEnqueue: ");
        for (int testNumber : testNumbers) {//pushing testNumbers in stack
            System.out.println(testNumber);
            queue.enqueue(testNumber);
        }
        System.out.println("Front Item: "+queue.peek());
        System.out.println("Removing: "+ queue.dequeue());
        System.out.println("Removing: "+queue.dequeue());
        System.out.println("New front: "+queue.peek());
        System.out.println("Is queue empty?"+queue.isEmpty());



    }
}