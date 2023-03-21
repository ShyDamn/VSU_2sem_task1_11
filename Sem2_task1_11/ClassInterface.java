package Task_01_16;

import java.util.List;

public interface ClassInterface {
    public String getName();
    public void setName(String name);
    public List<Method> getMethods();
    public void setMethods(List<Method> methods);
    public String generateCode();
}

