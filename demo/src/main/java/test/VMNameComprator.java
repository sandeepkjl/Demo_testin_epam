package test;

import java.util.Comparator;

public class VMNameComprator implements Comparator<VMClass> {

    @Override
    public int compare(VMClass o1, VMClass o2) {

        String[] o1_names = o1.getName().split("_v");
        String[] o2_names = o2.getName().split("_v");



        return 0;
    }
}
