public class DATA
{
   public String dia;
   public String mes;
   public String ano;

    public String FormatarData (DATA dat)
    {
       DataTeste dt = new DataTeste();

      String dtFormatada = dt.FormatarData(dat);
      return dtFormatada;
    }

}


