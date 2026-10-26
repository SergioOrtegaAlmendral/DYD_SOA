
public class Enemigo{
    private String nombreMostro;
    private int vidaMostroAhora;
    private int vidaMostro;
    private int dañoMostro;

    public Enemigo(String NombreMostro, int VidaMostro, int DañoMostro){
        this.nombreMostro = nombreMostro;
        this.vidaMostro = vidaMostro;
        this.vidaMostroAhora = vidaMostro;
        this.dañoMostro = dañoMostro;
    }

    public void recibirDañoMostro(int daño){
        vidaMostroAhora -= daño;
    }

    public boolean estaDerrotado(){
        boolean derrotado = false;

        if (vidaMostroAhora <= 0){
            derrotado = true;
        }
        return derrotado;
    }

    public String getNombreMostro() {
        return nombreMostro;
    }

    public int getVidaMostro() {
        return vidaMostro;
    }
    
    public int getDañoMostro() {
        return dañoMostro;
    }
    
    public int getVidaMostroAhora() {
        return vidaMostroAhora;
    }


}