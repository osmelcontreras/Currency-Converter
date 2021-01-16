
public class MoneyTransferService {

	CurrencyConverter cc = new CurrencyConverter();

	double computeTransferAmount(int countryIndex, double amount) {
		return amount * cc.getExchangeRate(countryIndex);
	}

	double computeTransferFee(int countryIndex, double amount) {
		return computeTransferAmount(countryIndex, amount) * 0.02; 
	}

	public static void main(String[] args){
		
		MoneyTransferService ss = new MoneyTransferService();
		double TA = ss.computeTransferAmount(0, 1000); 
		double TF = ss.computeTransferFee(0,1000);
		System.out.println("Transfer Amount: " + TA);
		System.out.println("Transfer Fee: " + TF);
		
		}
	 
}