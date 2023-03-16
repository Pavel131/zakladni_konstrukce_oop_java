public class Main {
    /**
     * Zjistí, jesli je procesor dostatečně výkoný
     */
    public static void main(String[] args) throws Exception {
       Procesor amd = new AMD("AMD Ryzen 5 7600", 5100, 6, 5200);
       try {
           amd.jeMaximalniFrekvenceRamDostatecny();
           amd.jePocetJaderDostatecny();
           amd.jeHodnotaRychlostVHzDostatecna();
           System.out.println(String.format("Procesor %s splňuje všecny požadavky", amd.getNazev()));
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}
