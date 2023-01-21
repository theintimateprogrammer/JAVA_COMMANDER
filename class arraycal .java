public class arraycal {

    public static void main(String[] args) {
    
    int i,j;

    int a[] = {5,10,15,20,25};
    int b[] = {11,22,33,44,55};

    int total[] = new int[10];

    
    for(i=0; i<a.length; i++){
        
        total[i] = a[i]+b[i]; 
    }

    for(i=0; i<a.length; i++){
        System.out.println("Addition = "+ total[i]);

    }
   }
}