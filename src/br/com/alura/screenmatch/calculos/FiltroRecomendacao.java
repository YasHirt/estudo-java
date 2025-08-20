package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.calculos.Classificavel;
public class FiltroRecomendacao {
    public void Filtra(Classificavel classificavel) //Classe que depende da implementação do contrato (interface) Classificavel
    {
        if (classificavel.getClassificado() >= 4) {
            System.out.println("Está entre os mais assistidos do momento.");
            
        }
        else if (classificavel.getClassificado() >=3) {
            System.out.println("Vale a pena assistir.");
        }
        else 
            System.out.println("Coloque na lista de espera.");
        
    }
}
