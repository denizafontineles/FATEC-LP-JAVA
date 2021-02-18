

// ****  CLASSE ABSTRATA *****************

// Classe Abstrata
class Acidente 	
{	
  int CodCidade;	
  String NCidade;	
  int Qacidentes;	
	
  // Método Construtor	
  Acidente()
   {	
     this(0 ,"" , 0);	
   }	

  // Método Procedimento
  Acidente ( int CodigoCidade,	
        String NomeCidade,	
         int QtdAcidentes)	
   {	
     CodCidade  = CodigoCidade;	
     NCidade  = NomeCidade;	
     Qacidentes  = QtdAcidentes;	
   }	
 }	
