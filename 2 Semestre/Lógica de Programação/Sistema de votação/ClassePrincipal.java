
// ****  CLASSE PRINCIPAL *****************

import java.io.IOException;
import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String arg[]) throws IOException {

        Votacao[] votacao = new Votacao[100];

        ClasseMetodos metodos = new ClasseMetodos();
        ClasseIndicadores indicadores = new ClasseIndicadores();

        int i;
        int opc = 0;

        // Execução do método construtor
        for (i = 0; i < 100; i++) {
            votacao[i] = new Votacao();
        }

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "SISTEMA DE VOTAÇÃO\n\n1 - Carregar Seção/Número Eleitor \n2 - Classificar por Seção\n3 - Gravar registros\n4 - Mostrar Indicadores\n9 - Finalizar\n\n"));
            switch (opc) {
                case 1:
                    votacao = metodos.fCadastraVotacao(votacao);
                    break;

                case 2:
                    votacao = metodos.fClassificaSecao(votacao);
                    break;

                case 3:
                    metodos.fGravaVotacao(votacao);
                    break;

                case 4:
                    indicadores.menuIndicadores(votacao);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida\nRetornando ao menu");
            }

        } while (opc != 9);

    }
}