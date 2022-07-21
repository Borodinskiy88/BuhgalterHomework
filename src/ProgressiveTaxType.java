public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double change;
        if (amount > 100000) {
            change = amount / 100 * 15;
        } else {
            change = amount / 100 * 10;
        }
        return change;
    }
}
