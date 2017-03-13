/*
 * Datatypes
 */
package assignment2;

/**
 *
 * @author Jamie
 */
public class Datatypes {
    public static void main(String[] args) {

    }
}

class COMM {
    private NAME name;
    private COMM comm;
    public NAME fun(NAME name) {
        return this.getName();
    }
    public NAME run(EXPR expr) {
        return expr.getName();
    }

    //getters & setters
    public NAME getName() {
        return name;
    }
    public void setName(NAME name) {
        this.name = name;
    }
    public COMM getComm() {
        return comm;
    }
    public void setComm(COMM comm) {
        this.comm = comm;
    }
}

class EXPR {
    private NAME name;
    private String string;

    //getters and setters
    public NAME getName() {
        return name;
    }
    public void setName(NAME name) {
        this.name = name;
    }
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
}

class NAME {
    private String string;

    //getters and setters
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
}
