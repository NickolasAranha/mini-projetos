package cursoNelio.interfaces.java.exercicio.model.services;

public class PaypalService implements OnlinePaymentService {

    public Double paymentFee(Double amount) {
        return amount * 0.2;
    }

    public Double interest(Double amount, Integer months) {
        return amount * 0.1 * months;
    }
}
