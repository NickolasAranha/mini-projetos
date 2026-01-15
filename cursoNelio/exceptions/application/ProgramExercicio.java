package cursoNelio.exceptions.application;
import cursoNelio.exceptions.model.entities.Account;
import cursoNelio.exceptions.model.exceptions.BankException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ProgramExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
                Random r = new Random(); // Vou usar isso, pois não tenho um sistema de banco de dados com auto_increment.
                Integer number = r.nextInt(1000);
                System.out.println("Informe seu nome: ");
                String name = sc.nextLine();
                Double limit = 2000.00;
                System.out.println("Deseja fazer um depósito inicial? Digite 1 se sim" );
                Account account = new Account(number, name, limit);
                if(sc.nextInt() == 1) {
                    System.out.println("Insira o valor que deseja depositar: ");
                    account.deposit(sc.nextDouble());
                }
                System.out.println("Conta: " + account);

            System.out.println("Deseja fazer um saque? Digite 1 se sim");
            if(sc.nextInt() == 1) {
                System.out.println("Quanto deseja sacar?");
                account.withdraw(sc.nextDouble());
            }

        } catch(InputMismatchException e) {
            System.out.println("Valor inválido!");
        } catch(BankException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally { sc.close(); }
    }
}
