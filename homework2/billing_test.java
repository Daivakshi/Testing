package Lab2;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class billing_test {

	
	//--------------------------------------------------------------------------------------
	// INVALID CHECK
	
	/**
     * ISREC - 0, e
     * Duration - Invalid - less than minimum of 1 = 0
     * Location - Valid = e
	 * @throws Exception 
     */
    @Test
    void bill_e_lessThanMin() throws Exception{
    	double duration = 0;
    	char location = 'e';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid Integer";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 0, d
     * Duration - Invalid - less than minimum of 1 = 0
     * Location - Valid = d
	 * @throws Exception 
     */
    @Test
    void bill_d_lessThanMin() throws Exception{
    	double duration = 0;
    	char location = 'd';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid Integer";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 0, o
     * Duration - Invalid - less than minimum of 1 = 0
     * Location - Valid = o
	 * @throws Exception 
     */
    @Test
    void bill_o_lessThanMin() throws Exception{
    	double duration = 0;
    	char location = 'o';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid Integer";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 0, z
     * Duration - Invalid - less than minimum of 1 = 0
     * Location - Invalid - not e, o or d = z
	 * @throws Exception 
     */
    @Test
    void bill_z_lessThanMin() throws Exception{
    	double duration = 0;
    	char location = 'z';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid character";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 10, z
     * Duration - Valid - from partition 1 = 10
     * Location - Invalid - not e, o or d = z
	 * @throws Exception 
     */
    @Test
    void bill_z_10() throws Exception{
    	double duration = 10;
    	char location = 'z';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid character";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 30, z
     * Duration - Valid - from partition 2 = 30
     * Location - Invalid - not e, o or d = z
	 * @throws Exception 
     */
    @Test
    void bill_z_30() throws Exception{
    	double duration = 30;
    	char location = 'z';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid character";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 70, z
     * Duration - Invalid - more than maximum of 60 = 70
     * Location - Invalid - not e, o or d = z
	 * @throws Exception 
     */
    @Test
    void bill_z_moreThanMax() throws Exception{
    	double duration = 70;
    	char location = 'z';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid character";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 70, o
     * Duration - Invalid - more than maximum of 60 = 70
     * Location - Valid - o
	 * @throws Exception 
     */
    @Test
    void bill_o_moreThanMax() throws Exception{
    	double duration = 70;
    	char location = 'o';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid Integer";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 70, d
     * Duration - Invalid - more than maximum of 60 = 70
     * Location - Valid - d
	 * @throws Exception 
     */
    @Test
    void bill_d_moreThanMax() throws Exception{
    	double duration = 70;
    	char location = 'd';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid Integer";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
    /**
     * ISREC - 70, e
     * Duration - Invalid - more than maximum of 60 = 70
     * Location - Valid - e
	 * @throws Exception 
     */
    @Test
    void bill_e_moreThanMax() throws Exception{
    	double duration = 70;
    	char location = 'e';
		Exception exception = assertThrows(Exception.class, () -> {
			new Billing().bill(duration, location);
	    });

	    String expectedMessage = "Invalid Integer";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
    }
    
  //--------------------------------------------------------------------------------------
  	// VALID CHECK
  	
  	/**
       * ISREC - 10, o
       * Duration - Valid - in partition 1 = 10
       * Location - Valid = o
       * @throws Exception 
       */
      @Test
      void bill_o_10() throws Exception{
      	double duration = 10;
      	char location = 'o';
  		double bill = new Billing().bill(duration, location);
        assertTrue(bill == (double)5);
      }
      
      /**
       * ISREC - 10, d
       * Duration - Valid - in partition 1 = 10
       * Location - Valid = d
       * @throws Exception 
       */
      @Test
      void bill_d_10() throws Exception{
      	double duration = 10;
      	char location = 'd';
  		double bill = new Billing().bill(duration, location);
        assertTrue(bill == (double)0.5);
      }
      
      /**
       * ISREC - 10, e
       * Duration - Valid - in partition 1 = 10
       * Location - Valid = e
       * @throws Exception 
       */
      @Test
      void bill_e_10() throws Exception{
      	double duration = 10;
      	char location = 'e';
  		double bill = new Billing().bill(duration, location);
        assertTrue(bill == (double)1);
      }
      
      /**
       * ISREC - 30, o
       * Duration - Valid - in partition 2 = 30
       * Location - Valid = o
       * @throws Exception 
       */
      @Test
      void bill_o_30() throws Exception{
      	double duration = 30;
      	char location = 'o';
  		double bill = new Billing().bill(duration, location);
        assertTrue(bill == (double)20);
      }
      
      /**
       * ISREC - 30, d
       * Duration - Valid - in partition 2 = 30
       * Location - Valid = d
       * @throws Exception 
       */
      @Test
      void bill_d_30() throws Exception{
      	double duration = 30;
      	char location = 'd';
  		double bill = new Billing().bill(duration, location);
        assertTrue(bill == (double)2);
        duration = 29.00000001;
      	location = 'D';
  		bill = new Billing().bill(duration, location);
        assertTrue(bill == (double)2);
      }
      
      /**
       * ISREC - 30, e
       * Duration - Valid - in partition 2 = 30
       * Location - Valid = e
       * @throws Exception 
       */
      @Test
      void bill_e_30() throws Exception{
      	double duration = 30;
      	char location = 'e';
  		double bill = new Billing().bill(duration, location);
        assertTrue(bill == (double)7);
      }

}
