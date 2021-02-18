import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String args[]) {
        ClasseMetodos m = new ClasseMetodos();

        double notasAlunos[][], media[];
        notasAlunos = new double[3][2];
        media = new double[3];
        int opc = 0;

        do {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("1 - Carregar notas \n2 - Calcular média \n3 - Mostrar Média \n9 - Finalizar"));
            switch (opc) {
                case 1:
                    media = m.carregarNotas(notasAlunos);
                    break;
                case 2:
                    media = m.calculaMedia(media);
                    break;
                case 3:
                    m.mostraMedia(media);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "finaliza");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opc inválida");
            }
        } while (opc != 9);
    }
}
