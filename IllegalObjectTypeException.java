class IllegalObjectTypeException extends Exception {

    public IllegalObjectTypeException() {
        try {
            System.out.println("Object is not a Person – object not pushed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IllegalObjectTypeException(String MESSAGE) {
        try {
            System.out.println(MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
