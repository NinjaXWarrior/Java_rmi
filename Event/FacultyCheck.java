import java.util.Scanner;

public class FacultyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter faculty name: ");
        String faculty = sc.nextLine();

        try {
            if (!faculty.equals("CSIT")) {
                throw new Exception("Invalid Faculty!");
            }
            System.out.println("Faculty accepted.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}