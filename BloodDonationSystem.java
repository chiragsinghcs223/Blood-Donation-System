import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class BloodDonationSystem {

    private HashMap<Integer, Donor> donors;
    private Scanner sc;
    private int nextDonorId;

    public BloodDonationSystem() {
        donors = new HashMap<>();
        sc = new Scanner(System.in);
        nextDonorId = 101;

        loadDonorsFromFile();
    }

    // Register Donor
    public void addDonor() {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Blood Group: ");
        String bloodGroup = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        Donor donor = new Donor(
                nextDonorId,
                name,
                age,
                bloodGroup,
                phone,
                city
        );

        donors.put(nextDonorId, donor);

        System.out.println("\nDonor Registered Successfully!");
        System.out.println("Donor ID: " + nextDonorId);

        nextDonorId++;
    }

    // Search by Blood Group
    public void searchByBloodGroup() {

        System.out.print("Enter Blood Group: ");
        String bloodGroup = sc.nextLine();

        boolean found = false;

        for (Donor donor : donors.values()) {

            if (donor.getBloodGroup()
                    .equalsIgnoreCase(bloodGroup)) {

                donor.displayDonorDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No donor found.");
        }
    }

    // Search by City
    public void searchByCity() {

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        boolean found = false;

        for (Donor donor : donors.values()) {

            if (donor.getCity()
                    .equalsIgnoreCase(city)) {

                System.out.println(
                        donor.getName() +
                        " - " +
                        donor.getBloodGroup()
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("No donor found.");
        }
    }

    // Record Donation
    public void recordDonation() {

        System.out.print("Enter Donor ID: ");
        int donorId = Integer.parseInt(sc.nextLine());

        Donor donor = donors.get(donorId);

        if (donor != null) {

            System.out.print(
                    "Enter Donation Date (dd-mm-yyyy): "
            );

            String date = sc.nextLine();

            donor.addDonationHistory(date);

            System.out.println(
                    "Donation recorded successfully."
            );

        } else {

            System.out.println("Donor not found.");
        }
    }

    // Display All Donors
    public void displayAllDonors() {

        if (donors.isEmpty()) {

            System.out.println(
                    "No donors registered."
            );

            return;
        }

        for (Donor donor : donors.values()) {

            donor.displayDonorDetails();
        }
    }

    // Save Donors to File
    public void saveDonorsToFile() {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter("donors.txt")
                    );

            for (Donor donor : donors.values()) {

                StringBuilder history =
                        new StringBuilder();

                for (String date :
                        donor.getDonationHistory()) {

                    history.append(date)
                           .append(";");
                }

                writer.write(
                        donor.getDonorId() + "," +
                        donor.getName() + "," +
                        donor.getAge() + "," +
                        donor.getBloodGroup() + "," +
                        donor.getPhoneNumber() + "," +
                        donor.getCity() + "," +
                        history
                );

                writer.newLine();
            }

            writer.close();

            System.out.println(
                    "Data saved successfully."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error saving data."
            );
        }
    }

    // Load Donors from File
    public void loadDonorsFromFile() {

        File file = new File("donors.txt");

        if (!file.exists()) {
            return;
        }

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(file)
                    );

            String line;

            while ((line = reader.readLine())
                    != null) {

                String[] data =
                        line.split(",");

                int id =
                        Integer.parseInt(data[0]);

                String name = data[1];

                int age =
                        Integer.parseInt(data[2]);

                String bloodGroup = data[3];

                String phone = data[4];

                String city = data[5];

                Donor donor =
                        new Donor(
                                id,
                                name,
                                age,
                                bloodGroup,
                                phone,
                                city
                        );

                if (data.length > 6 &&
                        !data[6].isEmpty()) {

                    String[] dates =
                            data[6].split(";");

                    for (String date : dates) {

                        if (!date.isEmpty()) {

                            donor.addDonationHistory(
                                    date
                            );
                        }
                    }
                }

                donors.put(id, donor);

                if (id >= nextDonorId) {

                    nextDonorId = id + 1;
                }
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(
                    "Error loading data."
            );
        }
    }
}