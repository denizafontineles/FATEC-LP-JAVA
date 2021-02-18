import javax.swing.JOptionPane;
import java.io.*;

public class ClasseIndicadores {

    int numSecao[] = new int [11];
    int numCandidato[][] = new int [301][2];
    int i;

    public void menuIndicadores (Votacao[] votacao) throws IOException{

        int opc;

//Chamada do procedimento de leitura e armazenagem

        pLeituraeArmazenagem(votacao);
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Mostrar Indicadores\n\n Estatísticas de Votação em 2020\n\n1 - Quant. de eleitores por seção\n2 - Seção com maior e menor número de eleitores\n3 - Quantidade de votos por candidato\n4 - 10 primeiros colocados (nro. do cand. e qntd. de votos)\n9 - Retornar ao menu principal\n\n"));
            switch (opc)
            {
                case 1: pQntEleitorespSecao();
                break;

                case 2: pMaioreMenorSecao();
                break;

                case 3: pQntVotospCandidato();
                break;

                case 4: pCandidadosMaisVotados();
                break;

                case 9: JOptionPane.showMessageDialog(null,"Retornando ao menu principal");
                break;

                default: JOptionPane.showMessageDialog(null,"Opção inválida");
            }
        } while (opc != 9);
    }


    public void pLeituraeArmazenagem (Votacao[] votacao) throws IOException{

//Declaração do arquivo de leitura
        
        String nomeArquivo = "Votacao2020.txt";
        BufferedReader leitura = new BufferedReader(new FileReader(nomeArquivo));

        for(i = 0; i < 100; i++){
            votacao[i] = new Votacao();
        }
        for(i = 0; i < 11; i++){
            numSecao[i] = 0;
        }
        for(i = 0; i < 301; i++){
            numCandidato[i][0] = i;
        }

//Leitura e processamento dos dados

        for(i = 0; i < 100; i++)
        {
            votacao[i].NumeroCandidato = Integer.parseInt(leitura.readLine());
            votacao[i].NumeroSecao = Integer.parseInt(leitura.readLine());

            numCandidato[votacao[i].NumeroCandidato][1] = numCandidato[votacao[i].NumeroCandidato][1] + 1;
            numSecao[votacao[i].NumeroSecao] = numSecao[votacao[i].NumeroSecao] + 1;
        }
        leitura.close();
    }
    
//Procedimento da quantidade de eleitores por seção.

    public void pQntEleitorespSecao () {

        System.out.println("\nNúmero de votos por seção:");
        for(i = 0; i < 11; i++)
        {
            System.out.println("Seção " + i + " - " + numSecao[i] + " votos.");
        }
    }

//Procedimento das seções com maior e menor números de eleitores.

    public void pMaioreMenorSecao () {

        int menos, mais;
        int vMenos = 0, vMais = 0;
        
        menos = numSecao[0];
        mais = numSecao[0];

        for (i = 0; i < 11; i++)
        {
            if(numSecao[i] > mais)
            {
                mais = numSecao[i];
                vMais = i;
            }
            if(numSecao[i] < menos)
            {
                menos = numSecao[i];
                vMenos = i;
            }
        }

        System.out.println("\nPosições das seções:");
        System.out.println("A seção com maior número de votos foi a: Seção " + vMais + " com total de: "+ mais + " votos.");
        System.out.println("A seção com menor número de votos foi a: Seção " + vMenos + " com total de: "+ menos + " votos.");
    }


//Procedimento dos votos por candidatos.

    public void pQntVotospCandidato () {

        int aux = 0;

        System.out.println("\nNúmero de votos por candidato:");
        for(i = 0; i < 301; i++)
        {
            if(numCandidato[i][1] == 0)
            {
                aux = aux + 1;
            }
            else
            {
                System.out.println("Candidato " + numCandidato[i][0] + " - " + numCandidato[i][1] + " votos.");
            }
        }

        System.out.println(aux + " candidatos não obtiveram votos.");
    }


//Procedimento para demonstrar os 10 primeiros colocados.

    public void pCandidadosMaisVotados () {

        int j, vcandidato = 0, votos = 0;

        for (i = 0; i < 301; i++)
        {
            for (j = 0; j < 300; j++)
            {
                if(numCandidato[i][1] > numCandidato[j][1])
                {
                    vcandidato = numCandidato[i][0];
                    votos = numCandidato[i][1];

                    numCandidato[i][0] = numCandidato[j][0];
                    numCandidato[i][1] = numCandidato[j][1];

                    numCandidato[j][0] = vcandidato;
                    numCandidato[j][1] = votos;
                }
            }
        }
    
    System.out.println("\nPosição dos 10 mais votados:");
        for (i = 0; i < 10; i++)
        {
            System.out.println((i+1) + "º colocado: candidato " + numCandidato[i][0] + " com " + numCandidato[i][1] + " votos.");
        }
    }
    
}