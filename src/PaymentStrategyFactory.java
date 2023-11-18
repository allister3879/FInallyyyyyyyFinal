class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy(int choice, String cardNumber) {
        switch (choice) {
            case 1:
                return new CreditCardPayment(cardNumber);
            case 2:
                return new CashPayment();
            default:
                throw new IllegalArgumentException("Invalid payment choice");
        }
    }
}
