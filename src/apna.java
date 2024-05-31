import java.util.Scanner;

public class apna {

public static boolean isPrime(int n){
    boolean  isPrime = true;
    for(int i = 2;i<=Math.sqrt(n);i++){

if(n%i==0){
    return false;
}

    }
    return isPrime;
}
public static void primeInRange(int n){
    for( int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.print(i+"");
        }
    }
}

public static void BinToDec(int binNum)
{
   int myNum =binNum;
    int pow = 0;
    int decNum =0;
    while(binNum>0){
int ld = binNum%10;
decNum = decNum+ (ld* (int)Math.pow(2,pow));
pow++;
binNum = binNum/10;
        System.out.println("decimal of ="+decNum);
    }
}
public static void DecToBin(int n){
    int pow = 0;
    int binNum = 0;
    while(n>0){
        int rem = n%2;
        binNum = binNum + (rem * (int)Math.pow(10,pow));
        pow++;
        n = n/2;
        System.out.println(binNum);
    }
} public static void Inverted_halfPyramid(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print("");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } System.out.println();
        }

    }
    public static void pattern(int n){
    for(int i = 1; i<=n;i++){
        for( int j= 1; j<= (n-i)+1;j++){
            System.out.print(j);
        }  System.out.println();
    }

    }
    public static void floyd(int n){
    int counter=1;
    for(int i = 1; i<=n; i++){
        for(int j = 1;j<=i ; j++){
            System.out.print(counter);
            counter++;
        }System.out.println();
    }

    }
    public static void triange(int n){
        for(int i = 1; i<=n;i++){
            for( int j= 1; j<(j-i)+1;j++){
                System.out.print(j);
            }  System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
    for(int i =1 ;i<=n;i++){
        for ( int j =1;j<=i ; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }

        }
        System.out.println();
    }
    }
    public static void update(int marks[]){
    for(int i =0;i<marks.length;i++) {
        marks[i] = marks[i] + 1;
       // System.out.println(marks[i]);
    }
    }
  public static int linear_search(int numbers[],int key){
    for ( int i = 0;i< numbers.length;i++){
        if (numbers[i]==key){
            return i;
        }
    }return -1;
  }
    public static int getLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for (int i= 0;i< numbers.length;i++){
        if(largest<numbers[i]){
            largest =numbers[i];
        }if (smallest>numbers[i]){
            smallest = numbers[i];

        }
        System.out.println("smallest value "+smallest);
    }return largest;
    }
    public static int binarySearch(int number[],int key){
    int start=0;
    int end = number.length-1;
    while(start<=end){
        int mid = (start + end)/2;
        if(number[mid]==key){
            return mid;
        }if(number[mid]<key){
            start = mid+1;
        }else{
            end = mid-1;
        }
    }
    return -1;
    }
    public static void reverse(int number[]){
    int start =0;
    int last = number.length-1;
    while(start<last){
        int temp = number[last];
        number[last]=number[start];
        number[start]=temp;
        start ++;
        last --;

    }
    }
    public static void printpair(int number[]){
    for(int i = 0;i< number.length;i++){
        int current = number[i];
        for(int j=i+1;j< number.length;j++){
            System.out.print("("+current+","+number[j]+")");

        }
    }

    }
    public static void printsubarray(int number[]){
    for(int i=0;i< number.length;i++){
        int start=i;
        for(int j=i;j< number.length;j++){
            int end = j;
            for(int k= start;k<=end;k++){
                System.out.print(number[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
        System.out.println();
    }
    public static void maxSubArraySum(int number[]){
    int cur_sum=0;
    int max_sum=Integer.MIN_VALUE;
    for(int i=0;i< number.length;i++){
        int start = i;
        for (int j=i;j<number.length;j++){
            int end=j;
            cur_sum=0;
            for(int k=start;k<=end;k++){
                cur_sum+=number[k];
            }
            System.out.println("current sum "+cur_sum);
            if(max_sum<cur_sum){
                max_sum=cur_sum;
            }
        }
    }
        System.out.println("max sum"+max_sum);
    }
    public static void kadaness(int number[]){
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i =0;i< number.length;i++){
        cs=cs+number[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);

    } System.out.println("our max number: "+ms);
    }
    public static void main(String[] arg) {
int number[]={1,-2,6,-1,3};
//int key = 2;
        kadaness(number);

    }
}