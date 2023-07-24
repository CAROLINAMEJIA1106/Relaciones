package EntidadRevolver;

import java.util.Objects;

public class RevolverDeAgua {

    private Integer posicionActual;

    private Integer posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    

    public void llenarRevolver() {
        int pa, paa;
        pa = (int)(Math.floor(Math.random()*(6-1+1)+1));//genero random de posicion actual
        Integer p = pa;
        this.posicionActual = p;
        //(int)(Math.random()*(X-Y+1)+Y
        //int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));
        //M es menor
        paa = (int)(Math.floor(Math.random()*(6-1+1)+1));//genero random de posicion de agua
        Integer aux = paa;
        this.posicionAgua = aux;
    }

    public boolean mojar() {
        
        if(this.posicionActual.equals(this.posicionAgua)){
            return true;
        }else{
            return false;
        }
        
    }

    public void siguienteChorro() {
        if(this.posicionActual == 6){
            this.posicionActual = 1;
                    
        }else{
            this.posicionActual +=1;
        }
        
        
    }

    
}
