package WorkSpace;

public class CodeupStudent extends Student {

    public CodeupStudent(String[] info, boolean graduated) {
        this.firstName = info[0];
        this.lastName = info[1];
        this.cohort = info[2];
        this.computer = info[3];
        this.graduated = graduated;
    }

    public void greeting() {
        System.out.println("Hello " + cohort);
    }

    public void study() {
        System.out.println("Full-Stack Java");
    }

    public boolean giveBusinessCards() {
        if (graduated) {
            return true;
        } else {
            return false;
        }
    }

}
