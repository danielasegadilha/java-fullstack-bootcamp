package Java.Daniela.Safe;

class DigitalSafe extends Safe {
    private int password;
    public DigitalSafe(int password) {
        super("Digital Safe", "Password");
        this.password = password;
    }
    public boolean validatePassword(int confirmPassword) {
        return confirmPassword == this.password;
    }
    public void printValidation(int confirmPassword) {
        if (!validatePassword(confirmPassword)) {
            System.out.println("Incorrect Password!");
        } else {
            System.out.println("Safe opened!");
        }
    }
    public void printInformation() {
        super.printInformation();
    }
}
