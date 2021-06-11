package dao;

// import businessObjects.Vertragspartner;
import businessObjects.Ware;

public class Programm {
    public static void main(String[] args) throws ClassNotFoundException {
        WareDao wareDao = new WareDao();
        System.out.println("\n Eine Ware lesen:");
        Ware ware = wareDao.read("2");
        System.out.println(ware);
    }
}
