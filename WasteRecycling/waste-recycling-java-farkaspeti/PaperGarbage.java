public class PaperGarbage extends Garbage{
    private boolean isSqueezed;

    public PaperGarbage(String inputName, boolean isSqueezed){
        super(inputName); //call the constructor of Garbage
        this.isSqueezed = isSqueezed;
    }
    public boolean isSqueezed(){
        return isSqueezed;
    }
    public void squeeze(){
        isSqueezed = true;
    }
}
