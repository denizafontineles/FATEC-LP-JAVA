import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String args[]) {
        // INSTÂNCIA DA CLASSE ABSTRATA COM 10 REGISTROS TIPO VETOR

        Acidente[] acidente = new Acidente[10];

        // INSTÂNCIA DA CLASSEMETODOS

        ClasseMetodos m = new ClasseMetodos();

        int i;

        // EXECUÇÃO DO MÉTODO CONSTRUTOR

        for (i = 0; i < 10; i++) {
            acidente[i] = new Acidente();
        }

        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastro Estatística \n 2 - Consulta por quantidade de acidentes \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Finaliza"));
            switch (opc) {
                case 1:
                    acidente = m.FRegistroAcidentes(acidente); // CHAMADA FUNÇÃO
                    break;
                case 2:
                    m.ConsultaQtdAcidentes(acidente); // CHAMADA PROCEDIMENTO
                    break;
                case 3:
                    m.ConsultaPorEstatistica(acidente); // CHAMADA PROCEDIMENTO
                    break;
                case 4:
                    m.ConsultaMediaAcidentes(acidente); // CHAMADA PROCEDIMENTO
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida");
                    
            }    
        }
    }
}
