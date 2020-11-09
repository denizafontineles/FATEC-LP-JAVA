import javax.swing.JOptionPane;

public class ClasseMetodos {

    double media[] = new double[3];

    public double[] carregarNotas(double notasAlunos[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                notasAlunos[i][j] = Double
                        .parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j + 1) + " do aluno " + (i + 1)));
                media[i] = media[i] + notasAlunos[i][j];
            }
        }
        return media;
    }

    public double[] calculaMedia(double media[]) {
        double somaMedia;
        somaMedia = 0;
        for (int i = 0; i < 3; i++) {
            somaMedia = media[i] / 2;
            System.out.println("A média do aluno " + (i + 1) + " é: " + somaMedia);
        }
        JOptionPane.showMessageDialog(null, "Calculo efetuado com sucesso");
        return media;
    }

    public void mostraMedia(double media[]) {

        String mostra = " ";
        for (int i = 0; i < 3; i++) {
            mostra += ("\t " + media[i] / 2);
            JOptionPane.showMessageDialog(null, "A média do aluno " + (i + 1) + " é " + mostra);
        }
    }
}
