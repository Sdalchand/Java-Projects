public class Problem3{


public static void main(String[] args){

//using System.nanoTime(); to provide a more accurate measure

long starTime1 = System.nanoTime();

codeSnippet1();

long endTime1 = System.nanoTime();
long difference1 = endTime1 - starTime1;
System.out.println("Code Snippet 1 ran in" + " " + difference1 + " " + "ns.");

long starTime2 = System.nanoTime();

codeSnippet2();

long endTime2 = System.nanoTime();
long difference2 = endTime2 - starTime2;
System.out.println("Code Snippet 2 ran in" + " " + difference2 + " " + "ns.");

long starTime3 = System.nanoTime();
foo(10000,2);
long endTime3 = System.nanoTime();
long difference3 = endTime3 - starTime3;
System.out.println("Code Snippet 3 ran in" + " " + difference3 + " " + "ns.");

}

//Created methods for each code snippet

public static long codeSnippet1(){

 int sum = 0;
 int n = 10000000;
for ( int i = 0; i < 23; i ++){
    for ( int j = 0; j < n ; j ++)
        sum = sum + 1;
 }

 return 1;

}

public static long codeSnippet2(){

int sum = 0;
int n = 10000;
for ( int i = 0; i < n ; i ++)
    for ( int k = i ; k < n; k ++)
        sum = sum + 1;

return 1;
}

//changed this method to a static method  
//also changed the parameters and return type to long

public static long foo(long n, long k){

    if(n<=k)
        return 1;
    else
        return foo(n/k,k) + 1;

}
}
