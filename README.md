# 🩸 Blood Donation Management System

A beginner-friendly **console-based Java application** that helps manage blood donor records and quickly search for blood donors during emergencies. This project demonstrates the use of **Core Java, OOP concepts, Collections Framework, and File Handling**.

---

## 📌 Project Overview

The **Blood Donation Management System** is designed to simplify the process of registering blood donors and finding suitable donors based on blood group and location. The system also maintains donation history and stores donor data in a text file for persistence.

This project is ideal for beginners learning Java and looking to build a real-world problem-solving application for their GitHub portfolio and placement preparation.

---

## ✨ Features

* ✅ Donor Registration with auto-generated Donor ID
* ✅ Search Donors by Blood Group
* ✅ Search Nearby Donors by City
* ✅ Record and Track Donation History
* ✅ Display All Registered Donors
* ✅ Save Donor Data to a Text File (`donors.txt`)
* ✅ Load Existing Donor Data on Application Startup
* ✅ Menu-Driven Console Interface
* ✅ Beginner-Friendly Code Structure

---

## 🛠️ Technologies Used

* **Java (Core Java)**
* **Object-Oriented Programming (OOP)**
* **Collections Framework**

  * HashMap
  * ArrayList
* **File Handling**

  * FileReader
  * BufferedReader
  * FileWriter
  * BufferedWriter
* **Scanner Class**
* **Exception Handling**

---

## 📂 Project Structure

```
BloodDonationManagementSystem/
│
├── Donor.java
├── BloodDonationSystem.java
├── Main.java
├── donors.txt
└── README.md
```

---

## 🏗️ OOP Concepts Used

### Encapsulation

* Donor details are stored as private fields inside the `Donor` class.
* Access is provided through getter methods.

### Abstraction

* Business logic is separated inside the `BloodDonationSystem` class.

### Objects and Classes

* `Donor` objects represent individual donors.
* `BloodDonationSystem` manages all donor-related operations.

---

## 🚀 How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/YourUsername/Blood-Donation-Management-System.git
```

### 2. Navigate to the Project Directory

```bash
cd Blood-Donation-Management-System
```

### 3. Compile the Java Files

```bash
javac *.java
```

### 4. Run the Application

```bash
java Main
```

---

## 📋 Application Menu

```
===== Blood Donation Management System =====

1. Register Donor
2. Search Donor by Blood Group
3. Search Donor by City
4. Record Donation
5. View All Donors
6. Save and Exit

Enter Choice:
```

---

## 📸 Sample Output

### Register Donor

```
Enter Name: Chirag Singh
Enter Age: 20
Enter Blood Group: B+
Enter Mobile Number: 9876543210
Enter City: Ghaziabad

Donor Registered Successfully!
Donor ID: 101
```

### Search by Blood Group

```
Enter Blood Group: B+

Matching Donors:

Donor ID : 101
Name : Chirag Singh
Phone : 9876543210
City : Ghaziabad
```

### Record Donation

```
Enter Donor ID: 101
Enter Donation Date: 15-06-2026

Donation recorded successfully.
```

---

## 💾 Data Persistence

Donor information is stored in a text file named:

```
donors.txt
```

Example:

```
101,Chirag Singh,20,B+,9876543210,Ghaziabad
102,Rahul Kumar,22,O+,9876501234,Delhi
```

This ensures donor records are retained even after the application is closed.

---

## 🎯 Learning Outcomes

By building this project, you will gain hands-on experience with:

* Java Classes and Objects
* Collections Framework (HashMap, ArrayList)
* File Handling
* Exception Handling
* Menu-Driven Programs
* Real-World Problem Solving
* Git and GitHub Project Management

---

## 🔮 Future Enhancements

* Add donor eligibility checks
* Integrate MySQL database using JDBC
* Develop a GUI using Java Swing or JavaFX
* Build REST APIs using Spring Boot
* Implement Admin Login Authentication
* Add location-based donor filtering

---

## 👨‍💻 Author

**Chirag Singh**
B.Tech Computer Science Engineering Student (Class of 2028)
IMS Engineering College, Ghaziabad

Passionate about Java, Data Structures & Algorithms, and Web Development.

---

⭐ If you found this project helpful, consider giving it a **star** on GitHub!
