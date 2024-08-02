
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Favor inserir o numero da sua agencia: ");
        int NumeroAgencia = input.nextInt();
        input.nextLine();

        System.out.println("Agora insere sua agencia");
        String Agencia = input.next();
        input.nextLine();

        System.out.println("Inserir seu nome: ");
        String NomeCliente = input.next();
        input.nextLine();

        System.out.println("Insere seu numero e saldo total: ");
        String Saldo = input.next();
        float ConverterSaldo = Float.parseFloat(Saldo);

        System.out.println(
                "Olá ".concat(NomeCliente)
                        .concat(" obrigado por criar uma conta em nosso banco, sua agência é ")
                        .concat(Agencia)
                        .concat(", sua conta ")
                        + NumeroAgencia + " e seu saldo " + ConverterSaldo + " já está disponível para saque"
        );

        input.close();
    }


}