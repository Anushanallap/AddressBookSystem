package JUNIT.AddressBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressSearch {
	 Scanner scan = new Scanner(System.in);
	 AddressBookContact contact;
	    ArrayList<AddressBooklist> AddressBooklist = new ArrayList<>();

	    //Add Method To Add Contact in ArrayList
	    public void getContact() {
	        if (AddressBooklist.isEmpty()) {
	            System.out.println("\n---Add Address Book First---\n");
	            return;
	        } else {
	            System.out.println("Which Address Book You Want To Fill: ");
	            String book = scan.next();

	            System.out.println("How Many Contact You Want To Add: ");
	            int n = scan.nextInt();

	            for (int i = 0; i < n; i++) {
	                System.out.print("Enter Your First Name: ");
	                String firstName = scan.next();

	                System.out.print("Enter Your Last Name: ");
	                String lastName = scan.next();

	                System.out.print("Enter Your Address: ");
	                String address = scan.next();

	                System.out.print("Enter Your City Name: ");
	                String city = scan.next();

	                System.out.print("Enter Your State: ");
	                String state = scan.next();

	                System.out.print("Enter Your Email ID: ");
	                String email = scan.next();

	                System.out.print("Enter Your Zip-Code: ");
	                long zip = scan.nextLong();

	                System.out.print("Enter Your Phone Number: ");
	                long phoneNumber = scan.nextLong();

	                contact = new AddressBookContact(firstName, lastName, address, city, state, zip, phoneNumber, email);

	                if(checkDuplicate(book,firstName)) {
	                    for (AddressBooklist addressBook : AddressBooklist) {
	                        if (addressBook.bookName.contains(book)) {
	                            addressBook.AddressbookcontactDetails.add(contact);
	                            for (AddressBookContact contact : addressBook.AddressbookcontactDetails) {

	                            }
	                        }
	                    }
	                    System.out.println("\nContact Added Successfully\n");
	                }else {
	                    System.out.println("This Person "+ firstName +" Already Exists");
	                    return;
	                }
	            }
	        }
	    }

	    //Check for Duplicate Contact
	    public boolean checkDuplicate(String book , String firstName) {
	        for (AddressBooklist addressBook : AddressBooklist) {
	            if (book.equals(addressBook.bookName)) {
	                for (AddressBookContact contact : addressBook.AddressbookcontactDetails) {
	                    if (firstName.equals(contact.getFirstName())) {
	                        return false;
	                    }
	                }
	            }
	        }
	        return true;
	    }

	    //edit contact of Particular AddressBook
	    public void edit() {
	        System.out.println("Which AddressBook's Contact You Want To Edit: ");
	        String book = scan.next();

	        System.out.println("Enter Email Of Contact You Want To Edit: ");
	        String email = scan.next();

	        for (AddressBooklist addressBook : AddressBooklist) {
	            if (book.equals(addressBook.bookName)) {
	                for (AddressBookContact contact : addressBook.AddressbookcontactDetails) {
	                    if (email.equals(contact.email)) {
	                        System.out.println(
	                                "Select Option: \n1.FirstName\n2.LastName\n3.Address\n4.City\n5.State\n6.ZipCode\n7.PhoneNumber\n8Email;");
	                        int ch = scan.nextInt();

	                        switch (ch) {
	                            case 1:
	                                contact.getFirstName();
	                                break;

	                            case 2:
	                                contact.getLastName();
	                                break;

	                            case 3:
	                                contact.getAddress();
	                                break;

	                            case 4:
	                                contact.getCity();
	                                break;

	                            case 5:
	                                contact.getState();
	                                break;

	                            case 6:
	                                contact.getZip();
	                                break;

	                            case 7:
	                                contact.getPhone();
	                                break;
	                            case 8:
	                                contact.getemail();
	                                break;

	                            default:
	                                System.out.println("Please Enter Valid Choice!!!");
	                        }
	                    } else {
	                        System.out.println("The Email You Entered Is Wrong Please Provide Right One");
	                        continue;
	                    }
	                }
	            }
	        }
	    }

	    /*Delete Contact from AddressBook by searching with email in addressbook
	    */
	    public void delete() {
	        System.out.println("Which AddressBook's Contact You Want To Delete: ");
	        String book = scan.next();

	        System.out.println("Enter Email Of Contact You Want To Delete: ");
	        String deleteByEmail = scan.next();

	        for (AddressBooklist addressBook : AddressBooklist) {
	            if (book.equals(addressBook.bookName)) {
	                for (AddressBookContact contact : addressBook.AddressbookcontactDetails) {
	                    if (deleteByEmail.equals(contact.email)) {
	                        addressBook.AddressbookcontactDetails.remove(contact);
	                        System.out.println("\nSelected contact deleted successfully.");
	                        break;
	                    } else {
	                        System.out.println("The Email You Entered Is Wrong Please Provide Right One");
	                        continue;
	                    }
	                }
	            }
	        }
	    }

	    /*find Contact from AddressBook by searching with email in addressbook
	*/
	    public void find() {
	        System.out.println("Which AddressBook's Contact You Want To Find: ");
	        String book = scan.next();

	        System.out.println("Enter Email Of Contact You Want To Find: ");
	        String findByEmail = scan.next();

	        for (AddressBooklist addressBook : AddressBooklist) {
	            if (book.equals(addressBook.bookName)) {
	                for (AddressBookContact contact : addressBook.AddressbookcontactDetails) {
	                    if (findByEmail.equals(contact.email)) {
	                        System.out.println("\n---Contact Found---.");
	                        break;
	                    } else {
	                        System.out.println("\n---Contact Not Found---\n");
	                    }
	                }
	            }
	        }
	    }
	    public void searchByCity() {
	        System.out.println("Which AddressBook's Contact You Want To Find: ");
	        String book = scan.next();
	
	        System.out.println("Enter City Of Contact You Want To Find: ");
	        String findByCity = scan.next();
	
	        for (AddressBooklist addressBook : AddressBooklist) {
	            if (book.equals(addressBook.bookName)) {
	                for (AddressBookContact contact : addressBook.AddressbookcontactDetails) {
	                    if (findByCity.equals(contact.city)) {
	                        System.out.println("\n---Contact Found---.");
	                        break;
	                    } else {
	                        System.out.println("\n---Contact Not Found---\n");
	                    }
	                }
	            }
	        }
	    }
	
	    public void countByCity() {
	        System.out.println("Enter City Name: ");
	        String cityName = scan.next();
	        int count = 0;
	
	                if (cityName.equals(contact.city)) {
	                    count++;
	                }
	        System.out.println("\nTotal Contact In City " + cityName + " Are: " + count);
	    }


	    //Check unique AddressBook in ArrayList of AddressBook
	    public boolean checkUniqueAddressBook(String bookName) {
	        if (AddressBooklist.isEmpty()) {
	            return true;
	        }
	        for (int i = 0; i < AddressBooklist.size(); i++) {
	            if (AddressBooklist.get(i).bookName.equals(bookName)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    //Add AddressBook in Arraylist of AddresBook
	    public void newAddressBook() {
	        System.out.println("Enter Address Book Name: ");
	        String bookName = scan.next();

	        if (!checkUniqueAddressBook(bookName)) {
	            System.out.println("This Name Address Book Already Exists");
	        }

	        AddressBooklist obj = new AddressBooklist(bookName);
	        AddressBooklist.add(obj);

	        System.out.println("New Address Book Is Added: " + obj);
	    }

	    //Display AddressBook
	    public void displayAddressBook() {
	        System.out.println("------Address Book List------");
	        for (AddressBooklist addressBookName : AddressBooklist) {
	            System.out.println(addressBookName);
	        }
	    }

	    // finding AddressBook In Address Book ArrayList
	    public AddressBooklist findAddressBook() {
	        if (AddressBooklist.isEmpty()) {
	            System.out.println("Add AddressBook In Address Book List");
	            return null;
	        }
	        System.out.println("Enter Address Book Name: ");
	        String addressBookName = scan.next();

	        for (AddressBooklist addressBookList : AddressBooklist) {
	            if (addressBookName.equals(addressBookList.bookName)) {
	                return addressBookList;
	            }
	        }
	        System.out.println("This Name Address Book Is Not Exists");
	        return null;
	    }
	}


