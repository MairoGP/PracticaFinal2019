import java.util.ArrayList;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        List<VideoJuego> steam = new ArrayList<VideoJuego>();
        
        ArrayList<Plataforma> plataformas1 = new ArrayList<Plataforma>();
        plataformas1.add(Plataforma.XBOXONE);
        plataformas1.add(Plataforma.PS4);
        
        ArrayList<Categoria> categorias1 = new ArrayList<Categoria>();
        categorias1.add(Categoria.ACCION);
        categorias1.add(Categoria.AVENTURAS);
        categorias1.add(Categoria.MMO);

        ArrayList<Plataforma> plataformas2 = new ArrayList<Plataforma>();
        plataformas2.add(Plataforma.PS3);
        plataformas2.add(Plataforma.PC);

        ArrayList<Categoria> categorias2 = new ArrayList<Categoria>();
        categorias2.add(Categoria.RPG);
        categorias2.add(Categoria.PLATAFORMAS);
        categorias2.add(Categoria.OPENWORLD);
        
        ArrayList<Plataforma> plataformas3 = new ArrayList<Plataforma>();
        plataformas3.add(Plataforma.SWITCH);
        plataformas3.add(Plataforma.DS);

        ArrayList<Categoria> categorias3 = new ArrayList<Categoria>();
        categorias3.add(Categoria.ACTIONRPG);
        categorias3.add(Categoria.MULTIPLAYER);
        categorias3.add(Categoria.SIMULACION);
        
        ArrayList<Plataforma> plataformas4 = new ArrayList<Plataforma>();
        plataformas4.add(Plataforma.XBOX360);
        plataformas4.add(Plataforma.WIIU);

        ArrayList<Categoria> categorias1 = new ArrayList<Categoria>();
        categorias4.add(Categoria.ACCION);
        categorias4.add(Categoria.AVENTURAS);
        categorias4.add(Categoria.MMO);
        
        VideoJuego RDR2 = new VideoJuego("Red Dead Redemption 2","19/08/2005",plataformas1,Desarrolladora.ROCKSTAR,categorias1);
        VideoJuego DMC5 = new VideoJuego("Devil May Cry 5","19/08/2005",plataformas2,Desarrolladora.CAPCOM,categorias2);
        VideoJuego WOW = new VideoJuego("World of Warcraft","19/08/2005",plataformas3,Desarrolladora.BLZ,categorias3);
        VideoJuego SEKIRO = new VideoJuego("Sekiro","27/03/2019",plataformas4,Desarrolladora.ACTIVISION,categorias4);

        steam.add(RDR2);
        steam.add(DMC5);
        steam.add(WOW);
        steam.add(MMO);
        
        for (VideoJuego v
             :steam){
           System.out.println( v.toString());
        }       

    }
}
