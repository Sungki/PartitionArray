/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partitionarray;

/**
 *
 * @author cstuser
 */
public class PartitionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {43,53,12,64,15,67,87,10,6,90};
        int[] partitions = partition(nums);
        printPartitions(partitions);
    }
    
/*    public static int[] partition(int[] input) {
        int pivot = input[0];
        int j=input.length-1;
        for(int i=1; i<input.length; ++i, --j) {
            if(input[i]> pivot) {
                if(input[j]< pivot) {
                    swap(input,i, j);
                }
            }
            if(input[j]< pivot) {
                if(input[i]> pivot) {
                    swap(input,i, j);
                }
            }            
        }    
        return input;
    }*/
    
    public static int[] partition(int[] input) {
        int pivot = input[0];
        int i = 1;
        int j = input.length -1;
        while(i<=j)
        {
/*            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }*/
            for(i++; input[i]<pivot;i++);
            for(j--;input[j]>pivot; j--);
            if(i<=j)
                swap(input, i, j);
        }
        
        swap(input,0,j);
        return input;
    }

    public static void swap(int v[], int i, int j) {
        int temp;
        temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
        
    public static void printPartitions(int[] partitions){
        for(int i=0; i < partitions.length; ++i) {
            System.out.print(partitions[i] + ", ");
        }
    }
}
