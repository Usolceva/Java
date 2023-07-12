import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

//написать класс set своими руками не используя готовый

public class praktica 6 {

//точка входа
    public static void main(String[] args) { 
        MySet numbers = new MySet(); // экземпляр класса MySet
       for (int i = 0; i < 10; i++) {  
        numbers.add(new Random(0).nextInt(10));  // 10раз кидаем рандомные числа до 10
       }
       
       for (int i = 0; i < 10; i++) {
        System.out.println(numbers.remove(new Random(0).nextInt(10))); // удаление элемента, метод написан ниже
        }
        for (int i = 0; i < 10; i++) {
        System.out.println(numbers.contains(new Random(0).nextInt(10))); // метод написан ниже, содержится ли элемент в вашем списке
        }

        for (int i = 0; i < 100; i++) {
            numbers.addNum(new Random().nextInt(1000));
        }
  
        Iterator <Integer> iter = numbers.iterator(); // для метода итератора 
        while (iter.hasNext()) {
            int a = iter.next();
            if (a % 2 == 0){
                System.out.println(a);
            }


        System.out.println(numbers); //для метода форматирования toStrinng
    }

 // тело класса
class MySet  { //  перед скобкой можно написать: <T> чтобы ниже вместо int/ Integer можно указать любую букву стобы не писать вездп потом инт, (синтак-й сахар)

private HashMap <Integer, Object> myMap = new HashMap(); // структура хранения данных, private для того чтобы не видеть это в клиентском коде
private static final Object MYOBDJECT = new Object();  // чтобы съэкономить память, static чтобы каждый раз не создавался новый object
public void add(int i){  // метод которым добавляем HashMap
    myMap.put(i, MYOBDJECT);
}


// удаление элемента из set, если удали элемент возвращает истину, если не получилось удалить воз-ет лож, принемает параметр объект
// ссылочный объект возвращает его хеш, если в myMap такой ключ (1:январь, 2:февраль)есть то он его(ключ 1 например) удаляет и возвращает 
// хеш MYOBDJECT(январь). есль запрошенного ключа нет(3) то вернет хеш нула и напишет null 
public boolean remove(int i){
return myMap.remove(i) == MYOBDJECT;
for (int i = 0; i < 10; i++) {
System.out.println(number.remove(new Random(0).nextInt(10)));
}
}

// содержится ли элемент в вашем списке


public boolean contains(int i){
    return myMap.containsKey(i);
}

//красиввое формотирование строки как у массивов или сетов
@Override
public String toString(){
    StringBuilder str = new StringBuilder("["); //[ для того чтобы строка поняла что нужно списком делать
    Iterator <Integer> iter = myMap.keySet().iterator();
    while (iter.hasnext()) {
        str.append(iter.next() + ","); // в консоле откроется [ и через запятую будут все элементы next будет их вытаскивать из итератора пока не дойдет до конца, как только дойдет до конца выдаст фолс и выйдет из тела вайла
    }
    str.append("]");
    return str.toString();
}

//создаем метод итератора для сета
 public Iterator <Integer> iterator(){
        return myMap.keySet().iterator();
}
}
}
}

