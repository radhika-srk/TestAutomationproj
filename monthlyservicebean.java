public class Bookingservice{

	//Storing monthly details into database
	public void insertbooking(String userid,Date journeydate,String pname,String age,.....etc){
							---------------------------------------------------------------
							        //passing more than 3 parameters is not good practice in real time
									// its creates lot of confusion while developing
		String query="insert into ------";

	}
}
public class Booking{
	String userid;
	Date  journeydate;
	//if more than one passenger we will take array ,its just one passenger scenario
	String passengername;
	String age;
	String idproof;
	//etc....

	public void bookjourney(){

		// create Bookingservice object to pass passenger details
		Bookingservice bookingObj=new Bookingservice();
		// if we have 10 parameters, here we have to pass 10
		// to avoid this, we use java bean to pass all parameters in single parameter in the form of object
		bookingObj.insertbooking(userid,journeydate,passengername,age,idproof..);
		--------------------------------------------------------------------------
		

		
		// after created bean we just pass object like below for above same statement

		bookingObj.insertbooking(BookingBean beanObj);

	}

}
public class BookingBean{
	private int userid;
	private Date  journeydate;
	private //if more than one passenger we will take array ,its just one passenger scenario
	private String passengername;
	private String age;
	private String idproof;
	//etc....


	//access methods or getter and setter methods
	public void setuserid(int userid){
		this.userid=userid;
	}
	public int getuserid(){
		return userid;
	}
	public void setjourneydate(String journeydate){
		this.journeydate=journeydate;
	}
	public int getjourneydate(){
		return journeydate;
	}
	//.......etc





}