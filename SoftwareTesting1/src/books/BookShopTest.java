package books;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

	//Here we just create the data to perform the different tests
	 BookShop HarryPotterShop = new BookShop("HarryPotterShop");

	 int []books= {1,0,0,0,0};
	 int []booksComplexe = {1, 2, 0, 0, 1};
	 int []booksSimple = {1, 1, 1, 1, 1};
	 
	 
    @SuppressWarnings("deprecation")
    
    
 // Basic Test with just 1 books
 	 @Test
 	    public void costTest(){
 	    	System.out.println("The customer takes 1 book, so the result should be : 8€");
 	    	double result = HarryPotterShop.cost(books);
 	    	System.out.println(result);
 	    	assertEquals(8.00, result, 0.00);
 	    }
    
    
    //A simple test: 5 books, all different
    
    @Test
    public void costTestSimple(){
    	System.out.println("The customer takes 5 books including 5 different, so the price should be 5 * 8 = 40 - 35% off, or 40-35% = 26€");
    	double result = HarryPotterShop.cost(booksSimple);
    	System.out.println(result);
    	assertEquals(26.00, result, 0.00);
    }
    
    //A complex test: 4 books, but 3 different
    
	@Test
    public void costTestComplexe(){
    	System.out.println("The customer takes 4 books including 3 different, so the price should be 4 * 8 = 32 - 14% off, or 32-14% = 27.52€");
    	double result = HarryPotterShop.cost(booksComplexe);
    	System.out.println(result);
    	assertEquals(27.52, result, 0.00);
    }

	
	/* 
	 * With these 3 tests: 1 test with a single purchase, 1 test with several purchases and all different, and another with several 
	 * purchases but some duplicate, we can confirm that the code is functional
	 */
    
}