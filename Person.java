class Person {

    public Object NAME;
    public Person nextNODE;

    public Person() {
        nextNODE = null;
    }

    public Person(String personNAME) {
        NAME = personNAME;
        nextNODE = null;
    }

    public Person(Object personNAME, Person personNODE) {
        NAME = personNAME;
        nextNODE = personNODE = null;
    }

    public Object getNAME() {
        return NAME;
    }

    public void setNAME(Object NAME) {
        this.NAME = NAME;
    }

    public Person getNextNODE() {
        return nextNODE;
    }

    public void setNextNODE(Person nextNODE) {
        this.nextNODE = nextNODE;
    }
}