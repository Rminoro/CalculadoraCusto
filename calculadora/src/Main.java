import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
    
        var Profi = new Profissional();

        System.out.print("Digite o nome do Profissional: ");
        Profi.setNome(sc.nextLine());
        System.out.print("Digite o salario do Profissional: ");
        Profi.setSalarioMensal(sc.nextDouble());
        clearBuffer(sc);

        ArrayList<ItemSistema> listas = new ArrayList<ItemSistema>();

        while (true) {
            var tela = new ItemSistema();
            System.out.println("");
            System.out.print("Digite o nome do Item: ");
            String nomeItem = sc.nextLine();
            tela.setNomeItem(nomeItem);

            System.out.print("Digite o tipo do Item: ");
            String tipoItem = sc.nextLine();
            tela.setTipoItem(tipoItem);

            System.out.print("Digite o numero da complexidade (EX: 1): ");
            int complexidade = sc.nextInt();
            tela.setComplexidade(complexidade);

            listas.add(tela);

            int totalHorasTelas = 0;
            int numeroTela = 1;

            System.out.print("Deseja Inserir mais uma tela ? [S] ou [N]: ");
            String resp = sc.next();

            for (ItemSistema itemSistema : listas) {
                totalHorasTelas = totalHorasTelas + itemSistema.CalculaQtdHoras();

                System.out.println("------------------------------");
                System.out.println("        INFORMAÇÕES");
                System.out.println("------------------------------");
                System.out.println("");
                System.out.println("Item " + numeroTela + " do orçamento: ");
                System.out.println("Nome do Item: " + itemSistema.getNomeItem());
                System.out.println("Tipo do Item: " + itemSistema.getTipoItem());
                System.out.println("Complexidade do Item: " + itemSistema.getComplexidade());
                System.out.println("Quantidade de Horas Previstas: " + itemSistema.CalculaQtdHoras());

                numeroTela++;
            }

            double valorTotalSistema = Profi.CalculaValorHora() * totalHorasTelas;

            System.out.println("");
            System.out.format("Valor total do Orçamento: %.2f", valorTotalSistema);
            System.out.println("");

            if (resp.equalsIgnoreCase("N")) {
                break;
            }
            clearBuffer(sc);
        }

    }

    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
