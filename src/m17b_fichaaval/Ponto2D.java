package m17b_fichaaval;

/**
 * Classe Ponto2D, para instanciar objectos-Ponto2D
 * @version 1.2, 06.fev.2018
 * @author a16972 & a19350
 */

public class Ponto2D {
    /** Posição no eixo X */
    private int x;
    /** Posição no eixo Y*/
    private int y;
    
    /**
    * Construtor sem parâmetros, que inicializa os atributos
    * com valores predefinidos conhecidos.
    */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }   
    
    /**
    * Construtor da classe parametrizado com todos os atributos.
    * @param x Valor de X do Ponto2D
    * @param y Valor de Y do Ponto2D
    */
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    /**
    * 
    * @return um número contendo o valor de X do Ponto2D
    */
    
    public int getX() {
        return x;
    }
    
    /**
    * 
    * @return um número contendo o valor de Y do Ponto2D
    */

    public int getY() {
        return y;
    }

    /**
    * Setter do parametro X.
    * @param x Valor de X do Ponto2D
    */
    
    public void setX(int x) {
        this.x = x;
    }

    /**
    * Setter do parametro Y.
    * @param y Valor de X do Ponto2D
    */
    
    public void setY(int y) {
        this.y = y;
    }
    
    /**
    * 
    * @return o valor da distancia entre os dois pontos (Ponto2D).
    */
    
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }

    /**
    * 
    * @return uma string composta pelos atributos da classe.
    */
    
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
