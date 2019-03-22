import sun.security.krb5.internal.crypto.Des;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VideoJuego {
    private final String titulo;
    private Desarrolladora desarrolladora;
    private final String fechaLanzamiento;
    private List<Plataforma> plataformas;
    private List<Categoria> categorias;

    public VideoJuego(String titulo, String fechaLanzamiento, ArrayList<Plataforma> plataformas, Desarrolladora desarrolladora) {
        this.titulo = titulo;
        this.desarrolladora = desarrolladora;
        this.fechaLanzamiento = fechaLanzamiento;
        this.plataformas = plataformas;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setDesarrolladora(){
        this.desarrolladora = establecesDesarroladora();
    }

    public void setPlataformas(){
        this.plataformas = establecerPlataformas();
    }

    public static ArrayList<Plataforma> establecerPlataformas() {
        ArrayList<Plataforma> plataformas = new ArrayList<>();
        Plataforma respuesta;
        String titulo="Plataformas";
        String mensaje="Introduce una plataforma";
        do{
            respuesta = (Plataforma) JOptionPane.showInputDialog(null,
                    mensaje,
                    titulo,
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    null,
                    Plataforma.values(),
                    Plataforma.values()[0]);
            if(respuesta==null){
                break;
            } else {
                plataformas.add(respuesta);
            }
        }while(respuesta!=null);
        return plataformas;
    }

    public static Desarrolladora establecesDesarroladora(){
        Desarrolladora respuesta;
        String titulo="Desarrolladora";
        String mensaje="Introduce una Desarroladora: ";
        do {
            respuesta = (Desarrolladora) JOptionPane.showInputDialog(null,
                    mensaje,
                    titulo,
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    null,
                    Plataforma.values(),
                    Plataforma.values()[0]);
        }while(respuesta!=null);
        return respuesta;
    }
}
