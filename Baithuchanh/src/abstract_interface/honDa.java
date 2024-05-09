package abstract_interface;

/**
 * honDa
 */
public interface honDa {

    
     void phanloai();
} 
 class InnerhonDa implements honDa  {
    public void phanloai(){
        System.out.println("Xe wave 110cc");
    }
    public static void main(String[] args) {
        InnerhonDa in=new InnerhonDa();
        in.phanloai();

    }

    
}
    
    

