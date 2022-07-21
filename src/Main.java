public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        Bill[] payments = new Bill[]{
                new Bill(200000, incomeTaxType, taxService),
                new Bill(200000, vaTaxType, taxService),
                new Bill(200000, progressiveTaxType, taxService)
                // TODO создать платежи с различным типами налогообложения
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }

}