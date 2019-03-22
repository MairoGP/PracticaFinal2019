public enum Desarrolladora {
    EA("Electronic Arts"),
    NINTENDO("Nintendo"),
    ACTIVISION("Activision"),
    SONY("Sony Computer Entertaiment"),
    MICROSOFT("Microsoft Game Studios"),
    UBISOFT("Ubisoft"),
    BETHESDA("Bethesda"),
    KONAMI("Konami"),
    CAPCOM("Campcom"),
    ROCKSTAR("RockStar"),
    BLZ("Blizzard");

    private final String nombre;

    Desarrolladora(String s) {
        this.nombre = s;
    }
    public String getNombre(){
        return nombre;
    }
}
