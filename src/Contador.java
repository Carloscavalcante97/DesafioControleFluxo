import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch ( IllegalArgumentException error) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            throw new IllegalArgumentException("Parametro um não pode ser maior que o dois");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws IllegalArgumentException{
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
     if (parametroUm > parametroDois) {throw new IllegalArgumentException("Parametro um não pode ser maior que o dois");}
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        int i = 0;
        while(i < contagem) {
            i++;
            System.out.println(i+",");

        }
    }
}

