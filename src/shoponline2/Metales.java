
package shoponline2;
//juli
public enum Metales {
    ORO("oro"), PLATA("plata"), ACERO("acero");
    
    private String metal;

    private Metales(String metal) {
        this.metal = metal;
    }

    public String getMetal() {
        return metal;
    }
    
}