class StackFullException extends Exception {

    public StackFullException() {
        try {
            System.out.println("PersonStack is full – object not added.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public StackFullException(String message) {
        try {
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


