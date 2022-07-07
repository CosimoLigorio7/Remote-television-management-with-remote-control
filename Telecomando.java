
/**
 * Aggiungi qui una descrizione della classe Telecomando
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Telecomando
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private Televisione mioTelevisore;

    /**
     * Costruttore degli oggetti di classe  Telecomando
     */
    public Telecomando()
    {
        // inizializza le variabili d'istanza
        mioTelevisore = new Televisione();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void accendiTelevisione()
    {
        // metti qui il tuo codice
        mioTelevisore.accendiTv();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void spegniTelevisione()
    {
        // metti qui il tuo codice
        mioTelevisore.spegniTv();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void canalePiu()
    {
        // metti qui il tuo codice
        mioTelevisore.avantiCanale();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void canaleMeno()
    {
        // metti qui il tuo codice
        mioTelevisore.indietroCanale();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void volumePiu()
    {
        // metti qui il tuo codice
        mioTelevisore.aumentaVolume();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void volumeMeno()
    {
        // metti qui il tuo codice
        mioTelevisore.abbassaVolume();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void luminositaPiu()
    {
        // metti qui il tuo codice
        mioTelevisore.aumentaLuminosita();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void luminositaMeno()
    {
        // metti qui il tuo codice
        mioTelevisore.abbassaLuminosita();
    }
    
    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    public void audioMuto()
    {
        // metti qui il tuo codice
        mioTelevisore.muto();
    }
    
}
