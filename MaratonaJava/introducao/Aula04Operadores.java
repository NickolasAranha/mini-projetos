package nickolasaranha.introducao;

public class Aula04Operadores {
        public static void main(String []args){
        // + - / *
                int number1 = 10;
                int number2 = 20;

                int sum = number1 + number2;
                int subtract = number2 - number1;
                int multiplication = number2 * number1;
                double division = number1 / (double)number2;
                System.out.println(sum);
                System.out.println(subtract);
                System.out.println(multiplication);
                System.out.println(division);

         // %
                int resto = 21 % 7;
                System.out.println(resto);

         // < > <= >= ==  !=
                boolean isDezMaiorqueVinte = 10 > 20;
                boolean isDezMenorqueVinte = 10 < 20;
                boolean isDezIgualaVinte = 10 == 20;
                boolean isDezIgualaDez = 10 == 10.0;
                boolean isDezDiferenteDez = 10 != 10.0;
                System.out.println(isDezMaiorqueVinte);
                System.out.println(isDezMenorqueVinte);
                System.out.println(isDezIgualaVinte);
                System.out.println(isDezIgualaDez);
                System.out.println(isDezDiferenteDez);


                // && (AND)  || (or) ! (not)
                int age = 35;
                float salary = 3500F;

                // AND
                boolean isDentroDaLeiMaiorQue30 = age > 30 && salary >= 4612;
                boolean isDentroDaLeiMenorQue30 = age < 30 || salary >= 3381;
                System.out.println("isDentroDaLeiMaiorQue30 " + isDentroDaLeiMaiorQue30);
                System.out.println("isDentroDaLeiMenorQue30 " + isDentroDaLeiMenorQue30);

                // OR
                double saldoContaCorrente = 100;
                double saldoContaPoupanca = 10000;
                float valorPlaystation = 5000F;
                boolean isPossivelComprarPS5 = saldoContaCorrente >= valorPlaystation || saldoContaPoupanca >= valorPlaystation;
                System.out.println("isPossivelComprarPS5 " + isPossivelComprarPS5);


        // = += -= *= /= %=
                double bonus = 1800;
                 bonus += 200; // 2000
                bonus -= 200; // 1800
                bonus *= 2; // 3600
                bonus /= 2; // 1800
                bonus %= 950; // 850
                System.out.println(bonus);

        // contador (a posição dos sinais muda se a ação vai ser antes ou depois de ler a linha
                int contador = 0;
                contador += 1;
                contador++; // soma 1, igual o de cima;
                contador--; // subtrai 1;
                --contador;
                ++contador; //
                System.out.println(contador);



}
}
