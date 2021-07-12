package A_2Test;

 class totalPayment implements Payments {

	@Override
	public int getPayment() {
		
		int dailySales = 450000;
		
		return dailySales/30;
	}

		@Override
		public int getPayment(int income, int spending) {
			
			return income-spending;
		}
		
	}

 class totalPayment1 implements Payments1 {

	@Override
	public int getPayment1() {
		
		return 150;
	}

		

}
