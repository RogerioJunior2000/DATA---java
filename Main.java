import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    


   Scanner scan = new Scanner(System.in);
   DATA data = new DATA();
   
   System.out.print("Informe o Dia: ");
   data.dia = scan.next();
  
   System.out.print("Informe o mes: ");
   data.mes = scan.next();

   System.out.print("Informe o ano: ");
   data.ano = scan.next();

  String Formatacao = data.FormatarData(data);

  System.out.print("\n" + Formatacao);

  }
}