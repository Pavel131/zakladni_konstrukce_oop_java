public class Procesor {
    private String Nazev;
    private Integer RychlostVMHz;
    private Integer PocetJader;
    private Integer  MaximalniFrekvenceRam;

    public Procesor(String Nazev, Integer RychlostVMHz, Integer PocetJader, Integer  MaximalniFrekvenceRam) {
        this.Nazev = Nazev;
        this.RychlostVMHz = RychlostVMHz;
        this.PocetJader = PocetJader;
        this.MaximalniFrekvenceRam = MaximalniFrekvenceRam;
    }

    public String getNazev() {
        return Nazev;
    }

    public Integer getRychlostVHz() {
        return RychlostVMHz;
    }

    public Integer getPocetJader() {
        return PocetJader;
    }

    public Integer getMaximalniFrekvenceRam() {
        return MaximalniFrekvenceRam;
    }

    public void jeHodnotaRychlostVHzDostatecna() throws Exception {
        if (getRychlostVHz() < 3000) {
            throw new Exception("Pracovní frekvence procesoru není dostatečná");
        }
    }

    public void jePocetJaderDostatecny() throws Exception {
        if (getPocetJader() < 8 ) {
            throw new Exception("Počet jader procesoru není dostatečný");
        }
    }

    public void jeMaximalniFrekvenceRamDostatecny() throws Exception {
        if (getMaximalniFrekvenceRam() <  3000) {
            throw new Exception("Frekvence ram procesoru není dostatečná");
        }
    }
}
