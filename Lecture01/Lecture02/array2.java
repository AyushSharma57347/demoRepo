package Lecture01.Lecture02;

public class array2 {
    public static void display(int[] arr){

    public static void main(String[] args) {
        int n=5;
        int[] table= new int[10];
        for(int i=0;i<table.length;i++){
        table[i]=n*(i+1);
    }
    display(table);
    int m=20;
    for(int i=0;i<table.length;i++){
        if(table[i]==m)
        System.out.println(i);
    }
    
}
}
}