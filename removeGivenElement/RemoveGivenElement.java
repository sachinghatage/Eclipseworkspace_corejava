package removeGivenElement;

public class RemoveGivenElement {
    public static void main(String[] args) {
    int[] a={1,2,3,4,5,6};
    removeElement(a,3);
    }

    public static void removeElement(int[] a,int e){
        int[] a1=new int[a.length-1];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=e){
                a1[index]=a[i];
                index++;
            }
        }
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
    }
}