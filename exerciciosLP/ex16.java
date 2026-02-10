package exerciciosLP;

import java.io.IOException;
import java.util.Scanner;

// 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.
public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        while (true) {
            try {
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();

                if (!(Math.abs(b - c) < a && a < (b + c))) {
                    throw new ValidationException();
                }
                if (!(Math.abs(a - c) < b && b < (a + c))) {
                    throw new ValidationException();
                }

                if (!(Math.abs(a - b) < c && c < (a + b))) {
                    throw new ValidationException();
                }

                break;
            } catch (ValidationException e) {
                    System.out.println("Um triangulo só existe se " +
                            "um de seus lados deve ser maior que o valor absoluto (módulo) da diferença dos outros dois lados " +
                            "e menor que a soma dos outros dois lados. ");
                };
            }

        System.out.println("Esse triângulo é " + verificarClassificacaoTriangulo(a, b, c));
        sc.close();
        System.out.println("Fim do programa!");

    }

        public static String verificarClassificacaoTriangulo(int a, int b, int c) {
            if (a == b && b == c) {
                return  "equilátero";
            } else if (b == a || a == c || b == c) {
                return "isósceles";
            } else {
                return "escaleno";
            }
        }
    }

