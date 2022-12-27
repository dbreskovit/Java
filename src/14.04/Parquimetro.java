import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Parquimetro {

   private String entrada, saida, data;
   private SimpleDateFormat formatoData;
   private SimpleDateFormat formatoHora;
   private GregorianCalendar calendario;
   private Local local;
   private Veiculo veiculo;
   private Moeda moeda;

   Parquimetro() throws InterruptedException 
   {
      local = new Local("Santo Augusto", "Centro");
      veiculo = new Veiculo();
      moeda = new Moeda();
      calcTempo(moeda.getValorf());
      printTicket();
      showTicket();
   }

   public void printTicket() {
      try {
         FileWriter fw = new FileWriter("imprimir/ticket.txt");
         try (PrintWriter pw = new PrintWriter(fw)) {
            pw.println("·······························");
            pw.println("  Prefeitura de " + local.getCidade());
            pw.println("   Sistema Mun. de Trânsito ");
            pw.println("   Ticket de Estacionamento ");
            pw.println("·······························");
            pw.println(" Zona: " + local.getZona());
            pw.println(" Data: " + Parquimetro.this.getData());
            pw.println(" Veiculo: " + veiculo.getPlaca());
            pw.println("·······························");
            pw.println(" Entrada: " + Parquimetro.this.getEntrada());
            pw.println(" Saida: " + Parquimetro.this.getSaida());
            pw.println("·······························");
            pw.printf(" Valor do Bilhete: R$ %.2f\n", moeda.getValorf());
            pw.println("·······························");
            pw.flush();
            pw.close();
            fw.close();
         }
      } catch (IOException ex) {}
   }

   public void showTicket() {
      System.out.println("·······························");
      System.out.println("  Prefeitura de " + local.getCidade());
      System.out.println("   Sistema Mun. de Trânsito ");
      System.out.println("   Ticket de Estacionamento ");
      System.out.println("·······························");
      System.out.println(" Zona: " + local.getZona());
      System.out.println(" Data: " + Parquimetro.this.getData());
      System.out.println(" Veiculo: " + veiculo.getPlaca());
      System.out.println("·······························");
      System.out.println(" Entrada: " + Parquimetro.this.getEntrada());
      System.out.println(" Saida: " + Parquimetro.this.getSaida());
      System.out.println("·······························");
      System.out.printf(" Valor do Bilhete: R$ %.2f\n", moeda.getValorf());
      System.out.println("·······························");
   }

   public void calcTempo(double v) {
      setFormatoData(new SimpleDateFormat("dd/MM/yyyy"));
      setFormatoHora(new SimpleDateFormat("HH:mm"));
      setCalendario(new GregorianCalendar());

      getCalendario().setTime(new Date());

      setData(getFormatoData().format(calendario.getTime()));
      setEntrada(getFormatoHora().format(calendario.getTime()));

      if (v == 0.5) {
         getCalendario().add(java.util.Calendar.MINUTE, 30);
         setSaida(getFormatoHora().format(calendario.getTime()));
      }

      else if (v == 1.0) {
         getCalendario().add(java.util.Calendar.MINUTE, 60);
         setSaida(getFormatoHora().format(calendario.getTime()));
      }

      else if (v == 1.50) {
         getCalendario().add(java.util.Calendar.MINUTE, 90);
         setSaida(getFormatoHora().format(calendario.getTime()));
      }

      else if (v == 2) {
         getCalendario().add(java.util.Calendar.MINUTE, 120);
         setSaida(getFormatoHora().format(calendario.getTime()));
      }
   }

   public String getEntrada() {
      return entrada;
   }

   public void setEntrada(String entrada) {
      this.entrada = entrada;
   }

   public String getSaida() {
      return saida;
   }

   public void setSaida(String saida) {
      this.saida = saida;
   }

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   public SimpleDateFormat getFormatoData() {
      return formatoData;
   }

   public void setFormatoData(SimpleDateFormat formatoData) {
      this.formatoData = formatoData;
   }

   public SimpleDateFormat getFormatoHora() {
      return formatoHora;
   }

   public void setFormatoHora(SimpleDateFormat formatoHora) {
      this.formatoHora = formatoHora;
   }

   public GregorianCalendar getCalendario() {
      return calendario;
   }

   public void setCalendario(GregorianCalendar calendario) {
      this.calendario = calendario;
   }

}