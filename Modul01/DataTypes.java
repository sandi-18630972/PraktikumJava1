import javax.swing.JOptionPane;

public class DataTypes{
 public static void main(String[] args){
  
  String namaDepan = "Sandi";
  String namaTengah = "Sandi";
  String namaBelakang = "Sandi";
  int usia = 26;
  int targetTahunKuliah = 4;
  double ipk = 3.89764512;
  char nilaiAbjad = 'A';
  boolean tampan = true;

  System.out.println("Nama Depan    : "+namaDepan);
  System.out.println("Nama Tengah   : "+namaTengah);
  System.out.println("Nama Belakang : "+namaBelakang);
  System.out.println("Usia          : "+usia);
  System.out.println("Target Kuliah : "+targetTahunKuliah + "tahun");
  System.out.println("IPK           : "+ipk);
  System.out.println("Nilai PBO     : "+nilaiAbjad);
  System.err.println("Tampan        : "+tampan);

  JOptionPane.showMessageDialog(null,"Hai, "+namaDepan);

 }
}