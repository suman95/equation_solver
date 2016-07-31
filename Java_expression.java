// import javax.script.ScriptEngineManager;
// import javax.script.ScriptEngine;

// public class Java_expression {
//   public static void main(String[] args) throws Exception{
//     ScriptEngineManager mgr = new ScriptEngineManager();
//     ScriptEngine engine = mgr.getEngineByName("JavaScript");
//     String foo = "40*40+2";
//     System.out.println(engine.eval(foo));
//     } 
// }

// java program for generating points
// copyright 2016 @ suman95

import javax.script.*;
import java.util.*;

public class Java_expression {
    public static void main(String[] args) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        Map<String, Object> vars = new HashMap<String, Object>();
        // vars.put("x", 2);
        // vars.put("y", 1);
        // vars.put("z", 3);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter equation : ");
        String st = s.next();
       	System.out.println(st);
       	System.out.println("Starting to generate points :P ");
       	for(int x = 0 ; x < 1000; x++) {
       		vars.put("x",x);
       		System.out.println("@ "+x+" : "+engine.eval(st, new SimpleBindings(vars)));
       	}
    }
}