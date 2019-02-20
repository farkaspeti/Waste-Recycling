public class Main {

    public static void main(String[] args) throws DustbinContentException {

    // We create the Garbages. garlic peel,
    Garbage[] garlicPeel = new Garbage[5];
    for (int i = 0; i < 5; i++) {
        garlicPeel[i] = new Garbage((i + 1) + ". garlic peel");
    }

    // Creating the Plastic/Paper Garbages
    PlasticGarbage sampooTube = new PlasticGarbage("SampooTube", false);
    PaperGarbage tissue = new PaperGarbage("tissue", false);
    PaperGarbage newsPaper = new PaperGarbage("newspaper", true);
    Dustbin dustbin = new Dustbin("Home ");
    dustbin.displaycontents();

    // Throws out the Garbages.
    for (int i = 0; i < 5; i++) {
        dustbin.throwOutGarbage(garlicPeel[i]);
    }

    dustbin.displaycontents();
    // Then she cleans the sampooTube.
    if (!sampooTube.isClean()) {
        sampooTube.clean();
    }
    // 
    if (!tissue.isSqueezed()) {
        tissue.squeeze();
    }

    // Throws out the Plastic/Paper Garbages.
    dustbin.throwOutGarbage(sampooTube);
    dustbin.throwOutGarbage(tissue);
    dustbin.throwOutGarbage(newsPaper);

    dustbin.displaycontents();
    // Empties the contents.
    dustbin.emptyContents();

    // Displaying what's in there.
    dustbin.displaycontents();
    }
}

