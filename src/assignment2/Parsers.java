/*
 * Parsers
 */
package assignment2;

public class Parsers {
    public static COMM parseCommand(String command) {
        COMM comm = new COMM();
        NAME name = new NAME();
        name.setString(command);
        comm.setName(name);
        
        return comm;
    }
    
    public static EXPR parseExpr(String expr) {
        EXPR expression = new EXPR();
        expression.setString(expr);
        return expression;
    }
}
