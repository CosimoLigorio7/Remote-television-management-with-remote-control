
/**
 * Aggiungi qui una descrizione della classe Televisione
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Televisione
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private boolean statoTv;
    private int canale;
    private int volume;
    private int luminosita;
    private String marca;
    private String pollici;
    private String colore;
    private boolean muto;
    private int savevolume;
    private final int CANALEmASSIMO=500;
    private final int CANALEmINIMO=1;
    private final int VOLUMEmASSIMO=100;
    private final int VOLUMEmINIMO=0;
    private final int LUMINOSITAmASSIMA=100;
    private final int LUMINOSITAmINIMA=0;
    


    /**
     * Costruttore degli oggetti di classe  Televisione
     */
    public Televisione()
    {
        // inizializza le variabili d'istanza
        statoTv=false;
        canale=1;
        volume=2;
        luminosita=50;
        savevolume=0;
        muto=false;
        marca="Hisense";
        pollici="55";
        colore="Nero";
    }

    /**
     * Accendi Tv
     */
    public void accendiTv()
    {
        // metti qui il tuo codice
        if(statoTv == false)
        {
            statoTv=true;
            System.out.println("La tv e' stata accesa");
        }
        else 
        {
            System.out.println("La tv e' gia' accesa");
        }
    }
    
    /**
     * Spegni Tv
     */
    public void spegniTv()
    {
        // metti qui il tuo codice
        if(statoTv == true)
        {
            statoTv=false;
            System.out.println("La tv e' stata spenta");
        }
        else 
        {
            System.out.println("La tv e' gia' spenta");
        }
    }
    
    /**
     * cambia canale
     */
    public void avantiCanale()
    {
        // metti qui il tuo codice
        if(statoTv == true)
        {
           if(canale == CANALEmASSIMO)
           {
               canale=CANALEmINIMO;
           }
           else
           {
               canale++;
           }
        }
        else
        {
            System.out.println("La tv e' spenta, accendila");
        }
    }
    
    /**
     * cambia canale
     */
    public void indietroCanale()
    {
        // metti qui il tuo codice
        if(statoTv == true)
        {
           if(canale == CANALEmINIMO)
           {
               canale=CANALEmASSIMO;
           }
           else
           {
               canale--;
           }
        }
        else
        {
            System.out.println("La tv e' spenta, accendila");
        }
    }
    
    /**
     * aumenta volume
     */
    public void aumentaVolume()
    {
        // metti qui il tuo codice
        if(statoTv == true)
        {
           if(volume == VOLUMEmASSIMO)
           {
               if(muto == true)
               {
                   muto=false;
                   volume=savevolume;
               }
               volume=VOLUMEmASSIMO;
           }
           else
           {               
               if(muto == true)
               {
                   muto=false;
                   volume=savevolume;
               }
               volume++;
           }
        }
        else
        {
            System.out.println("La tv e' spenta, accendila");
        }
    }
    
    /**
     * abbassa volume
     */
    public void abbassaVolume()
    {
        // metti qui il tuo codice
        if(statoTv == true)
        {
            if(muto == true)
               {
                   muto=false;
                   volume=savevolume;
                   if(volume > VOLUMEmINIMO)
                   {
                       volume--;
                   }
               }
               
           }
       
        else
        {
            System.out.println("La tv e' spenta, accendila");
        }
    }
    
    /**
     * aumenta luminosità
     */
    public void aumentaLuminosita()
    {
        // metti qui il tuo codice
        if(statoTv == true)
        {
           if(luminosita == LUMINOSITAmASSIMA)
           {
               luminosita=LUMINOSITAmASSIMA;
           }
           else
           {
               luminosita++;
           }
        }
        else
        {
            System.out.println("La tv e' spenta, accendila");
        }
    }
    
    /**
     * abbassa luminosità
     */
    public void abbassaLuminosita()
    {
        // metti qui il tuo codice
        if(statoTv == true)
        {
           if(luminosita == LUMINOSITAmINIMA)
           {
               luminosita=LUMINOSITAmINIMA;
           }
           else
           {
               luminosita--;
           }
        }
        else
        {
            System.out.println("La tv e' spenta, accendila");
        }
    }
    
    /**
     * Imposta muto
     */
    public void muto
    ()
    {
        if(statoTv == true)
        {
            if(muto == false)
            {
                savevolume=volume;
                muto=true;
                volume=0;
            }
            else
            {
                muto=false;
                volume=savevolume;
            }
        }
        else
        {
            System.out.println("La tv e' spenta, accendila");
        }
    }
}
