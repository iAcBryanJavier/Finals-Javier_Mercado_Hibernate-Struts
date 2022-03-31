package platenumber.coding.model;




public class PlateNumberBean {
	
	private String busName;
	private String plateNumber;
	private String driverAssigned;
	private String codingDay;
	
	public PlateNumberBean(){
		
	}
	
	public PlateNumberBean(String busName, String plateNumber, String driverAssigned){
		this.busName = busName;
		this.plateNumber = plateNumber;
		this.driverAssigned = driverAssigned;
	}
	
	public void determineCoding(){
		char endingNumber = this.plateNumber.charAt(plateNumber.length()-1);
		
		if(endingNumber == '1' || endingNumber == '2'){
			this.codingDay = "Monday";
		}else if(endingNumber == '3' || endingNumber == '4'){
			this.codingDay = "Tuesday";
		}else if(endingNumber == '5' || endingNumber == '6'){
			this.codingDay = "Wednesday";
		}else if(endingNumber == '7' || endingNumber == '8'){
			this.codingDay = "Thursday";
		}else{
			this.codingDay = "Friday";
		}
		
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		System.out.println("setter method called");
		this.busName = busName;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		System.out.println("setter method called");
		this.plateNumber = plateNumber.toUpperCase();
	}

	public String getDriverAssigned() {
		return driverAssigned;
	}

	public void setDriverAssigned(String driverAssigned) {
		System.out.println("setter method called");
		this.driverAssigned = driverAssigned;
	}

	public String getCodingDay() {
		return codingDay;
	}

	public void setCodingDay(String codingDay) {
		System.out.println("setter method called");
		this.codingDay = codingDay;
	}

}
