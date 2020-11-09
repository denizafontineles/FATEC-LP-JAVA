public class Votacao {
  int NumeroSecao        ;
  int NumeroCandidato;

  Votacao(){
      this(0,0);
  }
  Votacao(int NumSecao, int NumCandidato){
      this.NumeroSecao  = NumSecao;
      this.NumeroCandidato = NumCandidato;
  }
}