public class Dustbin{
    String color;
    PaperGarbage[] paperContent;
    PaperGarbage[] tempPaperContent;
    PlasticGarbage[] plasticContent;
    PlasticGarbage[] tempPlasticContent;
    Garbage[] houseWasteContent;
    Garbage[] tempHouseWasteContent;

    public Dustbin(){
        this.paperContent = new PaperGarbage[0];
        this.tempPaperContent = new PaperGarbage[0];
        this.plasticContent = new PlasticGarbage[0];
        this.tempPlasticContent = new PlasticGarbage[0];
        this.houseWasteContent = new Garbage[0];
        this.tempHouseWasteContent = new Garbage[0];
    }
    public Dustbin(String color){
        this.paperContent = new PaperGarbage[0];
        this.tempPaperContent = new PaperGarbage[0];
        this.plasticContent = new PlasticGarbage[0];
        this.tempPlasticContent = new PlasticGarbage[0];
        this.houseWasteContent = new Garbage[0];
        this.tempHouseWasteContent = new Garbage[0];
        this.color = color;
    }
    
    public void displaycontents(){
        System.out.println(color + "Dustbin!\n");
        System.out.println("House waste content: " + houseWasteContent.length +" item(s)\n");
            for (Garbage element : houseWasteContent) {
                System.out.println("\t" + element.getName() + "\n");
            }
 
        System.out.println("Paper content: " + paperContent.length +" item(s)\n");
            for (PaperGarbage element : paperContent) {
                System.out.println("\t" + element.getName() + "\n");
            }

        System.out.println("Plastic content: " + plasticContent.length +" item(s)\n");
            for (PlasticGarbage element : plasticContent) {
                System.out.println("\t" + element.getName() + "\n");
            }
        }

    public PaperGarbage[] getPaperContent(){
        return paperContent;
    }

    public PlasticGarbage[] getPlasticContent(){
        return plasticContent;
    }

    public Garbage[] getHouseWasteContent(){
        return houseWasteContent;
    }

    public void throwOutGarbage(Garbage garbage) throws DustbinContentException{
        if (garbage instanceof PlasticGarbage){
            int currentSize = 0;
            int newSize = 0;
            PlasticGarbage pGarbage = (PlasticGarbage) garbage;
            if (pGarbage.isClean() == true){
                currentSize = plasticContent.length;
                newSize = currentSize + 1;
                tempPlasticContent = new PlasticGarbage[newSize];
                System.arraycopy(plasticContent, 0, tempPlasticContent, 0, currentSize);
                tempPlasticContent[newSize-1] = pGarbage;
                plasticContent = tempPlasticContent;   
            }
             
        }

        else if(garbage instanceof PaperGarbage){
            PaperGarbage paGarbage = (PaperGarbage) garbage;
            int newSize = 0;
            int currentSize = 0;
            if (paGarbage.isSqueezed() == true){
                currentSize = paperContent.length;
                newSize = currentSize + 1;
                tempPaperContent = new PaperGarbage[newSize];
                System.arraycopy(paperContent, 0, tempPaperContent, 0, currentSize);
                tempPaperContent[newSize-1] = paGarbage;
                paperContent = tempPaperContent;    
            }
            
        }

        else if(!(garbage instanceof PaperGarbage || garbage instanceof PlasticGarbage)){
            int currentSize = houseWasteContent.length;
            int newSize = currentSize +1;
            tempHouseWasteContent = new Garbage[newSize];
            System.arraycopy(houseWasteContent, 0, tempHouseWasteContent, 0, currentSize);
            tempHouseWasteContent[newSize-1] = garbage;
            houseWasteContent = tempHouseWasteContent;
        }

        else{
            throw new DustbinContentException();
        }
    }
    public void emptyContents(){
        this.paperContent = new PaperGarbage[0];
        this.plasticContent = new PlasticGarbage[0];
        this.houseWasteContent = new Garbage[0];
    }
}
