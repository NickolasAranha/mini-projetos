package nickolasaranha.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 17;
        boolean isAutorizadoComprarBebida = age >= 18;

        //IF  E ELSE
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida!");
        } else {
            System.out.println("NÃO autorizado a comprar bebida!");
        }

        // ELSE IF
        String categoria;
        if (age < 15) {
            categoria = "Categoria Infantil";
        }
        else if (age >= 15 && age <= 17) {
        categoria = "Categoria Juvenil";
        }
        else{
        categoria = "Categoria Adulta";
        }
        System.out.println(categoria);



    }

}
