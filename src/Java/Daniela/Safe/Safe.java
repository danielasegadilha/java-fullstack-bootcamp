package Java.Daniela.Safe;

abstract class Safe {
    protected String type;
    protected String openingMethod;

    public Safe(String type, String openingMethod) {
        this.type = type;
        this.openingMethod = openingMethod;
    }

    public void printInformation() {
        System.out.println("Type: " + this.type);
        System.out.println("Opening Method: " + this.openingMethod);
    }
}
