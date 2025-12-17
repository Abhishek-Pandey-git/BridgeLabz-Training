public class ProfitAndLoss {
    public static void main(String[] args){
        int costPrice=129, sellingPrice=191;
        // calculating profit in number by Profit/Loss==sellingPrice-costPrice
        int profit=sellingPrice-costPrice;
        double percentage= (profit/costPrice)*100;
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice);
		System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+percentage);
       
    }
}
