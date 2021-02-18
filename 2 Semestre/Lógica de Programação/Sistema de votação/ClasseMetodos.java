import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class ClasseMetodos {
    Random aleatorio = new Random();

    public Votacao[] fCadastraVotacao(Votacao[] votacao){

        int i;

        for (i = 0; i < 100; i++)
        {
            votacao[i] = new Votacao();
        }

        //Cadastro dos dados
        for (i = 0; i < 100; i++)
        {
            votacao[i].NumeroSecao = aleatorio.nextInt(10);
            votacao[i].NumeroCandidato = aleatorio.nextInt(300);
        }

        JOptionPane.showMessageDialog(null,"Votação Concluída.");
        return votacao;
    }

//Função para classificar os votos armazenados

    public Votacao[] fClassificaSecao(Votacao[] votacao){

        int i, j, auxSecao = 0, auxCandidato = 0;

        for (i=0; i < 100; i++)
        {
            for (j = 0; j < 99; j++)
            {
                if(votacao[i].NumeroSecao > votacao[j].NumeroSecao)
                {
                    auxSecao = votacao[j].NumeroSecao;
                    auxCandidato = votacao[j].NumeroCandidato;

                    votacao[j].NumeroSecao = votacao[i].NumeroSecao;
                    votacao[j].NumeroCandidato = votacao[i].NumeroCandidato;

                    votacao[i].NumeroSecao = auxSecao;
                    votacao[i].NumeroCandidato = auxCandidato;
                }
            }
        }

        JOptionPane.showMessageDialog(null,"Dados Classificados.");
        return votacao;
    }

//Função para gravar no arquivo de texto.

    public Votacao[] fGravaVotacao (Votacao[] votacao) throws IOException {

    int i;

    //Declaração do arquivo e escrita

    String fileName  = "Votacao2020.txt";
    BufferedWriter writer  = new BufferedWriter(new FileWriter(fileName));

    for(i = 0; i < 100; i++)
    {
        writer.write(Integer.toString(votacao[i].NumeroCandidato));  	
        writer.newLine();
        writer.write(Integer.toString(votacao[i].NumeroSecao));  	
        writer.newLine();
    }

    JOptionPane.showMessageDialog(null,"Arquivo Gerado.");
    writer.close();
    return votacao;
    }
}
