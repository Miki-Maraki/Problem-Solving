package spring;

public class BirthdayController { // Constructor based injection
	
	//you no longer need to specify @Autowired when using constructor injection. 
/*	
	private final BirthdayService birthdayService;

	public BirthdayInfo(BirthdayService birthdayService){ // constructor
	    this.birthdayService = birthdayService;
	}
	
	
	
	public class BirthdayController { // setter based injection
	
     @Autowired  
	private final BirthdayService birthdayService;

	public BirthdayInfo(){ // constructor
	}
	
	public void setBirthdayService(BirthdayService birthdayService) {
       this.BirthdayService = BirthdayService;
   }
*/
	
}
