package data;

public abstract class PenerbanganService { //class abstract sebagai parent class

    protected String fileName;
    public PenerbanganService(String fileName){
        this.fileName = fileName;
    }

    public abstract void create(String data); // abstract method create
    public abstract void read(); // abstract method read
    public abstract void update(int lineNumber, String newData); // abstract method update
    public abstract void delete(int lineNumber); // abstract method delete

}
