package cursoNelio.interfaces.java.exercicio.model.services;

import cursoNelio.interfaces.java.exercicio.model.entities.Contract;
import cursoNelio.interfaces.java.exercicio.model.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue() / months;

        for (int i =0; i < months; i++) {
           double interest = onlinePaymentService.interest(basicQuota, i);
           double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            Installment installment = new Installment(contract.getDate().plusMonths(i+1), quota, contract);
           contract.setInstallments(installment);
       }
    }
}
