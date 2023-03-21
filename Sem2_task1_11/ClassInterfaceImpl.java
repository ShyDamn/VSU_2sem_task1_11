package Task_01_16;

import java.util.List;

public class ClassInterfaceImpl implements ClassInterface {
    private String name;
    private List<Method> methods;

    public ClassInterfaceImpl(String name, List<Method> methods) {
        this.name = name;
        this.methods = methods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("public interface ").append(getName()).append(" {\n");
        for (Method method : methods) {
            sb.append("\t").append(method.generateCode()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}

