import java.text.DecimalFormat;
import java.util.*;


public class Input implements Machine {

    public String[][] courseName=new String[12][15];
    public double[][] courseCredit=new double[12][15];
    public double[][] courseGrade=new double[12][15];
    public double creditSum=0;
    public double gradeSum=0.0;
    public double[] creditSumPerSem=new double[15];
    public double[] gradeSumPerSem=new double[15];
    public int[] courseNumber=new int[12];
    public int[] totalCreditOfSem=new int[12];
    public int semesters;
    public String name, id;

    @Override
    public void semesterNo(){
        Scanner s=new Scanner(System.in);

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter Student Name : ");   // Taking student namae & id
        name=s.nextLine();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter Student ID   : ");
        id= s.nextLine();

        System.out.println();

        System.out.print("******************************************************************************************");
        System.out.println("****************************************************************************************");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHow many semesters you have completed? : ");
        semesters=s.nextInt();

        inputAll(semesters);
    }



    @Override
    public void inputAll(int a){
        Scanner s=new Scanner(System.in);

        int c=0;

        for(int i=0; i<a; i++){

            c=i+1;
            System.out.print("-----------------------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------------------");

            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHow many courses Taken in the ");

            if(i==0){System.out.print(c+"st semester :");}
            else if(i==1) {System.out.print(c+"nd semester :");}
            else if(i==2) {System.out.print(c+"rd semester :");}
            else {System.out.print(c+"th semester :");}
            courseNumber[i]=s.nextInt();

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal credit taken in the ");

            if(i==0){System.out.print(c+"st semester      :");}
            else if(i==1) {System.out.print(c+"nd semester      :");}
            else if(i==2) {System.out.print(c+"rd semester      :");}
            else {System.out.print(c+"th semester      :");}
            totalCreditOfSem[i]=s.nextInt();

            creditSumPerSem[i]=0;
            gradeSumPerSem[i]=0;
            s.nextLine();


                for(int j=0; j<courseNumber[i]; j++){
                    int p=j+1;
                try {
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCourse " + p);
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCourse Name or Course Code :");
                    courseName[i][j] = s.nextLine();

                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCredit of the course     :");
                    courseCredit[i][j] = s.nextDouble();

                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGrade achieved           :");
                    courseGrade[i][j] = s.nextDouble();

                    s.nextLine();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                    gradeSum=gradeSum+(courseGrade[i][j] * courseCredit[i][j]);

                    gradeSumPerSem[i]=gradeSumPerSem[i]+(courseGrade[i][j] * courseCredit[i][j]);

                }
            creditSum=creditSum+totalCreditOfSem[i];
            System.out.println();
            if(i==0){System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+c+"st semester :");}
            else if(i==1) {System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+c+"nd semester :");}
            else if(i==2) {System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+c+"rd semester :");}
            else {System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+c+"th semester :");}
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t average SGPA is : " + df.format(Calculation(gradeSumPerSem[i], totalCreditOfSem[i])));


        }

        display();
    }



    @Override
    public void display() {

        Scanner s = new Scanner(System.in);
        Main m2=new Main();

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.print("\n****************************************************************************************");
        System.out.println("****************************************************************************************");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tStudent Name : "+name);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tStudent ID   : "+id);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tYour Average CGPA is : " + df.format(Calculation(gradeSum, creditSum)));



    }


    @Override
    public double Calculation(double a, double b){
        double s=0.0;
        try {
            s = a / b;
        }
        catch(Exception e){
            System.out.println(e);
        }

        return s;
    }



}
