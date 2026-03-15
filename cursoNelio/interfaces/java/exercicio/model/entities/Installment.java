package cursoNelio.interfaces.java.exercicio.model.entities;

import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;


public class Installment {
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dueDate;
    private Double amount;
    private Contract contract;

    public Installment(LocalDate dueDate, Double amount, Contract contract) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.contract = contract;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public Contract getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
    }
}
