package InterfaceAndAbstractLec;

public class FillInVersion1 extends FillThisIn {

    public FillInVersion1(String[] words) {
        this.name = words[0];
        this.color = words[1];
        this.randomObject = words[2];
        this.location = words[3];
    }

    public String greeting() {
        return "Hello there!";
    }

    public String goToLocation() {
        return "He went to the " + location;
    }

    public String pickUpObject() {
        return "He grabbed the " + randomObject;
    }

}
