class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class TestCustomException1 {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]) {
        try {
            validate(20);
        } catch (InvalidAgeException m) {
            System.out.println("Exception occurred: " + m);
        }

        System.out.println("rest of the code...");
    }
}