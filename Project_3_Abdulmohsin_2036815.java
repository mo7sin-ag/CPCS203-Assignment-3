//Name: Abdulmohsin Mustafa Ageel
//ID: 2036815
//Section: AA

import java.io.*;
import java.util.Scanner;
import java.util.Date;

//Ride Class
class Ride {

    //Variables
    private int RideID, NoOfSeats;
    private String RideType, RegistrationNo;

    //Constructor
    public Ride(int RideID, String RideType, int NoOfSeats, String RegistrationNo) {
        this.RideID = RideID;
        this.RideType = RideType;
        this.NoOfSeats = NoOfSeats;
        this.RegistrationNo = RegistrationNo;
    }

    //Setters
    public void setRideID(int RideID) {
        this.RideID = RideID;
    }

    public void setNoOfSeats(int NoOfSeats) {
        this.NoOfSeats = NoOfSeats;
    }

    public void setRideType(String RideType) {
        this.RideType = RideType;
    }

    public void setRegistrationNo(String RegistrationNo) {
        this.RegistrationNo = RegistrationNo;
    }

    //Getters
    public int getRideID() {
        return RideID;
    }

    public int getNoOfSeats() {
        return NoOfSeats;
    }

    public String getRideType() {
        return RideType;
    }

    public String getRegistrationNo() {
        return RegistrationNo;
    }

    @Override
    public String toString() {
        return "Ride{" + "RideID=" + RideID + ", NoOfSeats=" + NoOfSeats + ", RideType=" + RideType + ", RegistrationNo=" + RegistrationNo + '}';
    }
}
//#####################################################################################################################################################################
//Payment Class

class Payment {

    //Variables
    private int PaymentID;
    private String PaymentDesc;
    private double PaymentAmount;

    //Constructor
    public Payment(int PaymentID, String PaymentDesc, double PaymentAmount) {
        this.PaymentID = PaymentID;
        this.PaymentDesc = PaymentDesc;
        this.PaymentAmount = PaymentAmount;
    }

    //Setters
    public void setPaymentID(int PaymentID) {
        this.PaymentID = PaymentID;
    }

    public void setPaymentDesc(String PaymentDesc) {
        this.PaymentDesc = PaymentDesc;
    }

    public void setPaymentAmount(double PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    //Getters
    public int getPaymentID() {
        return PaymentID;
    }

    public String getPaymentDesc() {
        return PaymentDesc;
    }

    public double getPaymentAmount() {
        return PaymentAmount;
    }

    @Override
    public String toString() {
        return "Payment{" + "PaymentID=" + PaymentID + ", PaymentDesc=" + PaymentDesc + ", PaymentAmount=" + PaymentAmount + '}';
    }
}
//#####################################################################################################################################################################
//RiderBonus Class

class RiderBonus {

    //Variables
    private int BonusID;
    private String BonusDesc;
    private double BonusCredit;

    //Constructor
    public RiderBonus(int BonusID, String BonusDesc, double BonusCredit) {
        this.BonusID = BonusID;
        this.BonusDesc = BonusDesc;
        this.BonusCredit = BonusCredit;
    }

    //Setters
    public void setBonusID(int BonusID) {
        this.BonusID = BonusID;
    }

    public void setBonusDesc(String BonusDesc) {
        this.BonusDesc = BonusDesc;
    }

    public void setBonusCredit(double BonusCredit) {
        this.BonusCredit = BonusCredit;
    }

    //Getters
    public int getBonusID() {
        return BonusID;
    }

    public String getBonusDesc() {
        return BonusDesc;
    }

    public double getBonusCredit() {
        return BonusCredit;
    }

    @Override
    public String toString() {
        return "RiderBonus{" + "BonusID=" + BonusID + ", BonusDesc=" + BonusDesc + ", BonusCredit=" + BonusCredit + '}';
    }
}
//#####################################################################################################################################################################
//Account Class

class Account {

    //Variables
    private int ID, Phone;
    private String Name, Email, Address;
    private Date date;
    private char Gender;

    //Constructors
    public Account() {
    }

    public Account(int ID, int Phone, String Name, String Email, String Address, Date date, char Gender) {
        this.ID = ID;
        this.Phone = Phone;
        this.Name = Name;
        this.Email = Email;
        this.Address = Address;
        this.date = date;
        this.Gender = Gender;
    }

    //Setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    //Getters
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public Date getDate() {
        return date;
    }

    public char getGender() {
        return Gender;
    }

    public int getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }
}
//#####################################################################################################################################################################
//Employee Class

class Employee extends Account {

    //Variables
    private int EmpID;
    private String EmpDesc;
    private boolean OnLeave;

    //Constructors
    public Employee() {
    }

