public enum Categoria {
  ACCION("Acción"),
  AVENTURAS("Aventuras"),
  ARCADE("Arcade"),
  DEPORTIVO("Deportivo"),
  ESTRATEGIA("Estrategia"),
  SIMULACION("Simulación"),
  FIGHTING("Lucha"),
  PLATAFORMAS("Plataformas"),
  CONDUCCION("Conducción"),
  TERROR("Terror"),
  RPG("Role Play Game"),
  ACTIONRPG("Action RPG"),
  MOBA("Multiplayer Online Battle Arena"),
  SINGLEPLAYER("Un solo jugador"),
  MULTIPLAYER("Varios jugadores"),
  HACKNSLASH("Hack and Slash"),
  MMO("Masive Multiplayer Online),
  MMORPG("Massive Multiplayer Online Role Play Game"),
  COOPERATIVO("Cooperativo"),
  INDIE("Indie"),
  OPENWORLD("Mundo abierto");
  
  private final String nombre;
      
  Categoria(String s){
    this.nombre = s;
  }
}
