class IncrementoDecremento{

   public static void main(String[] args) {
      int count= 0;
      count ++;
      count ++;
      //post incremento 
      // en este caso primero se imprime 2 y luego se realiza el aumento 
      System.out.println(count++);
      System.out.println(count);
      
      //pre incremento 
      // en este caso primero evalua el incrementa y luego imprime
      System.out.println(++count);
      System.out.println(count);

      count--;
      count--;
      //post decremento 
      // en este caso primero se imprime 1 y luego se realiza el decremento 
      System.out.println(count--);
      System.out.println(count);

      //pre decremento 
      // en este caso primero evalua el decremento y luego imprime
      System.out.println(--count);
      System.out.println(count);

      //simplificacion de las operaciones aritmeticas
      count +=5; 
      System.out.println(count);

      count -=5; 
      System.out.println(count);

      count *=5; 
      System.out.println(count);

      count /=5; 
      System.out.println(count);

      count %=5; 
      System.out.println(count);

   }
}