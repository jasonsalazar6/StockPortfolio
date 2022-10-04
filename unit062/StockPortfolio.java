package unit062;

/**
 * Name: Nishant Pokhrel 
 * Date: October 10, 2021 
 * Subject: CS 216- Data Structures & Algorithms 
 * Assignemt: chapter05 
 * Purpose: This program tracks the stock portfolio and 
 * gives out profit/loss that occurred from the transactions.
 * 
 * @author Npokhrel
 */
public class StockPortfolio {

	public static void main(String[] args) {

		Purchase stock1 = new Purchase(10, 100);
		Purchase stock2 = new Purchase(38, 160);
		Purchase stock3 = new Purchase(22, 200);

		OurStack<Purchase> order = new OurStack<>();

		Purchase[] transactions = { stock1, stock2, stock3 };

		for (Purchase stocks : transactions) 
		{
			System.out.println("Congratulations, you successfully purchased " + stocks.getnPStocks() + " stocks at $"
					+ stocks.getpPStocks() + " each.");
			addtoPortfolio(stocks, order);
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The negative value for the net outcome indicates loss.");
		System.out.println(" ");

		sellOrder(order, 22, 380);
		sellOrder(order, 38, 120);
		sellOrder(order, 10, 270);

	}

	public static void addtoPortfolio(Purchase stocks, OurStack order) 
	{
		order.push(stocks);
	}

	public static void sellOrder(OurStack<Purchase> order, int nSStocks, double pSStocks) 
	{
		double nTotal;
		
		System.out.println("You are trying to sell " + nSStocks + " shares from your portfolio.");
		
		Purchase stock = order.pop();
		int iStocks = stock.getnPStocks(); // iStocks is the starting number of stocks in the portfolio
		nSStocks = stock.sell(nSStocks, pSStocks);
		
		if (nSStocks != iStocks) 
		{
			order.push(stock);
		}

	}
}