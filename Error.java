public class Error 
{
    public static void main (String args[])
    {
    int semester = 3;
    String prodi = "Teknik Informatika";
    String matkul = "Pemrograman Berorientasi Objek";

    System.out.println("Semester : " + semester);
    System.out.println("Prodi : " + prodi);
    System.out.println("Matkul : " + matkul);
    }
}
/*
Error terjadi karena :
1. publik kelas ​Error seharusnya public class Error 
2. char​ semester = ​3​; seharusnya int semester = 3;
3. int​ prodi = ​"Sistem Informasi"​; seharusnya String prodi = "Teknik Informatika";
4. String matkul = ​'Pemrograman Berorientasi Objek'​; seharusnya String matkul = "Pemrograman Berorientasi Objek";
5. Systems.out.println(​"Semester : "​ . semester)  
   Systems.out.​println​(​"Prodi : "​ . prodi)  
   Systems.out.​println​(​"Matkul : "​ . matkul) seharusnya 
    System.out.println("Semester : " + semester);
    System.out.println("Prodi : " + prodi);
    System.out.println("Matkul : " + matkul);
*/