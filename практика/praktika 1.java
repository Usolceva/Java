import java.util.Random;

public class  Main {
//приметивные типы
int i = 1; //32bit
long l; //64bit
// byte b = 8bit
// short sh =16bit

// float f = 32bit floating point
// double d = 64bit floating point

// boolean aBoolean;
// char aChar; //это буква, без знаковый хранит индекс буквы в таблице символов, если записать индекс то он покажет букву (65=а)

// //классы
// String //с большой буквы, ссылочная переменная, это класс
String s = "Hai";

public static void main(String[] args) {
    getInt(String.valueOf(12)); // getint принемает строку, но строку нам будет делать valueof из числа 12
}


static int getInt(String strToInt){
    int i = 0;
    Main.l = i;
    return Integer.parseInt(strToInt);
}


static void print(String str) {
    System.out.println(str);
}

//массив обязательно надо указать размер массива, размер массива изменить будет нельзя, но можно будет создать новый временный массив и старому массиву присвоить новый массив
static int[] arg = new int[4];
int[] temp = new int[arg.length * 2 +1]; // +1 делать не обязательно, создали новый массив и добавили индексы в массив (расширили его) либо заранее нужго делать нужного размера
arg = temp; // старый массив будет перезаписан и будут везде нули, тоесть он создаст обсалютно новый массив

// если нужно добавить в старый массив новые данные то нужно использовать цикл:
for (int i = 0; i <i.length; i++){
    temp[i] = arg[i];
} 
arg= temp; //теперь в старом масииве лежат его старые значения а длинна стала в 2 раза больше
}

// Random
Random random = new Random();
for (int i = 0; i <i.length; i++){
    temp[i] = arg[i] + random.nextInt(100);
}

//max/ min

System.out.println(Integer.max(512, 56)); // сравнивает числа и выдает максимльное

//перевод в двоичную строку
System.out.println(Integer.toBinaryString(158));
System.out.println(Integer.toBinaryString(158).length()); // lengs - это длина строки 158 = 10011110 = 8