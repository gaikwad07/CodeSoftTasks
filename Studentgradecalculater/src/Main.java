
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no of subjects: ");
        int subjects=sc.nextInt();
        int arr[]=new int[subjects];

        int sum=0;
        float avg=0;

        for(int i=0;i<subjects;i++){
            System.out.println("Enter the marks subjects:" );
            arr[i]=sc.nextInt();
            System.out.println("Mark of subject " +(i+1) +" is: "+arr[i]);
            System.out.println("________________________________________");

            sum+=arr[i];

        }
        System.out.println("Total marks get ="+sum);
        avg=(sum/subjects);
        System.out.println("Student percentage is:"+avg);

        if(avg>90){
            System.out.println("Student get grade:A+");
        }

        else if(avg>=70 && avg<=90){
            System.out.println("Studdent get grade:A");


        }
        else if(avg >=60 && avg<70){
            System.out.println("Student grade is:B+");
        }
        else if(avg>=45 && avg <60){
            System.out.println("Student grade is:B");
        }
        else if(avg>=35 && avg<45){
            System.out.println("student grade is:C");
        }
        else {
            System.out.println("Student is fail");
        }



    }
}