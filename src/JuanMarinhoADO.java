import javax.swing.JOptionPane;

public class JuanMarinhoADO {
    public static void main(String[] args) {

        jaguar animal = new jaguar();

        animal.setNome("Wakanda");
        animal.setCor("Preto");

        JOptionPane.showMessageDialog(null, "Nome: " + animal.getNome()+ ", Cor: " +animal.getCor());

        jaguar jag = new jaguar("Wakanda");

        JOptionPane.showMessageDialog(null,"Nome: "+ jag.getNome());

        jaguar jag2 = new jaguar("Forever", 2.40);

        JOptionPane.showMessageDialog(null,"Nome: "+ jag2.getNome()+  ", Tamanho: "+ jag2.getTamanho()+ "m");

        animal.acelerarTerra();

        JOptionPane.showMessageDialog(null,"Velocidade em Terra: " +animal.getVelocidadeTerra() + "km");
    }
}
