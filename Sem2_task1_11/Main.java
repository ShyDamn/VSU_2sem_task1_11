package Task_01_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Parameter> pars1 = Arrays.asList(new Parameter("arr","int[]"));
        Parameters par = new Parameters(pars1);

        List<Method> mets = Arrays.asList(new Method("toArray","int[]",par));

        ClassInterfaceImpl impl = new ClassInterfaceImpl("Arrays",mets);

        System.out.println(impl.generateCode());
    }
}
