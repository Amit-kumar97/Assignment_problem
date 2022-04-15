package CustomerDetails;

import java.util.Arrays;
import java.util.Scanner;

public class Customer_Details {
    private int customerID;
    private String customerName;
    private String customerAddress;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

 //   Customer_Details[] ar;
    public void getCustomerDetail(Customer_Details[] ar)
    {
        System.out.println(Arrays.toString(ar));
    }

    public Customer_Details[] sortedName(Customer_Details[] ar)
    {
        for (int i = 0; i < ar.length; i++) {
            String temp = ar[i].customerName;
            int j = i;

            while (j > 0 && ar[j - 1].customerName.compareTo(temp)>0)
            {
                ar[j] = ar[j - 1];
                j--;
            }

            ar[j].customerName = temp;
        }

        return ar;
    }
    public void getCustomer(int customerID,Customer_Details[] ar)
    {
        int temp = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i].customerID==customerID)
            {
                temp = i;
                break;
            }
        }
        System.out.println(ar[temp].customerName+"/n"+ ar[temp].customerID+"/n"+ar[temp].customerAddress);

    }

    public void sortCustomer(Customer_Details[] ar)
    {
        for (int i = 0; i < ar.length; i++) {
            String temp = ar[i].customerAddress;
            int j = i;

            while (j > 0 && ar[j - 1].customerAddress.compareTo(temp)>0)
            {
                ar[j] = ar[j - 1];
                j--;
            }

            ar[j].customerAddress = temp;
        }

        System.out.println(Arrays.toString(ar));
    }
    @Override
    public String toString()
    {
        return "Customer_Details [" + "customerID=" + customerID + ", customerName='" + customerName + '\'' + ", customerAddress='" + customerAddress + '\'' + ']';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int size = sc.nextInt();

        Customer_Details[] ar = new Customer_Details[size];

        System.out.println("Enter name,Address,Id of the Customers:");
        for (int i = 0; i < ar.length ; i++) {
            ar[i] = new Customer_Details();
            ar[i].customerName = sc.next();
            ar[i].customerAddress = sc.next();
            ar[i].customerID = sc.nextInt();
        }

        Customer_Details obj = new Customer_Details();

        System.out.println("Enter a Number To Perform Suitable Operation:");
        int num = sc.nextInt();

        switch (num)
        {
            case 1:
                obj.getCustomerDetail(ar);
                break;
            case 2:
                //return sorted ArrayList Based on Sorted Name
                System.out.println(Arrays.toString(obj.sortedName(ar)));
                break;
            case 3:
                //return Customer Detail as a List
                obj.getCustomer(sc.nextInt(),ar);
                break;
            case 4:
                // return Array of sorted order based on Customer City
                obj.sortCustomer(ar);
            case 0:
                System.exit(0);
            default:
                System.exit(0);
        }

    }
}

