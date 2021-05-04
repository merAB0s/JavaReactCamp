package Entities;



public class User {
	
		int id;
		String firstName;
		String lastName;
		String nationalityId;
		int dateOfBirth;
		String birthPlace;
		
		
		public User() {
	
		}

		
		public User(int id,String firstName,String lastName,String nationalityId,int dateOfBirth,String birthPlace) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationalityId = nationalityId;
			this.dateOfBirth = dateOfBirth;
			this.birthPlace = birthPlace;
			
		}
		
		@Override
		public String toString() {
		        return
		                "   KULLANICI BÝLGÝLERÝ "+ '\n' +
		                "Tc= " + getNationalityId() + '\n' +
		                "Ad= " + getFirstName() + '\n' +
		                "Soyad= " + getLastName() + '\n' +
		                "Doðum Yýlý= " + getDateOfBirth() + '\n' +  
		                "Doðam Yeri= " + getBirthPlace();
		    }
		
		
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getNationalityId() {
			return nationalityId;
		}
		public void setNationalityId(String nationalityId) {
			this.nationalityId = nationalityId;
		}
		public int getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(int dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getBirthPlace() {
			return birthPlace;
		}
		public void setBirthPlace(String birthPlace) {
			this.birthPlace = birthPlace;
		}
		
		

	

}
