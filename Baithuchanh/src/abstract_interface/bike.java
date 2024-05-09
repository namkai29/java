package abstract_interface;

 abstract  class bike {
    abstract void inThongSo();

    

class honda extends bike{
    void inThongSo(){
        System.out.println("Xe honda vision 110cc");
    }
}

    public static void main(String[] args) {
        bike bi=new honDa();
        bi.inThongSo();
    }

 }

