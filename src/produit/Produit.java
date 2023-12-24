
package produit;

public class Produit {

   private int id;
    private String désignation;
    private String quantité;
  
    
    public Produit(int ID, String Désignation, String Quantité )
    {
        this.id = ID;
        this.désignation = Désignation;
        this.quantité= Quantité;
     
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getDésignation()
    {
        return désignation;
    }
    
    public String getQuantité()
    {
        return quantité;
    }
  
}