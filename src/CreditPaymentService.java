public class CreditPaymentService {
    public int Calculate(double loanAmount, double loanTerm, double loanRate) {
        double monthlyPayment = (loanAmount * (loanRate/12/100) / (1 - Math.pow(1 + (loanRate/12/100), -loanTerm)));


        return (int) monthlyPayment;
    }

}
