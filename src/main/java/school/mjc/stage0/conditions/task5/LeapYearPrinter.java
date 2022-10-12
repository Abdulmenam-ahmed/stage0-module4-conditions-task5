package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
    	String leap = "" ;
    	if ( ((year %4 ==0 ) &&(year %100 !=0 || year %400 == 0) )) {
    		leap="true";}
    	  switch(leap) {
    	  case "true":
    		  System.out.println("leap");
    		  break;
    	  default:
    		  System.out.println("not leap");
    	  
    	  
    	  }
          
			
    	
    }
}
