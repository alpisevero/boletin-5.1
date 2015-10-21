package boletin5;
public class coche {
     private int velocidad ;
     
    //constructores
     
public coche(){
    velocidad=0;

    
    }

//puntos de acceso

public int getvelocidad(){
    return velocidad ;
}
public void acelerar (int valor){
velocidad+=valor;
}
public void frenar (int menos){
velocidad-=menos;    
}

}

