// Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

package DZ;
import java.util.Random;

public class tasc1 {
public static void main(String[] args){
// Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    int i = new Random().nextInt(2001);
    System.out.println(i);
//Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

    int n = Integer.toBinaryString(i).length();
    System.out.println("Выпавшее число " + i + " в двоичном представлении =  "+ Integer.toBinaryString(i) +
     " номер старшего значащего бита выпавшего числа = "+ n);

// бежим  по диапазону и считатем количество "попаданий"
     short count = 0;
     for (int j = i; j < Short.MAX_VALUE; j++){
         if ( j % n == 0) {
             count++;
         }
     }
     System.out.println("длина массива m1 =  "+ count); 
     int[] m1 = new int [count];
     count = 0;
//заполняем       
     for (int j = i; j < Short.MAX_VALUE; j++){
         if (j % n == 0) {
             m1[count++] = j;
             System.out.println(m1);
             }
     } 

     count = 0;
     //второй массив;
     for (int j = Short.MIN_VALUE; j < i; j++){
         if ( j % n != 0) {
             count++;
         }
     }
     System.out.println("длина массива m2 =  "+ count); 
     int[] m2 = new int [count];
     count = 0;
             
     for (int j = Short.MIN_VALUE; j < i; j++){
         if (j % n != 0) {
             m2[count++] = j;
             }
     }
     }
    }