    public Employee(int EmpID, String EmpDesc, boolean OnLeave, int ID, int Phone, String Name, String Email, String Address, Date date, char Gender) {
        super(ID, Phone, Name, Email, Address, date, Gender);
        this.EmpID = EmpID;
        this.EmpDesc = EmpDesc;
        this.OnLeave = OnLeave;
    }

    //Setters
    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public void setEmpDesc(String EmpDesc) {
        this.EmpDesc = EmpDesc;
    }

    public void setOnLeave(boolean OnLeave) {
        this.OnLeave = OnLeave;
    }

    //Getters
    public int getEmpID() {
        return EmpID;
    }

    public String getEmpDesc() {
        return EmpDesc;
    }

    public boolean isOnLeave() {
        return OnLeave;
    }
}
//#####################################################################################################################################################################
//Captain Class

class Captain extends Employee {

    //Variables
    private int DrivingLicenseNo, TotalRides;
    private double Rating;

    //Constructors
    public Captain() {
    }

    public Captain(int DrivingLicenseNo, int TotalRides, double Rating, int EmpID, String EmpDesc, boolean OnLeave, int ID, String Name, String Email, Date date, char Gender, int Phone, String Address) {
        super(EmpID, EmpDesc, OnLeave, ID, Phone, Name, Email, Address, date, Gender);
        this.DrivingLicenseNo = DrivingLicenseNo;
        this.TotalRides = TotalRides;
        this.Rating = Rating;
    }

    //Setters
    public void setDrivingLicenseNo(int DrivingLicenseNo) {
        this.DrivingLicenseNo = DrivingLicenseNo;
    }

    public void setTotalRides(int TotalRides) {
        this.TotalRides = TotalRides;
    }

    public void setRating(double Rating) {
        this.Rating = Rating;
    }

    //Getters
    public int getDrivingLicenseNo() {
        return DrivingLicenseNo;
    }

    public int getTotalRides() {
        return TotalRides;
    }

    public double getRating() {
        return Rating;
    }

    @Override
    public String toString() {
        return "Captain{" + "DrivingLicenseNo=" + DrivingLicenseNo + ", TotalRides=" + TotalRides + ", Rating=" + Rating + '}';
    }
}
//#####################################################################################################################################################################
//UberAdmin Class

class UberAdmin extends Employee {

    //Variable
    private String Department;

    //Constructors
    public UberAdmin() {
    }

    public UberAdmin(String Department, int EmpID, String EmpDesc, boolean OnLeave, int ID, String Name, String Email, Date date, char Gender, int Phone, String Address) {
        super(EmpID, EmpDesc, OnLeave, ID, Phone, Name, Email, Address, date, Gender);
        this.Department = Department;
    }

    //Setter
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    //Getter
    public String getDepartment() {
        return Department;
    }

    @Override
    public String toString() {
        return "UberAdmin{" + "Department=" + Department + '}';
    }
}
//#####################################################################################################################################################################
//Rider Class

class Rider extends Account {

    //Varibles
    private double WalletBalance, Distance, Rating;
    private String PickupForm, DropTo;
    private Captain Captain;
    private UberAdmin uberAdmin;
    private Payment[] payment;
    private RiderBonus[] riderBonus;
    private Ride ride;
    private Date joinDate;

    //Constructors
    public Rider() {
    }

    public Rider(double WalletBalance, String PickupForm, String DropTo, double Distance, Date joinDate, double Rating, int ID, String Name, String Email, Date date, char Gender, int Phone, String Address, int NoOfPayment, int NoOfRiderBonus) {
        super(ID, Phone, Name, Email, Address, date, Gender);
        this.WalletBalance = WalletBalance;
        this.Distance = Distance;
        this.Rating = Rating;
        this.PickupForm = PickupForm;
        this.DropTo = DropTo;
        this.payment = new Payment[NoOfPayment];
        this.riderBonus = new RiderBonus[NoOfRiderBonus];
        this.joinDate = joinDate;
    }

    //Setters
    public void setWalletBalance(double WalletBalance) {
        this.WalletBalance = WalletBalance;
    }

    public void setDistance(double Distance) {
        this.Distance = Distance;
    }

    public void setRating(double Rating) {
        this.Rating = Rating;
    }

    public void setPickupForm(String PickupForm) {
        this.PickupForm = PickupForm;
    }

    public void setDropTo(String DropTo) {
        this.DropTo = DropTo;
    }

    public void setCaptain(Captain Captain) {
        this.Captain = Captain;
    }

    public void setUberAdmin(UberAdmin uberAdmin) {
        this.uberAdmin = uberAdmin;
    }

    public void setPayment(Payment[] payment) {
        this.payment = payment;
    }

