package pokemon_vedruna;

public abstract class Pokemon {

    private static int contador = 1;

    protected String apodo;
    protected int salud;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int nivel;
    protected final int ID;

    private Pokemon(){
        this.apodo = "DEFAULT-NICKNAME";
        this.salud = 50;
        this.ataque = 50;
        this.defensa = 50;
        this.velocidad = 50;
        this.nivel = 1;
        this.ID = contador++;
    }

    public Pokemon(String apodo, int nivel) throws DatoInvalidoException {
        this();
        validarApodo(apodo);
        validarNivel(nivel);
        this.apodo = apodo;
        this.nivel = nivel;
    }

    public Pokemon(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        this();
        validarApodo(apodo);
        validarSalud(salud);
        validarAtaque(ataque);
        validarDefensa(defensa);
        validarVelocidad(velocidad);
        validarNivel(nivel);
        this.apodo = apodo;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.nivel = nivel;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) throws DatoInvalidoException {
        validarApodo(apodo);
        this.apodo = apodo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) throws DatoInvalidoException {
        validarSalud(salud);
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) throws DatoInvalidoException {
        validarAtaque(ataque);
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) throws DatoInvalidoException {
        validarDefensa(defensa);
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) throws DatoInvalidoException {
        validarVelocidad(velocidad);
        this.velocidad = velocidad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) throws DatoInvalidoException {
        validarNivel(nivel);
        this.nivel = nivel;
    }

    public int getID() {
        return ID;
    }

    private float numeroAleatorio(){
        float[] opciones = {0.5f, 1.0f, 2.0f};
        int indice = (int) (Math.random() * opciones.length);
        float resultado = opciones[indice];
        return resultado;
    }

    public void recibirDano(int dano){
        int ataque = dano - defensa;
        if (ataque >= salud){
            salud = 0;
        }else{
            if (ataque>0){
                int res = (int) (ataque * numeroAleatorio());
                salud -= res;
            } else{
                salud -= 1;
            }
        }
    }

    public void atacar(Pokemon obj){
        obj.recibirDano(this.ataque);
    }

    public boolean equals(Object obj){
        Pokemon otro = (Pokemon) obj;
        return ID == otro.ID;
    }

    public abstract Pokemon evolucionar() throws DatoInvalidoException;

    private void validarApodo(String apodo) throws DatoInvalidoException {
        if (apodo.isEmpty() || apodo.equals(null)){
            throw new DatoInvalidoException("El apodo no puede estar vacio ni ser nulo.");
        }
    }

    private void validarSalud(int salud) throws DatoInvalidoException {
        if (salud <= 0){
            throw new DatoInvalidoException("La vida no puede ser negativa ni nula.");
        }
    }

    private void validarAtaque(int ataque) throws DatoInvalidoException {
        if (ataque <= 0){
            throw new DatoInvalidoException("El ataque no puede ser negativo ni nulo.");
        }
    }

    private void validarDefensa(int defensa) throws DatoInvalidoException {
        if (defensa <= 0){
            throw new DatoInvalidoException("La defensa no puede ser negativa ni nula.");
        }
    }

    private void validarVelocidad(int velocidad) throws DatoInvalidoException {
        if (velocidad <= 0){
            throw new DatoInvalidoException("La velocidad no puede ser negativa ni nula.");
        }
    }

    private void validarNivel(int nivel) throws DatoInvalidoException {
        if (nivel <= 0){
            throw new DatoInvalidoException("El nivel no puede ser negativo ni nulo.");
        }
    }

}
