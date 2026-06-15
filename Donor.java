import java.util.ArrayList;

public class Donor {

    private int donorId;
    private String name;
    private int age;
    private String bloodGroup;
    private String phoneNumber;
    private String city;
    private ArrayList<String> donationHistory;

    // Constructor
    public Donor(int donorId, String name, int age,
                 String bloodGroup, String phoneNumber,
                 String city) {

        this.donorId = donorId;
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.donationHistory = new ArrayList<>();
    }

    // Getters
    public int getDonorId() {
        return donorId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<String> getDonationHistory() {
        return donationHistory;
    }

    // Add Donation Date
    public void addDonationHistory(String date) {
        donationHistory.add(date);
    }

    // Display Donor Details
    public void displayDonorDetails() {

        System.out.println("----------------------------------");
        System.out.println("Donor ID     : " + donorId);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Blood Group  : " + bloodGroup);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("City         : " + city);

        System.out.println("Donation History:");

        if (donationHistory.isEmpty()) {
            System.out.println("No donations recorded.");
        } else {
            for (String date : donationHistory) {
                System.out.println(date);
            }
        }

        System.out.println("----------------------------------");
    }
}