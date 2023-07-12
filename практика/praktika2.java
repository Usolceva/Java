public class praktika2 {
    
// в java есть два типа данных приметивный(это просто число(1занятие)) и ссылочный(пишется с большой буквы(это классы, они обьединяются в библиотеки) и полностью String, Integer..)

static String string; // объект объявлен но неинициализированн, тоесть по умолчанию =0, неизменяемая строка
static StringBuilder stringBuilder; // объект объявлен но неинициализированн, тоесть по умолчанию =0, нужен для того чтобы потом строку исправить

public static void main(String[] args) {
    System.out.println(stringBuilder.charAt(0)); // обращаемся к нулевому элемену, выдаст ошибку потому что данных нет

    string = "Hello"; // двойные ковычки это сторока, одинарные это буква
    System.out.println(string);
    System.out.println(string.length()); // вернет количество символов строки 
    System.out.println(string.repeat(2)); // сколько раз повторить строку
    System.out.println("_".repeat(10)); // сколько раз повторить подчеркивание
    System.out.println(string.charAt(2)); // какя буква стоит по индексу 2 в строке
    System.out.println(string.toLowerCase(null)); // возвращает строку написанную в нижнем регистре, при этом изначальную строку он не переписывает, создает новую строку и кладет в нее новый вариант
    System.out.println(string.toUpperCase()); // новая сьрока большими буквами
    System.out.println(string.equals(string)); // для сравнения строк между собой
    System.out.println(string.equals("wo")); // для сравнения строк между собой
    System.out.println(string.contains("wo")); // возвращает истину или лож если в строке содержиться или не содержится указанный символ
    System.out.println(string.replace("l", "ru")); //меняет символы, если второй аргумент оставить пустые ковычки то заданный символ удалится, при этом изначальные данные не меняются
    System.out.println(string.indexOf("l")); // возвращает номер указанной буквы
    System.out.println(string.lastIndexOf("l")); // считает с конца
    System.out.println(string.endsWith("!")); // проверить заканчивается ли строка на конкретный символ(true/folse) 
    System.out.println(string.substring(5)); // возвращает строку по индексу от этого и индекса до конца
    System.out.println(string.substring(string.length()/2)); // возвращает строку поделенную пополам т.е от середины строки до конца
    System.out.println(string.substring(0, string.length()/2)); // возвращает с нулевого индекса(можно указать любой) и делит пополам, здесь с начала строки и поделил пополам
    System.out.println(Arrays.toString(string.split(""))); // разрезает строки по разделителю, если не указывать параметр разделителя то разделит по буквам через пробел. возвращает массив



string = stringBuilder.toString();
stringBuilder.append('!'); //добавить что-то , у стринга добавление плюсом, а здесь через аппенд, перезаписывает исходные данные и дольше программа будет работать с изменной строкой
System.out.println(stringBuilder.reverse()); // разворачивает строку, если нужно развернуть обратно нужно вызваь повторно эту команду 
System.out.println(stringBuilder.deleteCharAt(1)); // удаляет символ по индексу и перезаписывает строку
System.out.println(stringBuilder.insert(1,  "&")); // добавить символ по индексу
System.out.println(stringBuilder.replace(1, stringBuilder.indexOf("o"), "K")); //заполнить 3 параметра индекс начала замены и конца и на какой символ хотите заменить




//за сколько милисекунд считает стринг и стрингбилдер

String s = "";
StringBuilder sb = new StringBuilder("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s += Character.getName(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("String time:" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(Character.getName(i));
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start));


//дано четное число н больше 0 и символы с1. с2. написать метод который 
//вернет строку длинной н длинны н которая состоит из чередующихся символов с1 с2, начиная с1

String c1 = "a", c2 = "b";
        int n = 6;
        if (n%2 != 0 ) n--;
        System.out.println(((c1+c2).repeat(n/2)));

        String str = "aaaabbbcdd";
        String str2 = "";
        System.out.println(str);
        int cnt = 0;
        while (str.length()>0){
            str2+= String.valueOf(str.charAt(0));
            str = str.replace(String.valueOf(str2.charAt(cnt++)),"");
        }
        System.out.println(str2);

    }
}

// посчитать сколько "а и В" в мешке с камняим(aaaAbbB)
String stones = "aaaAbbbB";
int a = stones.length() - stones.replace("a", "").length();
int b = stones.length() - stones.replace("b", "").length();
System.out.printl("a" + a + "B" + b);
