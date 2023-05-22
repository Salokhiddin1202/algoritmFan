import java.util.*;

public class Dars {
    public static void main(String[] args) {
        Integer array[]={9,5,1,6,7,8,2,3,10,45};
        List<Integer> list=Arrays.asList(array);
        var newlist=list.stream()
                .sorted((a,b)->a<b?1:-1).
                toList();
        System.out.println(newlist.toString());


        /*for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if (array[i]<array[j]){
                   // System.out.println(i);
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }
            }
        }*/
    }
}
