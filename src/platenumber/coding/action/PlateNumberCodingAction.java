package platenumber.coding.action;

import platenumber.coding.model.PlateNumberBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("serial")
public class PlateNumberCodingAction extends ActionSupport
				implements ModelDriven<PlateNumberBean>{
	
	private PlateNumberBean plateCoding = new PlateNumberBean();

	public PlateNumberBean getPlateCoding() {
		return plateCoding;
	}

	public void setPlateCoding(PlateNumberBean plateCoding) {
		this.plateCoding = plateCoding;
	}

	//Struts 2 Methods
		@Override
		public String execute() {
			//calling these two methods will populate the computed values  
			plateCoding.determineCoding();
			
			SessionFactory sessionFactory = 
					new Configuration().configure().buildSessionFactory();
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(plateCoding); //same of SQL insert into statement 
			session.getTransaction().commit();

			return SUCCESS;
		
		}
		
		@Override
		public void validate() {
			if (plateCoding.getBusName().trim().length() == 0 ) {
				addFieldError("busName", "Invalid Bus Name");
			}
			
			if (plateCoding.getPlateNumber().trim().length() == 0) {
				addFieldError("plateNumber", "Invalid Plate Number");
			}
			
			if (plateCoding.getDriverAssigned().trim().length() == 0) {
				addFieldError("driverAssigned", "Invalid Driver Name");
			}
		}
		
		@Override
		public String toString() {
			return ("Bus Name: " + plateCoding.getBusName() + "\n" +
					"Plate Number: " + plateCoding.getPlateNumber() + "\n" + 
					"Driver Assigned: " + plateCoding.getDriverAssigned() + "\n" + 
					"Plate Number Coding: " + plateCoding.getCodingDay() + "\n");
			}
			
		public PlateNumberBean getModel() {
			// TODO Auto-generated method stub
			return plateCoding;
		}
	}
