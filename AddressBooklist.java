package JUNIT.AddressBookingSystem;

import java.util.ArrayList;

public class AddressBooklist {
	
	 public String bookName;
	    public ArrayList<AddressBookContact> AddressbookcontactDetails;

	    public AddressBooklist(String bookName) {
	        this.bookName = bookName;
	        this.AddressbookcontactDetails = new ArrayList<AddressBookContact>();
	    }

	    public ArrayList<AddressBookContact> getContactDetails() {
	        return AddressbookcontactDetails;
	    }

	    public void setContactDetails(ArrayList<AddressBookContact> contactDetails) {
	        this.AddressbookcontactDetails = contactDetails;
	    }

	    public String getBookName() {
	        return bookName;
	    }

	    public void setBookName(String bookName) {
	        this.bookName = bookName;
	    }

	    @Override
	    public String toString() {
	        return "AddressBook Name: " + bookName + "\nAddressbookcontact:-" + AddressbookcontactDetails;
	    }

	}
	
	


