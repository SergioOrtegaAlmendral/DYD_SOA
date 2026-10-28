public class Aventurero {
    private final int curacionPocion = 60;
    
    private String nombreAventurero;
    private int vidaAventureroAhora;
    private int vidaMaximaAventurero;
    private int dañoAventurero;
    private int cantidadPociones;

    public Aventurero(String nombreAventurero, int vidaMaximaAventurero, int dañoAventurero, int cantidadPociones){
        this.nombreAventurero = nombreAventurero;
        this.vidaMaximaAventurero = vidaMaximaAventurero;
        this.vidaAventureroAhora = vidaMaximaAventurero;
        this.dañoAventurero = dañoAventurero;
        this.cantidadPociones = cantidadPociones;
    }

    public void atacar(Enemigo enemigo){
        enemigo.recibirDañoMostro(dañoAventurero);
    }

    public void bbPosionPaCura(){
        if (cantidadPociones > 0){
            cantidadPociones--;
            vidaAventureroAhora += curacionPocion;
            if(vidaAventureroAhora > vidaMaximaAventurero){
                vidaAventureroAhora = vidaMaximaAventurero;
            }
        }else{
            System.out.println("El huesazo no me quedan pociones pociones puñeta");
        }
    }

    public void recibirDañoAventurero(Enemigo enemigo){
        vidaAventureroAhora -= enemigo.getDañoMostro();
    }

    public boolean estaCaido(){
        boolean derrotado = false;

        if (vidaAventureroAhora <= 0){
            derrotado = true;
        }
        return derrotado;
    }

    public int getCantidadPociones() {
        return cantidadPociones;
    }
    
    public int getCuracionPocion() {
        return curacionPocion;
    }

    public int getDañoAventurero() {
        return dañoAventurero;
    }

    public String getNombreAventurero() {
        return nombreAventurero;
    }

    public int getVidaAventureroAhora() {
        return vidaAventureroAhora;
    }

    public int getVidaMaximaAventurero() {
        return vidaMaximaAventurero;
    }
    
}
