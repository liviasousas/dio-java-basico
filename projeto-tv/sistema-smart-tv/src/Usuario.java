public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smarttv = new SmartTv();

        System.out.println("Tv ligada ? " + smarttv.ligada);
        System.out.println("canal atual :" + smarttv.canal);
        System.out.println("volume atual :" + smarttv.volume);
         
        smarttv.ligar ();
        System.out.println(" novo status Tv ligada ? " + smarttv.ligada);

        }
    }

