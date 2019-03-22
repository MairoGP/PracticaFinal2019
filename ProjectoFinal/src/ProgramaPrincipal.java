import java.util.ArrayList;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        ArrayList<Plataforma> plataformas1 = new ArrayList<Plataforma>();
        plataformas1.add(Plataforma.XBOXONE);
        plataformas1.add(Plataforma.PS4);

        ArrayList<Plataforma> plataformas2 = new ArrayList<Plataforma>();
        plataformas2.add(Plataforma.PS3);
        plataformas2.add(Plataforma.PC);

        ArrayList<Plataforma> plataformas3 = new ArrayList<Plataforma>();
        plataformas3.add(Plataforma.SWITCH);
        plataformas3.add(Plataforma.DS);

        ArrayList<Plataforma> plataformas4 = new ArrayList<Plataforma>();
        plataformas4.add(Plataforma.XBOX360);
        plataformas4.add(Plataforma.WIIU);

        VideoJuego RDR2 = new VideoJuego("Red Dead Redemption 2","19/08/2005",plataformas1,Desarrolladora.ROCKSTAR);
        VideoJuego DMC5 = new VideoJuego("Red Dead Redemption 2","19/08/2005",plataformas1,Desarrolladora.CAPCOM);
        VideoJuego WOW = new VideoJuego("Red Dead Redemption 2","19/08/2005",plataformas1,Desarrolladora.BLZ);
        VideoJuego SEKIRO = new VideoJuego("Red Dead Redemption 2","19/08/2005",plataformas1,Desarrolladora.ACTIVISION);



        

    }
}
