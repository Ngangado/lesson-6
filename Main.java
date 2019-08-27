package k003;


//import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       input n=new add();
       n.addBook();
    }

}
class input{
     int id;
      String name;
      String author;
      String nxb;
      String major;
      int number;

    public void inputBook(){
        Scanner scan=new Scanner(System.in);
        System.out.print("nhap ma sach :");
         id=scan.nextInt();
        scan.nextLine();

        System.out.print(" ten sach:  ");
         name=scan.nextLine();

        System.out.println("Tac gia: ");
         author=scan.nextLine();

        System.out.println("Nha xuat ban: ");
         nxb=scan.nextLine();

        System.out.println("chuyen nganh : ");
         major = scan.nextLine();

        System.out.print(" so trang : ");
          number = scan.nextInt();

    }
    public void xuat(){

        System.out.println("Mã sách : "+id + "\n" +"Tên sách: "+ name + "\n" +"Tác giả: "+
                author + "\n" +"Nhà xuất bản: " +nxb
                + "\n" +"Chuyên ngành: "+major+"\n"+"Số trang: "+ number);
    }

    public void addBook() {
    }
}
class add extends input{
    public void addBook(){
        System.out.println("1.Công nghệ thông tin");
        System.out.println("2.Khoa học - Đời sống");
        System.out.println("3.Văn hóa - Nghệ thuật");
        System.out.println("Bạn chọn?");

        Scanner scan=new Scanner(System.in);
        int select=scan.nextInt();
        switch (select){
            case 1:
                System.out.println("Sách CNTT");
                inputBook();
                System.out.println("\n=============================\n");
                xuat();
                break;
            case 2:
                System.out.println("Sach Khoa học - Đời sống");
                inputBook();
                System.out.println("\n=============================\n");
                xuat();
                break;
            case 3:
                System.out.println("Sach Văn hóa - Nghệ thuật");
                inputBook();
                System.out.println("\n=============================\n");
                xuat();
                break;
        }
    }



}
