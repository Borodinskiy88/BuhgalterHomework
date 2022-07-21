public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double change = amount / 100 * 13;
        return change;
    }
}
