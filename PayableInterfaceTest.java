public class PayableInterfaceTest {
    public static void main(String[]args)
    {
        Payable[] payablesObjects = new Payable[4];
        payablesObjects[0] = new Invoice("01234","seat",2,375.00);
        payablesObjects[1] = new Invoice("05678","tire",4,95.00);
        payablesObjects[2] = new SalariedEmployee("Shon","Connery","123-11-1234",1250.0);
        payablesObjects[3] = new SalariedEmployee("Sindy","Vortex","321-21-4321",1500);

        System.out.println("Invoices and Employess processed polymorphically:\n");

        for(Payable currentPayable: payablesObjects)
        {
            System.out.printf("%s \n%s: $%.2f\n\n",
                    currentPayable.toString(),
                    "payment due:",currentPayable.getPaymentAmount());
        }
    }
}
