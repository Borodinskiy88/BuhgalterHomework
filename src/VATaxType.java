public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double change = amount / 100 * 18;
        return change;
    }
}
