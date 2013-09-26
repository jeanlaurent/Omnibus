public class Omnibus {

    String commands[] = {
        "OPEN","CLOSE","UP",
        "OPEN","CLOSE","UP",
        "OPEN","CLOSE","UP",
        "OPEN","CLOSE","UP",
        "OPEN","CLOSE","UP",
        "OPEN","CLOSE","DOWN",
        "OPEN","CLOSE","DOWN",
        "OPEN","CLOSE","DOWN",
        "OPEN","CLOSE","DOWN",
        "OPEN","CLOSE","DOWN"
    };

    int count = 0;

    public String next() {
        return commands[(count++)%commands.length];
    }

}
