package _6_Assesment5_Repls;

public class Stock {
	
	//1.fields, attributes-outside of method
	//variable general name
	String tickerSymbol;
	String companyName;
	int price;
	double percentChange;
	int totalShares;
	long marketCap;

	//2. Constructor
   	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.marketCap=totalShares*price;
	}
	
    //3. Class Methods
    public void adjustPrice(int value) { //change amount = value
    	percentChange =(double) value/price; //double = 1.0 *int/int;
    	price =price+value;                  //price += value;
    	marketCap=totalShares*price;
    }

   	
	public String toString() {
		return "Ticker Symbol: "+tickerSymbol+ 
				"\nCompany: " + companyName+
				"\nCurrent Price: $"+price+" ("+percentChange+"%)"+ 
				"\nMarket Cap: $"+marketCap;
	}
	
	

}
