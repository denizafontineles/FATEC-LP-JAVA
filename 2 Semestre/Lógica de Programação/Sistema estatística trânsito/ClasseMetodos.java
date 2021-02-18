
    // ****  CLASSE MÉTODOS *****************

    import javax.swing.JOptionPane;

    public class ClasseMetodos {

        // FUNÇÃO RECEBENDO REGISTRO aluno E RETORNANDO TIPO ALUNO[]

        public Acidente[] FRegistroAcidentes(Acidente[] acidente) {
            int i;

            for (i = 0; i < 10; i++) {
                acidente[i].CodCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da cidade: "));
                acidente[i].NCidade = JOptionPane.showInputDialog("Insira o nome da cidade: ");
                acidente[i].Qacidentes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes: "));
            }

            return acidente;
        }

        // PROCEDIMENTO RECEBENDO REGISTRO acidente TIPO Acidente[] - mostrar as cidades
        // com quantidade de acidentes entre 100 e 500

        public void ConsultaQtdAcidentes(Acidente[] acidente) {
            int i;
            System.out.println("\nCidades com a quantidade de acidentes maior que 100 e menor que 500: \n ");

            for (i = 0; i < 10; i++) {
                if (acidente[i].Qacidentes > 100 && acidente[i].Qacidentes < 500) {
                    System.out.println("Cod: " + acidente[i].CodCidade + " - Cidade: " + acidente[i].NCidade
                            + " . Quantidade de acidentes: " + acidente[i].Qacidentes);
                }
            }
        }

        // PROCEDIMENTO RECEBENDO REGISTRO acidente TIPO Acidente[] - Exibir cidade com
        // maior e menor quantidade de acidentes

        public void ConsultaPorEstatistica(Acidente[] acidente) {
            int i = 0;

            System.out.println("\nCidade com maior e menor quantidade de acidentes: \n ");

            Acidente maior = new Acidente();
            Acidente menor = new Acidente();

            maior.Qacidentes = acidente[i].Qacidentes;
            maior.CodCidade = acidente[i].CodCidade;
            maior.NCidade = acidente[i].NCidade;

            menor.Qacidentes = acidente[i].Qacidentes;
            menor.CodCidade = acidente[i].CodCidade;
            menor.NCidade = acidente[i].NCidade;

            for (i = 0; i < 10; i++) {
                if (acidente[i].Qacidentes >= maior.Qacidentes) {
                    maior.Qacidentes = acidente[i].Qacidentes;
                    maior.CodCidade = acidente[i].CodCidade;
                    maior.NCidade = acidente[i].NCidade;
                }
                for (i = 0; i < 10; i++) {

                    if (menor.Qacidentes > acidente[i].Qacidentes) {
                        menor.Qacidentes = acidente[i].Qacidentes;
                        menor.CodCidade = acidente[i].CodCidade;
                        menor.NCidade = acidente[i].NCidade;
                    }
                }
            }

            System.out.println("Maior quantidade de acidentes: " + maior.Qacidentes + " - Cidade: " + maior.NCidade
                    + " - Cod: " + maior.CodCidade);
            System.out.println("Menor quantidade de acidentes: " + menor.Qacidentes + " - Cidade: " + menor.NCidade
                    + " - Cod: " + menor.CodCidade);

        }

        // PROCEDIMENTO RECEBENDO REGISTRO acidente TIPO Acidente[] - Calcular Media de
        // acidentes
        public void ConsultaMediaAcidentes(Acidente[] acidente) {
            int i = 0;

            Acidente media = new Acidente();

            for (i = 0; i < 10; i++) {
                media.Qacidentes = media.Qacidentes + acidente[i].Qacidentes;
            }

            media.Qacidentes = media.Qacidentes / i;

            System.out.println("\nMédia de acidentes entre as cidades: " + media.Qacidentes
                    + "\nCidades com a quantidade de acidentes acima da média: \n ");

            for (i = 0; i < 10; i++) {
                if (acidente[i].Qacidentes > media.Qacidentes)
                    System.out.println("Cod: " + acidente[i].CodCidade + " - Cidade: " + acidente[i].NCidade
                            + " - quantidade de acidentes: " + acidente[i].Qacidentes);
            }

        }

    }
