public class SelectionSort {  
    public static void selectionSort(int[] n){  
        for (int i = 0; i < n.length - 1; i++)  
        {  
            int min = i;  
            for (int j = i + 1; j < n.length; j++){  
                if (n[j] < n[min]){  
                    min = j;//searching for lowest min  
                }  
            }  
            int smallerNumber = n[min];   
            n[min] = n[i];  
            n[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] n1 = {10,9,8,7};  
        System.out.println("Before Selection Sort");  
        for(int i:n1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(n1);//sorting nay using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:n1){  
            System.out.print(i+" ");  
        }  
    }  
}