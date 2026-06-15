import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BloodDonationSystem system =
                new BloodDonationSystem();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println(
                    "\n===== Blood Donation Management System ====="
            );

            System.out.println(
                    "1. Register Donor"
            );

            System.out.println(
                    "2. Search Donor by Blood Group"
            );

            System.out.println(
                    "3. Search Donor by City"
            );

            System.out.println(
                    "4. Record Donation"
            );

            System.out.println(
                    "5. View All Donors"
            );

            System.out.println(
                    "6. Save and Exit"
            );

            System.out.print(
                    "Enter Choice: "
            );

            choice =
                    Integer.parseInt(
                            sc.nextLine()
                    );

            switch (choice) {

                case 1:
                    system.addDonor();
                    break;

                case 2:
                    system.searchByBloodGroup();
                    break;

                case 3:
                    system.searchByCity();
                    break;

                case 4:
                    system.recordDonation();
                    break;

                case 5:
                    system.displayAllDonors();
                    break;

                case 6:
                    system.saveDonorsToFile();

                    System.out.println(
                            "Thank you for using the system!"
                    );

                    break;

                default:
                    System.out.println(
                            "Invalid Choice!"
                    );
            }

        } while (choice != 6);

        sc.close();
    }
}