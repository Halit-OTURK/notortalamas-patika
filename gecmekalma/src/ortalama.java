import java.util.Scanner;
public class ortalama {
    public static void main(String[] args){
        int matematik,turkce,muzik,kimya,fizik;
        Scanner input = new Scanner(System.in);

        System.out.print("MATEMATİK NOTUNUZ:");
        matematik= input.nextInt();
        System.out.print("TÜRKÇE NOTUNUZ:");
        turkce= input.nextInt();
        System.out.print("MÜZİK NOTUNUZ:");
        muzik= input.nextInt();
        System.out.print("KİMYA NOTUNUZ:");
        kimya= input.nextInt();
        System.out.print("FİZİK NOTUNUZ:");
        fizik= input.nextInt();

       int avarage;
       if ((0<=matematik&&matematik<=100)&&
               (0<=turkce&&turkce<=100)&&
               (0<=muzik&&muzik<=100)&&
               (0<=kimya&&kimya<=100)&&
               (0<=fizik&&fizik<=100)){

           avarage= (matematik+turkce+muzik+kimya+fizik)/5;
         if (avarage>= 55){
            System.out.println("TEBRİKLER! SINIFI GEÇTİNİZ");}
        else {
            System.out.println("ORTALAMANIZ DÜŞÜK, KALDINIZ!");
        }
        System.out.println("ORTALAMANIZ:"+avarage);}

       else {
           System.out.println("NOTLARINIZ 0-100 ARALIĞINDA OLMALIDIR. LÜTFEN KONTROL EDİNİZ!");
       }


    }



    }

