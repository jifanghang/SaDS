/*
 * Interpreters
 */
package assignment2;

import java.util.List;

abstract class Value {}
abstract class Def {}

class StringValue extends Value {
    private String value;
}
class ValDef extends Def {
    private String name;
    private Value value;
}
class FunDef {
    private String name;
    private String argName;
    private COMM body;
}

public class Interpreters {
    /*public static List<Def> interpret(List<Def> context, COMM command) {
        
    }
    
    public static Value evaluate(List<Def>, EXPR expr) {
        Value value = new Value();
        return value;
    }*/
    
}
