class NaiveMerchant extends Merchant{
    @Override
    public Double actionPrice(double price, Customer customer) {
        return price*1.5;
    }
}
