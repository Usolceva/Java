public class praktika 5{
    public static void main(String[] args) {

// hash это математическая функция какая-то которая принемает объект, а возвращаяет многозначный int? всегда ограничено макс. значение инта
// можент сформировать целочисленное значение вообще из любого объекта
        HashMap<Long, String> hashMap = new hashMap<>()
        Integer i;
        i.hashCode();
       // int[] ints = new int[16]; // в нутри HashMap есть массив и  по умолчанию размер 16 элементов
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i < 16; i++) {
           list.add(new Random().nextInt());
       }
       list.forEach(n -> System.out.println(Math.abs(n%16)));



hashMap.put(1, "One"); // put добавление, если мы добавляем ключ= 1 и его значение "One" и если такого ключа не было то он вернет нул(0), 
hashMap.put(1, "!"); // если ключ 1 уже есть, то он перезапишет значение но вернет старое значение "One"
hashMap.putIfAbsent(1,"@"); // он дабавить пару ключ значение только если ключа не существует, песли такой ключ есть то значение не поменяется
hashMap.putAll(new HashMap<>()); //добавляет в словарь все элементы нового словаря а можно уже созданный ранее

hashMap.get(1); //вернет значение по ключу если такого ключа нет то вернет нул
hashMap.getOrDefault(2, "Def");  // если ключ найден  то он возвращает значение, если ключ не найден он возвращаяет значение по умолчанию, удобно при выборке ключей, если какогото нет сразу выдаст что его нет

hashMap.replase(1,"@") //ищет соответствующий ключ и если нашел то заменяет значение но не создает новый элемент, похож на put

if (hashMap.containsValue("1")); //есть ли списке значение 1. возвращает истину или ложь
if (hashMap.containsKey("1")); //есть ли такой же ключ возвращает истину или ложь

hashMap.conpute(1,(k,v)-> v+= k); // изменияет значение по соотве-му ключу, начения складывает как строку не математически
hashMap.computeIfPresent(1,(k,v)-> v+= "!"+k); // меняет значение только еси находит ключ, значения складывает как строку не математически
hashMap.computeIfAbsent(key 2, v-> "thre" ); //работает только если такого ключа нет, работает как putIfAbsent
   
System.out.println(hashMap.get(2));

       for (int i = 0; i < 10; i++) {
           hashMap.put(new Random().nextInt(), Character.getName(i));
       }

       for (int i = 0; i < hashMap.size(); i++) {
                   int index = (int) hashMap.keySet().toArray()[i]; // возвращяет множество ключей из которого можно брать элементы по индексу, возвращает в виде обджекта(массива объектов)
                   System.out.println(hashMap.get(index));
               }
        
               hashMap.forEach( (k, v) -> System.out.println(k + " " + v) ); // переберает пару к/з,не удаляет, не изменяет 
        
               for (String s: hashMap.values()) { // перебирает значения, ни че не м ожем сделать т.к нет ключей, не удаляет, не изменяет
                   System.out.println(s);
               }
        
               Iterator<String> iterator = hashMap.values().iterator(); //  суть в том что проанализировать значеня и удалить не нужное
               while (iterator.hasNext()){
                   String s = iterator.next();// перебераем к/з
                   iterator.remove(); // удаляет пару к/з
                   System.out.println(s);
               }
        // задача сделать ключем слово а значение количество повторений каждого слова
                ArrayList<String> list = new ArrayList<>(List.of("One", "Two", "One", "Three", "Two", "Two","Five", "Three"));
        
               for (String s: list) {
                   if (!hashMap.containsKey(s)) hashMap.put(s, 1);
                   else hashMap.put(s, hashMap.get(s) + 1);
                   //или
                   hashMap.merge(s, 1, (vO, vN) -> vO + vN); // s ключи, старое значение =1, (v0 старое значение) + (vN новое значение) 
                               }
        
                list.forEach(s -> hashMap.merge(s, 1, (vO, vN) -> vO + vN)); // тоже самое что сверху только быстрее
        
                System.out.println(hashMap);
        
                TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder()); // сортирует в обратном порядке
        
                treeMap.put(16, "Many");
                treeMap.put(1, "One");
                treeMap.put(5, "Five");
                treeMap.put(0, "Many");
                treeMap.put(7, "One");
                treeMap.put(15, "Five");
        
                treeMap.headMap(12, true); // возвращяет отсортированные значения до 12-го значения, если тру то включая если нет то невключая
                treeMap.tailMap(12, true);// возвращает начиная с указанного ключа и до конца исходной мапы(ключ/значение)
                treeMap.subMap(2, 12);// от какого и до какого ключа может выбрать в мапе(вырежит кусочет заданного диапазона ключей)
        
       
        //treeMap.keySet сортирует всегда попорядку в вне зависимости от того как они записаны, сортирует и строки(если буквы написаны) и числа
                System.out.println(treeMap.keySet());
        
        
            }
        
        }