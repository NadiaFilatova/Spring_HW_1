package HW_2.Task_2_3_4;

import java.util.*;
import java.util.List;

public class Chemistry implements Chemistry_Interface {
    private  final String formula;
    private int molarMass;
    private List<String> properties;

    public Chemistry(String formula) {
        this.formula = formula;
    }

    public void setMolarMass(int molarMass) {
        this.molarMass = molarMass;
    }

    public void init() {
        properties = new ArrayList<>();
        properties.add("physical properties");
        properties.add("chemistry properties");
    }

    public String getFormula() {
        return formula;
    }

    public int getMolarMass() {
        return molarMass;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }
    @Override
    public String toString() {
        return "Chemistry{" +
                "elementName='" + formula + '\'' +
                ", atomicNumber=" + molarMass +
                ", properties=" + properties +
                '}';
    }
}

