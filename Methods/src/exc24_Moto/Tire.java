package exc24_Moto;

public class Tire extends Part{
    private int size;
    private int width;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    void printInfo(){
        System.out.println("Rozmiar: " + size + "ID number: " + getIdentificationNumber());
    }

}
