import java.util.Scanner;
public class mars {
    public static void main (String args[]){
        Scanner monkey = new Scanner(System.in);
        int source=0;
        System.out.println("how long has katseyes bin a group");
        if(monkey.nextLine().equals("1year")){
            source=1;
            System.out.println("you got it corret");
        }else{System.out.println("you got it incorret");}
        System.out.println("who is beater manon or lara");
        if(monkey.nextLine().equals("lara")){
            source+=1;
            System.out.println("you got it corret");

        }else{System.out.println("you got it incorret");
        }
        System.out.println("how is lara");
        if(monkey.nextLine().equals("A god")){
            System.out.println("you got it corret"); source+=1;
        }else{System.out.println("you got it incorret");} 
        System.out.println(source);
        /* 
        int mars =67;
        mars=mars-60;
        if(mars>=5){
           
          System.out.println("fly "+"onepice");     
        }
        System.out.println(monkey.nextLine());
        String fat=monkey.nextLine();
        System.out.println("fat="+fat);
        if(fat.equals("sumword")){
            System.out.println("love");
        }
        System.out.println("fun "+mars);*/
    }
}