package programacionImperativa.tiposDAtos;

import javax.print.attribute.IntegerSyntax;

public class ByteShortLongAndWidth {
  public static void main(String[] args) {
    Byte.MIN_VALUE;
    Byte.MAX_VALUE;
    System.out.println("Rango del valor del byte:"+ Byte.MIN_VALUE +" "+ Byte.MAX_VALUE)
    byte minValue=-128;
    byte maxValue=127;
    //short value 16 bits- clase wrapeer
    System.out.println("Rango del valor del short:"+ Short.MIN_VALUE +" "+ Short.MAX_VALUE)
    short minValueShort=-32768;
    short maxValueShort=32767;
    //Integer value 32 bits  Clase wraper
    System.out.println("Rango del valor del integer:"+ Integer.MIN_VALUE +" "+ Integer.MAX_VALUE)
    int minValueInt=-2147483648;
    int maxValueInt=327671233313;
    // tipo long
    long valorlong=3276712313l;

    //SCREAMING_SNAKE_CASE
    //Declaracion de una constante
    final long ESTA_ES_UNA_CONSTANTE =327671233313l;
  }  
}
