package unit062;

/**
 * @author NPokhrel
 */

public class Purchase {

	int nPStocks; // number of stocks
	double pPStocks; // purchase price of the stock

	public Purchase(int numberOfStocks, double stockPurchasePrice) {
		nPStocks = numberOfStocks;
		pPStocks = stockPurchasePrice;
	}

	public int getnPStocks() {
		return nPStocks;
	}

	public double getpPStocks() {
		return pPStocks;
	}

//nSStocks and pSStocks respectively indicates number of stocks sold and price of stock sold
	public int sell(int nSStocks, double pSStocks) {
		double nTotal; // net total after the transactions

		if (nPStocks >= nSStocks) {
			nTotal = nSStocks * (pSStocks - pPStocks);
			nPStocks -= nSStocks;
		} else {
			System.out.println("Sorry,you do not have required number of shares to complete the transaction.");
			nSStocks = 0;
			nTotal = 0;
		}

		System.out.println("Sales was successful. You have " + nPStocks + " shares left from your recent purchase.");
		System.out.println("The net outcome of your transaction($) is " + nTotal +" ."); // Negative values indicate loss
		System.out.println(" ");
		return nSStocks;
	}
	
}