    public void setPayment(Payment payment, int Index) {
        this.payment[Index] = payment;
    }

    public void setRiderBonus(RiderBonus[] riderBonus) {
        this.riderBonus = riderBonus;
    }

    public void setRiderBonus(RiderBonus riderBonus, int Index) {
        this.riderBonus[Index] = riderBonus;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    //Getters
    public double getWalletBalance() {
        return WalletBalance;
    }

    public double getDistance() {
        return Distance;
    }

    public double getRating() {
        return Rating;
    }

    public String getPickupForm() {
        return PickupForm;
    }

    public String getDropTo() {
        return DropTo;
    }

    public Captain getCaptain() {
        return Captain;
    }

    public UberAdmin getUberAdmin() {
        return uberAdmin;
    }

    public Payment[] getPayment() {
        return payment;
    }

    public Payment getPayment(int Index) {
        return payment[Index];
    }

    public RiderBonus[] getRiderBonus() {
        return riderBonus;
    }

    public RiderBonus getRiderBonus(int Index) {
        return riderBonus[Index];
    }

    public Ride getRide() {
        return ride;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public double CalNetPayment() {
        double NetPayment = 0;
        for (int Payment = 0; Payment < payment.length; Payment++) {
            NetPayment += payment[Payment].getPaymentAmount();
        }

        for (int RiderBonus = 0; RiderBonus < riderBonus.length; RiderBonus++) {
            NetPayment -= riderBonus[RiderBonus].getBonusCredit();
        }

        return NetPayment;
    }

    public String PrintRiderBasicInfo() {
        return "";
    }

    @Override
    public String toString() {
        return "Rider{" + "WalletBalance=" + WalletBalance + ", Distance=" + Distance + ", Rating=" + Rating + ", PickupForm=" + PickupForm + ", DropTo=" + DropTo + ", Captain=" + Captain + ", uberAdmin=" + uberAdmin + ", payment=" + payment + ", riderBonus=" + riderBonus + ", ride=" + ride + ", joinDate=" + joinDate + '}';
    }
}
//#####################################################################################################################################################################

public class Project_3_Abdulmohsin_2036815 {

//main Class
    public static void main(String[] args) throws FileNotFoundException {

        //Reading from file initialization
        File Input_File = new File("input.txt");
        if (!Input_File.exists()) {
            System.out.println("File " + Input_File + " was not found! the program will terminate.");
            System.exit(0);
        }
        Scanner Read = new Scanner(Input_File);

        //Writing to output file initialization
        File OutputFile = new File("RiderWrite.txt");
        PrintWriter Output_File = new PrintWriter(OutputFile);

        Output_File.println("--------------- Welcome to Uber ---------------");

        //Creating object array for each class and taking their sizes. Each array has a count that increases each time an object is added.
        Captain[] Captains = new Captain[Read.nextInt()];
        int CaptainCount = 0;

        UberAdmin[] UberAdmins = new UberAdmin[Read.nextInt()];
        int UberAdminCount = 0;

        Ride[] Rides = new Ride[Read.nextInt()];
        int RideCount = 0;

        RiderBonus[] RiderBonuses = new RiderBonus[Read.nextInt()];
        int RiderBonusCount = 0;

        Payment[] Payments = new Payment[Read.nextInt()];
        int PaymentCount = 0;

        Rider[] Riders = new Rider[Read.nextInt()];
        int RiderCount = 0;

        Read.nextLine();

        //Beginning to read commands from the file.
        while (Read.hasNextLine()) {
            //Command reading initialization
            String Line = Read.nextLine();
            //Due to empty lines in the input file
            if (Line.equals("                 ") || Line.equals("                    ")) {
                continue;
            }

            String[] SplitedLine = Line.split(" ");
            String Command = SplitedLine[0];

            switch (Command) {
//#####################################################################################################################################################################
                case "Add_Captain":
                    Output_File.println("Command " + SplitedLine[0] + ": Add a new captain record in the System");
                    Output_File.println();

                    //Assigning the created captain to the Captais object array, and increasing CaptainCount by 1
                    Date D = new Date(Integer.parseInt(SplitedLine[10]), Integer.parseInt(SplitedLine[11]), Integer.parseInt(SplitedLine[12]));
                    Captains[CaptainCount] = new Captain(Integer.parseInt(SplitedLine[1]), Integer.parseInt(SplitedLine[2]), Double.parseDouble(SplitedLine[3]), Integer.parseInt(SplitedLine[4]), SplitedLine[5], Boolean.parseBoolean(SplitedLine[6]), Integer.parseInt(SplitedLine[7]), SplitedLine[8], SplitedLine[9], D, SplitedLine[13].charAt(0), Integer.parseInt(SplitedLine[14]), SplitedLine[15]);

                    Output_File.println("			ID: " + Captains[CaptainCount].getID());
                    Output_File.println("			Name: " + Captains[CaptainCount].getName());
                    Output_File.println("			Email: " + Captains[CaptainCount].getEmail());
                    Output_File.println("			Date of Birth: " + Captains[CaptainCount].getDate().toString());
                    Output_File.println("			Gender: " + Captains[CaptainCount].getGender());
                    Output_File.println("			Phone: " + Captains[CaptainCount].getPhone());
                    Output_File.println("			Address: " + Captains[CaptainCount].getAddress());
                    Output_File.println();
                    Output_File.println("			Employee ID: " + Captains[CaptainCount].getEmpID());
                    Output_File.println("			Employee Description: " + Captains[CaptainCount].getEmpDesc());
                    Output_File.println("			On Leave: " + Captains[CaptainCount].isOnLeave());
                    Output_File.println("			Driving License No: " + Captains[CaptainCount].getDrivingLicenseNo());
                    Output_File.println("			Total Rides: " + Captains[CaptainCount].getTotalRides());
                    Output_File.println("			Rating: " + Captains[CaptainCount].getRating());
                    Output_File.println();
                    Output_File.println("----------------------------------------------------------------");

                    CaptainCount++;
                    break;
//#####################################################################################################################################################################
                case "Add_UberAdmin":
                    Output_File.println("Command " + Command + ": Add a new Uber Admin record in the System");
                    Output_File.println();

                    //Assigning the created Uber admin to the UberAdmins object array, and increasing UberAdminCount by 1
                    D = new Date(Integer.parseInt(SplitedLine[8]), Integer.parseInt(SplitedLine[9]), Integer.parseInt(SplitedLine[10]));
                    UberAdmins[UberAdminCount] = new UberAdmin(SplitedLine[1], Integer.parseInt(SplitedLine[2]), SplitedLine[3], Boolean.parseBoolean(SplitedLine[4]), Integer.parseInt(SplitedLine[5]), SplitedLine[6], SplitedLine[7], D, SplitedLine[11].charAt(0), Integer.parseInt(SplitedLine[12]), SplitedLine[13]);

                    Output_File.println("			ID: " + UberAdmins[UberAdminCount].getID());
                    Output_File.println("			Name: " + UberAdmins[UberAdminCount].getName());
                    Output_File.println("			Email: " + UberAdmins[UberAdminCount].getEmail());
                    Output_File.println("			Date of Birth: " + UberAdmins[UberAdminCount].getDate().toString());
                    Output_File.println("			Gender: " + UberAdmins[UberAdminCount].getGender());
                    Output_File.println("			Phone: " + UberAdmins[UberAdminCount].getPhone());
                    Output_File.println("			Address: " + UberAdmins[UberAdminCount].getAddress());
                    Output_File.println();
                    Output_File.println("			Employee ID: " + UberAdmins[UberAdminCount].getEmpID());
                    Output_File.println("			Employee Description: " + UberAdmins[UberAdminCount].getEmpDesc());
                    Output_File.println("			On Leave: " + UberAdmins[UberAdminCount].isOnLeave());
                    Output_File.println("			Department: " + UberAdmins[UberAdminCount].getDepartment());
                    Output_File.println();
                    Output_File.println("----------------------------------------------------------------");

                    UberAdminCount++;
                    break;
//#####################################################################################################################################################################
                case "Add_Ride":
                    Output_File.println("Command " + Command + ": Add a new Ride record in the System");
                    Output_File.println("Ride Details are as follows:");
                    Output_File.println();

                    //Assigning the created ride to the Rides object array, and increasing RideCount by 1
                    Rides[RideCount] = new Ride(Integer.parseInt(SplitedLine[1]), SplitedLine[2], Integer.parseInt(SplitedLine[3]), SplitedLine[4]);

                    Output_File.println("			Ride ID: " + Rides[RideCount].getRideID());
                    Output_File.println("			Ride Type: " + Rides[RideCount].getRideType());
                    Output_File.println("			Number of Seats: " + Rides[RideCount].getNoOfSeats());
                    Output_File.println("			Registration No.: " + Rides[RideCount].getRegistrationNo());
                    Output_File.println();
                    Output_File.println("----------------------------------------------------------------");

                    RideCount++;
                    break;
//#####################################################################################################################################################################
                case "Add_RiderBonus":
                    Output_File.println("Command " + Command + ": Add a new Rider's Bonus record in the System");
                    Output_File.println();

                    //Assigning the created rider bonus to the RiderBonuses object array, and increasing RiderBonusCount by 1
                    RiderBonuses[RiderBonusCount] = new RiderBonus(Integer.parseInt(SplitedLine[1]), SplitedLine[2], Double.parseDouble(SplitedLine[3]));

                    Output_File.println("			BonusID: " + RiderBonuses[RiderBonusCount].getBonusID());
                    Output_File.println("			Bonus Description: " + RiderBonuses[RiderBonusCount].getBonusDesc());
                    Output_File.println("			bonus Kilometer(s): " + RiderBonuses[RiderBonusCount].getBonusCredit());
                    Output_File.println();
                    Output_File.println("----------------------------------------------------------------");

                    RiderBonusCount++;
                    break;
//#####################################################################################################################################################################
                case "Add_Payment":
                    Output_File.println("Command " + Command + ": Add a new payment record in the System");
                    Output_File.println();

                    //Assigning the created payment to the Payments object array, and increasing PaymentCount by 1
                    Payments[PaymentCount] = new Payment(Integer.parseInt(SplitedLine[1]), SplitedLine[2], Double.parseDouble(SplitedLine[3]));

                    Output_File.println("			Payment ID: " + Payments[PaymentCount].getPaymentID());
                    Output_File.println("			Payment Description: " + Payments[PaymentCount].getPaymentDesc());
                    Output_File.println("			Payment Amount: " + Payments[PaymentCount].getPaymentAmount());
                    Output_File.println();
                    Output_File.println("----------------------------------------------------------------");

                    PaymentCount++;
                    break;
//#####################################################################################################################################################################
                case "Add_Rider":
                    Output_File.println("Command " + Command + ": Add a new Rider record in the System");
                    Output_File.println();

                    //Assigning the created rider to the Riders object array, and increasing RiderCount by 1
                    D = new Date(Integer.parseInt(SplitedLine[5]), Integer.parseInt(SplitedLine[6]), Integer.parseInt(SplitedLine[7]));
                    Date JY = new Date(Integer.parseInt(SplitedLine[12]), Integer.parseInt(SplitedLine[13]), Integer.parseInt(SplitedLine[14]));
                    Riders[RiderCount] = new Rider(Double.parseDouble(SplitedLine[1]), SplitedLine[2], SplitedLine[3], Double.parseDouble(SplitedLine[4]), D, Double.parseDouble(SplitedLine[8]), Integer.parseInt(SplitedLine[9]), SplitedLine[10], SplitedLine[11], JY, SplitedLine[15].charAt(0), Integer.parseInt(SplitedLine[16]), SplitedLine[17], Integer.parseInt(SplitedLine[18]), Integer.parseInt(SplitedLine[19]));

                    Output_File.println("			ID: " + Riders[RiderCount].getID());
                    Output_File.println("			Name: " + Riders[RiderCount].getName());
                    Output_File.println("			Email: " + Riders[RiderCount].getEmail());
                    Output_File.println("			Date of Birth: " + Riders[RiderCount].getDate().toString());
                    Output_File.println("			Gender: " + Riders[RiderCount].getGender());
                    Output_File.println("			Phone: " + Riders[RiderCount].getPhone());
                    Output_File.println("			Address: " + Riders[RiderCount].getAddress());
                    Output_File.println("-------------------------------------------------------------------------------------------");
                    Output_File.println();
                    Output_File.println("			Wallet Balance: " + Riders[RiderCount].getWalletBalance() + " SAR,");
                    Output_File.println();
                    Output_File.println("			Pickup Location: " + Riders[RiderCount].getPickupForm() + ",");
                    Output_File.println();
                    Output_File.println("			Drop Location: " + Riders[RiderCount].getDropTo() + ",");
                    Output_File.println();
                    Output_File.println("			Distance: " + Riders[RiderCount].getDistance() + ",");
                    Output_File.println();
                    Output_File.println("			Joining Date: " + Riders[RiderCount].getJoinDate() + ",");
                    Output_File.println();
                    Output_File.println("			Rider Rating: " + Riders[RiderCount].getRating());
                    Output_File.println("-------------------------------------------------------------------------------------------");
                    Output_File.println();
                    Output_File.println("----------------------------------------------------------------");

                    RiderCount++;
                    break;
//#####################################################################################################################################################################
                case "Assign_Captain_Rider":

                    //The loop will check every capting/rider ID till both IDs match the ones in the input and set the captin to the rider
                    for (int CaptainNumber = 0; CaptainNumber < Captains.length; CaptainNumber++) {
                        if (Integer.parseInt(SplitedLine[1]) == Captains[CaptainNumber].getID()) {
                            for (int RiderNumber = 0; RiderNumber < Riders.length; RiderNumber++) {
                                if (Integer.parseInt(SplitedLine[2]) == Riders[RiderNumber].getID()) {
                                    Riders[RiderNumber].setCaptain(Captains[CaptainNumber]);
                                    Output_File.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
                                    Output_File.println("		Rider: " + Riders[RiderNumber].getName());
                                    Output_File.println("		Assigned to Captain: " + Captains[CaptainNumber].getName());
                                }
                            }
                        }
                    }
                    Output_File.println("----------------------------------------------------------------");
                    break;
//#####################################################################################################################################################################
                case "Assign_Ride_Rider":

                    //The loop will check every ride/rider ID till both IDs match the ones in the input and allocate the ride to the rider
                    for (int RideNumber = 0; RideNumber < Rides.length; RideNumber++) {
                        if (Integer.parseInt(SplitedLine[1]) == Rides[RideNumber].getRideID()) {
                            for (int RiderNumber = 0; RiderNumber < Riders.length; RiderNumber++) {
                                if (Integer.parseInt(SplitedLine[2]) == Riders[RiderNumber].getID()) {
                                    Riders[RiderNumber].setRide(Rides[RideNumber]);
                                    Output_File.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
                                    Output_File.println("		Rider: " + Riders[RiderNumber].getName());
                                    Output_File.println("		Assigned to Ride: " + Rides[RideNumber].getRideID());
                                    Output_File.println("Ride Details are as follows:");
                                    Output_File.println();
                                    Output_File.println("			Ride ID: " + Rides[RideNumber].getRideID());
                                    Output_File.println("			Ride Type: " + Rides[RideNumber].getRideType());
                                    Output_File.println("			Number of Seats: " + Rides[RideNumber].getNoOfSeats());
                                    Output_File.println("			Registration No.: " + Rides[RideNumber].getRegistrationNo());
                                    Output_File.println();
                                }
                            }
                        }
                    }
                    Output_File.println("----------------------------------------------------------------");
                    break;
//#####################################################################################################################################################################
                case "Assign_UberAdmin_Rider":

                    //The loop will check every Uber admin/rider ID till both IDs match the ones in the input and set the Uber admin to the rider
                    for (int UberAdminNumber = 0; UberAdminNumber < UberAdmins.length; UberAdminNumber++) {
                        if (Integer.parseInt(SplitedLine[1]) == UberAdmins[UberAdminNumber].getID()) {
                            for (int RiderNumber = 0; RiderNumber < Riders.length; RiderNumber++) {
                                if (Integer.parseInt(SplitedLine[2]) == Riders[RiderNumber].getID()) {
                                    Riders[RiderNumber].setUberAdmin(UberAdmins[UberAdminNumber]);
                                    Output_File.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
                                    Output_File.println("		Rider: " + Riders[RiderNumber].getName());
                                    Output_File.println("		Assigned to UberAdmin: " + UberAdmins[UberAdminNumber].getName());
                                }
                            }
                        }
                    }
                    Output_File.println("----------------------------------------------------------------");
                    break;
//#####################################################################################################################################################################
                case "Assign_RiderBonus_Rider":

                    int BonusIndexInLine = 0;

                    //This loop will check the rider's ID
                    for (int RiderNumber = 0; RiderNumber < Riders.length; RiderNumber++) {
                        if (Integer.parseInt(SplitedLine[1]) == Riders[RiderNumber].getID()) {
                            Output_File.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
                            Output_File.println("		Rider: " + Riders[RiderNumber].getName());
                            //This loop will check how many times will it set a rider bonus for a rider
                            for (int Bonus = 0; Bonus < Riders[RiderNumber].getRiderBonus().length; Bonus++) {
                                //This loop will check the riders bonus's ID
                                for (int RiderBonusNumber = 0; RiderBonusNumber < RiderBonuses.length; RiderBonusNumber++) {
                                    if (Integer.parseInt(SplitedLine[BonusIndexInLine + 2]) == RiderBonuses[RiderBonusNumber].getBonusID()) {
                                        Riders[RiderNumber].setRiderBonus(RiderBonuses[RiderBonusNumber], BonusIndexInLine);
                                        Output_File.println("		 Rider Bonus added:");
                                        Output_File.println("			BonusID: " + RiderBonuses[RiderBonusNumber].getBonusID());
                                        Output_File.println("			Bonus Description: " + RiderBonuses[RiderBonusNumber].getBonusDesc());
                                        Output_File.println("			bonus Kilometer(s) " + RiderBonuses[RiderBonusNumber].getBonusCredit());
                                        Output_File.println();
                                    }
                                }
                                //BonusIndexInLine will increas after setting a rider bonus by 1 for the next rider bonus index in line and in array
                                BonusIndexInLine++;
                            }
                        }
                    }
                    Output_File.println("----------------------------------------------------------------");
                    break;
//#####################################################################################################################################################################
                case "Assign_Payment_Rider":
                    int PaymentIndexInLine = 0;

                    //This loop will check the rider's ID
                    for (int RiderNumber = 0; RiderNumber < Riders.length; RiderNumber++) {
                        if (Integer.parseInt(SplitedLine[1]) == Riders[RiderNumber].getID()) {
                            Output_File.println("Command " + Command + ": Successfully Processed by the System, Following are the details:");
                            Output_File.println("		Rider: " + Riders[RiderNumber].getName());
                            //This loop will check how many times will it set a payment for a rider
                            for (int Payment = 0; Payment < Riders[RiderNumber].getPayment().length; Payment++) {
                                //This loop will check the riders bonus's ID
                                for (int PaymentNumber = 0; PaymentNumber < Payments.length; PaymentNumber++) {
                                    if (Integer.parseInt(SplitedLine[PaymentIndexInLine + 2]) == Payments[PaymentNumber].getPaymentID()) {
                                        Riders[RiderNumber].setPayment(Payments[PaymentNumber], PaymentIndexInLine);
                                        Output_File.println("		 Payment added:");
                                        Output_File.println("			Payment ID: " + Payments[PaymentNumber].getPaymentID());
                                        Output_File.println("			Payment Description: " + Payments[PaymentNumber].getPaymentDesc());
                                        Output_File.println("			Payment Amount: " + Payments[PaymentNumber].getPaymentAmount());
                                        Output_File.println();
                                    }
                                }
                                //PaymentIndexInLine will increas after setting a payment by 1 for the next payment index in line and in array
                                PaymentIndexInLine++;
                            }
                        }
                    }
                    Output_File.println("----------------------------------------------------------------");
                    break;
//#####################################################################################################################################################################
                case "Print_Report":

                    for (int Rider = 0; Rider < Riders.length; Rider++) {
                        File RiderInfo = new File(Riders[Rider].getID() + "" + Riders[Rider].getName().charAt(0) + Riders[Rider].getName().charAt(1) + Riders[Rider].getName().charAt(2) + "_Rider_Report.txt");
                        PrintWriter Rider_Report = new PrintWriter(RiderInfo);

                        Rider_Report.println("--------------- Welcome to Uber ---------------");
                        D = new Date();
                        Rider_Report.println("--------- Current Date: " + D.toString() + " --------");
                        Rider_Report.println("Command: " + Command);
                        Rider_Report.println();
                        Rider_Report.println("		--- Rider Detail are as Follows: ---");
                        Rider_Report.println();
                        Rider_Report.println("			ID: " + Riders[Rider].getID());
                        Rider_Report.println("			Name: " + Riders[Rider].getName());
                        Rider_Report.println("			Email: " + Riders[Rider].getEmail());
                        Rider_Report.println("			Date of Birth: " + Riders[Rider].getDate().toString());
                        Rider_Report.println("			Gender: " + Riders[Rider].getGender());
                        Rider_Report.println("			Phone: " + Riders[Rider].getPhone());
                        Rider_Report.println("			Address: " + Riders[Rider].getAddress());
                        Rider_Report.println("-------------------------------------------------------------------------------------------");
                        Rider_Report.println();
                        Rider_Report.println("			Wallet Balance: " + Riders[Rider].getWalletBalance() + " SAR,");
                        Rider_Report.println();
                        Rider_Report.println("			Pickup Location: " + Riders[Rider].getPickupForm() + ",");
                        Rider_Report.println();
                        Rider_Report.println("			Drop Location: " + Riders[Rider].getDropTo() + ",");
                        Rider_Report.println();
                        Rider_Report.println("			Distance: " + Riders[Rider].getDistance() + ",");
                        Rider_Report.println();
                        Rider_Report.println("			Joining Date: " + Riders[Rider].getJoinDate() + ",");
                        Rider_Report.println();
                        Rider_Report.println("			Rider Rating: " + Riders[Rider].getRating());
                        Rider_Report.println("-------------------------------------------------------------------------------------------");
                        Rider_Report.println("		--- Captain Detail are as Follows: ---");
                        Rider_Report.println();
                        Rider_Report.println("			ID: " + Riders[Rider].getCaptain().getID());
                        Rider_Report.println("			Name: " + Riders[Rider].getCaptain().getName());
                        Rider_Report.println("			Email: " + Riders[Rider].getCaptain().getEmail());
                        Rider_Report.println("			Date of Birth: " + Riders[Rider].getCaptain().getDate().toString());
                        Rider_Report.println("			Gender: " + Riders[Rider].getCaptain().getGender());
                        Rider_Report.println("			Phone: " + Riders[Rider].getCaptain().getPhone());
                        Rider_Report.println("			Address: " + Riders[Rider].getCaptain().getAddress());
                        Rider_Report.println();
                        Rider_Report.println("			Employee ID: " + Riders[Rider].getCaptain().getEmpID());
                        Rider_Report.println("			Employee Description: " + Riders[Rider].getCaptain().getEmpDesc());
                        Rider_Report.println("			On Leave: " + Riders[Rider].getCaptain().isOnLeave());
                        Rider_Report.println("			Driving License No: " + Riders[Rider].getCaptain().getDrivingLicenseNo());
                        Rider_Report.println("			Total Rides: " + Riders[Rider].getCaptain().getTotalRides());
                        Rider_Report.println("			Rating: " + Riders[Rider].getCaptain().getRating());
                        Rider_Report.println("			-------------------------------------------------------------------------------------------");
                        Rider_Report.println("		--- UberAdmin Detail are as Follows: ---");
                        Rider_Report.println();
                        Rider_Report.println("			ID: " + Riders[Rider].getUberAdmin().getID());
                        Rider_Report.println("			Name: " + Riders[Rider].getUberAdmin().getName());
                        Rider_Report.println("			Email: " + Riders[Rider].getUberAdmin().getEmail());
                        Rider_Report.println("			Date of Birth: " + Riders[Rider].getUberAdmin().getDate().toString());
                        Rider_Report.println("			Gender: " + Riders[Rider].getUberAdmin().getGender());
                        Rider_Report.println("			Phone: " + Riders[Rider].getUberAdmin().getPhone());
                        Rider_Report.println("			Address: " + Riders[Rider].getUberAdmin().getAddress());
                        Rider_Report.println();
                        Rider_Report.println("			Employee ID: " + Riders[Rider].getUberAdmin().getEmpID());
                        Rider_Report.println("			Employee Description: " + Riders[Rider].getUberAdmin().getEmpDesc());
                        Rider_Report.println("			On Leave: " + Riders[Rider].getUberAdmin().isOnLeave());
                        Rider_Report.println("			Department: " + Riders[Rider].getUberAdmin().getDepartment());
                        Rider_Report.println("			-------------------------------------------------------------------------------------------");
                        Rider_Report.println("		---Payment Details are as follows:---");
                        for (int Payment = 0; Payment < Riders[Rider].getPayment().length; Payment++) {
                            Rider_Report.println("			Payment ID: " + Riders[Rider].getPayment(Payment).getPaymentID());
                            Rider_Report.println("			Payment Description: " + Riders[Rider].getPayment(Payment).getPaymentDesc());
                            Rider_Report.println("			Payment Amount: " + Riders[Rider].getPayment(Payment).getPaymentAmount());
                            Rider_Report.println();
                        }
                        Rider_Report.println("			-------------------------------------------------------------------------------------------");
                        Rider_Report.println("		---Bonus Details are as follows:---");
                        Rider_Report.println();
                        for (int RiderBonus = 0; RiderBonus < Riders[Rider].getRiderBonus().length; RiderBonus++) {
                            Rider_Report.println("			BonusID: " + Riders[Rider].getRiderBonus(RiderBonus).getBonusID());
                            Rider_Report.println("			Bonus Description: " + Riders[Rider].getRiderBonus(RiderBonus).getBonusDesc());
                            Rider_Report.println("			bonus Kilometer(s): " + Riders[Rider].getRiderBonus(RiderBonus).getBonusCredit());
                            Rider_Report.println();
                        }
                        Rider_Report.println("			-------------------------------------------------------------------------------------------");
                        Rider_Report.println("		---Ride Details are as follows:---");
                        Rider_Report.println("Ride Details are as follows:");
                        Rider_Report.println();
                        Rider_Report.println("			Ride ID: " + Riders[Rider].getRide().getRideID());
                        Rider_Report.println("			Ride Type: " + Riders[Rider].getRide().getRideType());
                        Rider_Report.println("			Number of Seats: " + Riders[Rider].getRide().getNoOfSeats());
                        Rider_Report.println("			Registration No.: " + Riders[Rider].getRide().getRegistrationNo());
                        Rider_Report.println("			-------------------------------------------------------------------------------------------");
                        Rider_Report.println("		---Total Net Payment :" + Riders[Rider].CalNetPayment() + "---");
                        Rider_Report.println("	-----------------------------------");

                        Rider_Report.close();
                    }
                    break;
//#####################################################################################################################################################################
                case "Quit":
                    Output_File.println("Thank you for using Uber System, Good Bye!");
                    Output_File.close();
                    break;
//#####################################################################################################################################################################
            }//End of switch
        }//End of while-loop
    }//End of main Class
}//End of project
