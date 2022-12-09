public class Profissional {
    public String Nome;
    public double SalarioMensal;
 
    private int diasUteis = 20;
    private double fhd = 7;
 
    public double horasUteisMes = diasUteis * fhd;
 
    public double CalculaValorHora() {
       return ((SalarioMensal * 2) / horasUteisMes);
    }
 
    public String getNome() {
       return Nome;
    }
 
    public void setNome(String nome) {
       Nome = nome;
    }
 
    public double getSalarioMensal() {
       return SalarioMensal;
    }
 
    public void setSalarioMensal(double salarioMensal) {
       SalarioMensal = salarioMensal;
    }
 
    public int getDiasUteis() {
       return diasUteis;
    }
 
    public void setDiasUteis(int diasUteis) {
       this.diasUteis = diasUteis;
    }
 
    public double getFhd() {
       return fhd;
    }
 
    public void setFhd(double fhd) {
       this.fhd = fhd;
    }
 
    public double getHorasUteisMes() {
       return horasUteisMes;
    }
 
    public void setHorasUteisMes(double horasUteisMes) {
       this.horasUteisMes = horasUteisMes;
    }
 
    public void infos() {
       System.out.println("---------------------------------------");
       System.out.println("            INFORMAÇÕES                ");
       System.out.println("---------------------------------------");
       System.out.println("");
 
       System.out.println("Nome do Funcionario: " + this.getNome()
       );
       System.out.println("Valor/Hora: R$ " + this.CalculaValorHora());
 
    }    
}
   