class StackEmptyException extends Exception {

    public StackEmptyException() {
        try {
            System.out.println("PersonStack is empty – no object to return.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public StackEmptyException(String message) {
        try {
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


