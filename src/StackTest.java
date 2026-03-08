import java.util.Arrays;

public class StackTest {
    public static void main(String[] args){
        System.out.println("Stack Test");
        Stack<Integer> numberStack = new Stack<>(3); // Stack mit numbers and limit to 3
        try{
            numberStack.push(1); // uses push method to add 1
            numberStack.push(2); // uses push method to add 2
            numberStack.push(3); // uses push method to add 3
            System.out.println("Peeking " +numberStack.peek()); // peek method
            System.out.println("Stack " + numberStack.list()); // prints active Stack
            numberStack.push(4); // Should activate StackFullExcepton
        }catch(StackEmptyException | StackFullException e){
            System.out.println("Stack Exception " +e.getMessage()); // prints out Exception
        }

        Stack<String> textStack = new Stack<>(3); // Stack with Texts limit 3
        try{
            textStack.push("Hello");  //push method
            textStack.push("Its 1:42 am rn"); //push method
            textStack.push("I wanna go to bed"); //push method
            System.out.println("Stack " +textStack.list()); // prints out Stack
            System.out.println("Peeking: " +textStack.peek()); // peek method

            System.out.println("Popping " +textStack.pop()); //pop method
            System.out.println("Popping " +textStack.pop()); //pop method
            System.out.println("Popping " +textStack.pop()); //pop method
            System.out.println("Stack: " +textStack.list()); //pop method

            System.out.println("Popping " +textStack.pop()); // should trigger exception

        }catch(StackEmptyException | StackFullException e){
            System.out.println("Stack Exception" +e.getMessage());
        }

        System.out.println("GenericUtils Class Test");

        String[] words = {"Left " , " Middle " , " Right"};
        System.out.println("Original Array: " + Arrays.toString(words));

        GenericUtils.reverse(words);
        System.out.println("Reversed Array: " + Arrays.toString(words));

        Double[] values = {4.5,20.6,55.5};
        System.out.println("Original Values Array: " + Arrays.toString(values));

        GenericUtils.reverse(values);
        System.out.println("Reversed Values Array: " + Arrays.toString(values));

        double total = GenericUtils.sum(values);
        System.out.println("Total sum of the Values: " +total);
    }
}
