public class gitara_tester {
    public static void main(String[] args) {
        gitara fender= new gitara();

        fender.setIlosc_strun(5);
        fender.setMarka("Fender");


        System.out.println("ilość strun: "+fender.getIlosc_strun());
        System.out.println("marka: "+fender.getMarka());

    }
}
