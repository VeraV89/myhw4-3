public class CreditPaymentService {
    //    public int calculate(double loanAmount, double loanTerm, double loanRate) {
//        double monthlyPayment = (loanAmount * (loanRate/12/100) / (1 - Math.pow(1 + (loanRate/12/100), -loanTerm)));
//
//
//        return (int) monthlyPayment;
//    }
    public int calculate(double loanAmount, double loanTerm, double loanRate) {
        double monthlyRate = loanRate / 12 / 100;

        double numerator = loanAmount * monthlyRate;
        double denominator = 1 - Math.pow(1 + monthlyRate, -loanTerm);

        double monthlyPayment = numerator / denominator;

        return (int) monthlyPayment;
    }

}
