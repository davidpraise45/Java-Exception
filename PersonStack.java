class PersonStack {

    public Person first;
    public Person last;
    int max, num;

    PersonStack(int maximum_lenght) {
        first = last = null;
        num = 0;
        max = maximum_lenght;

    }

    boolean isFull(int num) throws StackFullException {
        return (num == max) ? true : false;
    }

    public void add(String name) throws StackFullException, IllegalObjectTypeException, StackEmptyException {
        Person person = new Person(name);

        if (num != max) {
            if (isEmpty()) {
                isFull(max);
                first = last = person;
            } else {
                last.nextNODE = person;
                last = person;
            }
        } else {
            throw new StackFullException();
        }
        num++;
    }

    public boolean isEmpty() throws StackEmptyException {
        return first == null;
    }

    public StackEmptyException pop() throws StackEmptyException {
        Person person;
        if (isEmpty()) {
            throw new StackEmptyException();
        } else {
            person = first;
            first = first.nextNODE;
            num--;
        }
        return new StackEmptyException();
    }

    void reverse(String[] person) {
        for (int i = person.length - 1; i >= 0; i--) {
            System.out.println(person[i]);
        }
    }

    public void print() throws StackEmptyException {
        String [] out = new String[max-1];

        if (isEmpty()) {
            throw new StackEmptyException();
        } else {
            Person person = this.first;
            for (int i = out.length - 1; i >= 0; i--) {
                out[i] = (String) person.NAME;
                person = person.getNextNODE();
            }
        }

        reverse(out);
    }

    public void length() {
        System.out.println(num);
    }


}

