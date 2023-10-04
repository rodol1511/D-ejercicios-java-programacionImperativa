package programacionImperativa.ejercitacion;

public class SumaDeNumeros {
    public static void main(String[] args) {
      int num1=51;
      int num2=30;
      int resultado= num1 + num2 ;
      System.out.println("Resultado:" + resultado);

    //Suma de dos números bis: Se les solicita que guarden dos números enteros y los
    //sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
    //indique si se trata de un número par o impar.
    //El mensaje debe tener el siguiente formato:
    //“El resultado es “ {Resultado} “y es” {paridad}

        int num3=41;
        int num4=70;
        int resultado2=num3 + num4;         
        boolean paridad= (resultado2  %2)==0;
       System.out. println("Resultado:" + resultado2  + "y es:" + paridad); 
       
    }
    

}
