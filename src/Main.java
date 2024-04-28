import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Bruce Dickinson";
        String tipoDeConta = "Conta corrente";
        double saldoInicial = 2500.00;
        double saldoAtual = saldoInicial;
        double valor;
        int escolha = 0;

        // Dados iniciais do cliente
        System.out.println("******************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
        System.out.println("\n******************************");

        String menu = """
                 Operações
                
                 1- Consultar saldos
                 2- Receber valor
                 3- Transferir valor
                 4- Sair
                """;

        while (escolha != 4) {

            // Menu de operações
            System.out.println(menu);

            // Solicitando a escolha do usuário
            System.out.println("\nDigite a operação desejada: ");
            escolha = leitura.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Saldo atual: " + saldoAtual);
                    System.out.println("******************************");
                    break;

                case 2:
                    System.out.print("valor recebido: R$");
                    valor = leitura.nextDouble();
                    saldoAtual = saldoAtual + valor;
                    System.out.println();
                    break;

                case 3:
                    System.out.print("valor a transferir: R$");
                    valor = leitura.nextDouble();
                    if (valor > saldoAtual) {
                        while (valor > saldoAtual) {
                            String sair;
                            System.out.println("Saldo infuficiente!");
                            System.out.println("S para sair ou C para continuar");
                            sair = leitura.next();
                            if (sair.equals("S")) {
                                break;
                            } else if (sair.equals("C")) {
                                System.out.println("Digite outro valor");
                                valor = leitura.nextDouble();
                            }

                        }
                    }
                    saldoAtual -= valor;
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Programa encerrado com sucesso");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");

            }
        }

    }
}