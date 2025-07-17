package JavaPractice.Question21;

public class Pair<T,U> {
    T key;
    U value;
    public Pair(T key,U value){
        this.key=key;
        this.value=value;
    }
    public T getKey(){
        return this.key;
    }

    public U getValue() {
        return value;
    }

    public void setKey(T key) {
        this.key = key;
    }
    public void setValue(U value){
        this.value=value;
    }
    <T>void printFirstAndLast(T[] array){
for (int i=0;i<array.length;i++){
    if (i==0 || i==array.length-1){
        System.out.println(array[i]);
    }
}
    }
    <U extends Comparable<U>> void findMax(U a,U b,U c){
        U max=a;
        if (b.compareTo(max)>0){
            max=b;
        }if (c.compareTo(max)>0){
            max=c;
        }
        System.out.println(max+" is the maximum number");
    }
    public static void main(String[] args){
        Pair<String,Integer> pair=new Pair<String,Integer>("Ali",92);
        System.out.println("Student: "+pair.getKey()+" has "+pair.getValue()+" marks");
        String[] names={"Ali","Omer","Rafay","Danish"};
        pair.printFirstAndLast(names);
        pair.findMax(2,3,4);
        pair.findMax(22,99,1232);
    }
}
