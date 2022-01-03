package JUNIT.AddressBookingSystem;

public class AddressBookContact {
	
		String firstName;
	      String lastName;
	     String address;
	    String city;
	     String state;
	     int phone;
	     int zip;
	     String email;
	    

	    public AddressBookContact(String firstName, String lastName, String address, String city, String state, int zip, int phone)
	    {
	    	 this.firstName = firstName;
	         this.lastName = lastName;
	         this.address = address;
	         this.city = city;
	         this.state = state;
	         this.phone = phone;
	         this.zip = zip;
	    }
	    public AddressBookContact(String firstName2, String lastName2, String address2, String city2, String state2,
				long zip2, long phoneNumber, String email2) {
			// TODO Auto-generated constructor stub
		}
		public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getCity() {
            return city;
        }

        public void setcity(String city) {
                this.city = city;
            }

            public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public void getemail() {
            this.email = email;
			
		}

        @Override
        public String toString() {
            return "\n Full Name : " + firstName + " " + lastName +
                    "\n Address : " + address +
                    "\n City : " + city +
                    "\n State : " + state +
                    "\n Phone : " + phone +
                    "\n Zip : " + zip + "\n";
        }
        public static void main(String[] args){
        	AddressBookContact c1 = new AddressBookContact("Anusha","nallapu","Rotary nagar","Khammam","Telangana",
                                    96528,510072);


	    
        }
		
	

}

