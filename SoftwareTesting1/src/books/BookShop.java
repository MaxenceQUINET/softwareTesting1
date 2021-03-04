package books;

public class BookShop {
	 private String name;

	    /**
	     * Constructor of the class Book shop
	     * @param name name of the book shop
	     */
	    public BookShop(String name){
	        this.name = name;
	    }

	    /**
	     * method to compute the cost of a basket
	     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
	     * @return the cost in euro with the discount
	     */
	    public double cost(int[] books){
	    	// The price
	    double price = 0;
	    //The number of discrepancy books
	    int differentBooks = 0;
	    // We search the number of discrepancy books which has buy
	    for (int i : books) {
			if (i > 0) {
				differentBooks++;
			}
		}
	    
	    // We add the price of each book on the final price
	    for (int i : books) {
			price += 8*i;
		}
	    
	    // We add the promotions depending on the different books purchased
	    if (differentBooks == 1);
	    if (differentBooks == 2) price -= (0.07*price);
	    if (differentBooks == 3) price -= (0.14*price);
	    if (differentBooks == 4) price -= (0.28*price);
	    if (differentBooks == 5) price -= (0.35*price);
			
		// We return the final price
	    return price;
	    }
}
