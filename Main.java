/** Created by David Praise Chukwuma Kalu **/

public class Main {

    public static void main(String[] args) throws StackEmptyException, StackFullException, IllegalObjectTypeException {

        PersonStack personStack = new PersonStack(5);
        personStack.add("DAVID");
        personStack.add("DAN");
        personStack.add("MIRACLE");
        personStack.add("MILOS");
        personStack.add("MARKO");
        personStack.print();
        personStack.length();

    }

}

