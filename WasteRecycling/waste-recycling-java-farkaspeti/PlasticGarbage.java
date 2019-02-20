public class PlasticGarbage extends Garbage{
    private boolean isClean;

    public PlasticGarbage(String inputName, boolean isClean){
        super(inputName); //call the constructor of Garbage
        this.isClean = isClean;
    }
    public boolean isClean(){
        return isClean;
    }   

    public void clean(){
        isClean = true;
    }
}