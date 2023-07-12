import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class praktika4 {
 public static void main (String[] args) { 
    // ввод данных  
Scanner input = new Scanner(System.in);
System.out.println("Введите данные пользователя одной строкой: ФИО, возраст, пол или q для выхода");
ArrayList<String> fname = new ArrayList<>();
ArrayList<String> sname = new ArrayList<>();
ArrayList<String> lname = new ArrayList<>();
ArrayList<String> age = new ArrayList<>();
ArrayList<Boolean> gender = new ArrayList<>();
ArrayList<String> id = new ArrayList<>();

while (true){
    String in = input.nextLine();
    if(in.toLowerCase().equals("q")) break;
    String[] str = in.split(" ");
    id.add(age.size());
    fname.add(str[0]); 
    sname.add(str[0]); 
    lname.add(str[0]); 
    age.add(Integer.valueOf(str[3])); 
    gender.add(str[4].toLowerCase().contains("м")); 
}
  for (int i = 0; i < fname.size()-1; i++) {
     int max = age.get(id.get(i));
     int index = i;
    for (int j = 0; j < sname.size(); j++) {
        if(age.get(id.get(j)) < max) {
            index = j;
            max = age.get(id.get(j));
        }
    }
    if (index !=i){
        int tmp = id.get(i);
        id.set(i,id.get(index));
        id.set(index,tmp);
    }
  }

System.out.println(id); // чтобы посмотреть в каком пордке стоят индексы после выборки

    for (int i=0; i<age.size(); i++) {
       System.out.println(fname.get(id.get(i))+ " "+ sname.get(id.get(i)).toUpperCase().charAt(0)+"."+ lname.get(id.get(i)).toUpperCase().charAt(0)+". "+ age.get(id.get(i)) ); 
    };

//(id.get(i))  выборка по нулевому элементу айди

}
}
Scanner.clous