public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: Canal atual? TV ligada? " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Novo status: " + smartTv.canal);

        smartTv.diminurVolume();
        smartTv.diminurVolume();
        smartTv.diminurVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status: Volume atual? " + smartTv.volume);
    }
}
