public class ItemSistema {
   public String nomeItem;
   private String tipoItem;
   private int complexidade = 1;

   public int CalculaQtdHoras() {
      int qtdHoras = 0;

      switch (complexidade) {
         case 1:
            qtdHoras = 24;
            break;
         case 2:
            qtdHoras = 48;
            break;
         case 3:
            qtdHoras = 72;
            break;
         default:
            qtdHoras = 96;
            break;
      }
      return qtdHoras;
   }

   public String getNomeItem() {
      return nomeItem;
   }

   public void setNomeItem(String nomeItem) {
      this.nomeItem = nomeItem;
   }

   public String getTipoItem() {
      return tipoItem;
   }

   public void setTipoItem(String tipoItem) {
      this.tipoItem = tipoItem;
   }

   public int getComplexidade() {
      return complexidade;
   }

   public void setComplexidade(int complexidade) {
      this.complexidade = complexidade;
   }

}