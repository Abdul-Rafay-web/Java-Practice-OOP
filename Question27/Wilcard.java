package JavaPractice.Question27;

import JavaPractice.Q8.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Repository<T>{
private ArrayList<T> items=new ArrayList<>();

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public ArrayList<T> getItems() {
        return items;
    }
    public void deleteItems(T item){
        items.remove(item);
    }
    public void copyList(ArrayList<? super T>destination, ArrayList<? extends T>src){
        destination.addAll(src);
        System.out.println("New ArrayList: "+destination);
    }
    public void countMatches(List<? extends T>array,Object item){
        int count=0;
        for (T t:array){
            if (t.equals(item)){
                count++;
            }
        }
        System.out.println("The total times "+item+" is in List is: "+count);
    }
public static void main(String[] args){
        Repository<Integer> repository=new Repository<>();
        ArrayList<Integer> nums=new ArrayList<>();
        ArrayList<Integer> src=new ArrayList<>();
        src.add(1);
        src.add(2);
        src.add(3);
        repository.countMatches(Arrays.asList(1,2,34,3,3),3);
}
}
