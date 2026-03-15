package cursoNelio.interfaces.java.application;

import cursoNelio.interfaces.java.model.entities.CarRental;
import cursoNelio.interfaces.java.model.entities.Vehicle;
import cursoNelio.interfaces.java.model.services.BrazilTaxService;
import cursoNelio.interfaces.java.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro");
        String carModel = sc.nextLine();
        System.out.print("Retirada dd/mm/YYYY hh/ss: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno dd/mm/YYYY hh/ss: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start,finish, new Vehicle(carModel));
        System.out.println("Entre com preço em hora: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço em dia: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("Fatura: " );
        System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Preço final: " + cr.getInvoice().getTotalPayment());
    }
}
