package Task_01_16;

import java.util.List;

public class Method {
    private String name;
    private String returnType;
    private List<Parameter> parameters;
    public Method(String name, String returnType, Parameters parameters) {
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters.getParameters();
    }
    public Method(String name, String returnType, List<Parameter> parameters) {
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public Method(String name, String returnType) {
        this(name,returnType, (List<Parameter>) null);
    }

    public String getName() {
        return name;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String generateCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getReturnType()).append(" ").append(getName()).append("(");
        if(parameters!=null){
            for (int i = 0; i < parameters.size(); i++) {
                Parameter param = parameters.get(i);
                sb.append(param.generateCode());
                if (i != parameters.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(");");
        return sb.toString();
    }
}
