package me.itzsomebody.vm.handlers;

import me.itzsomebody.vm.VM;
import me.itzsomebody.vm.datatypes.JInteger;

public class Fcmpl extends Handler {
    @Override
    public void handle(VM vm, Object[] operands) {
        float second = vm.pop().asFloat();
        float first = vm.pop().asFloat();

        if (Float.isNaN(first) || Float.isNaN(second)) {
            vm.push(new JInteger(-1));
            return;
        }

        float result = first - second;

        if (result == 0)
            vm.push(new JInteger(0));
        else if (result > 0)
            vm.push(new JInteger(1));
        else
            vm.push(new JInteger(-1));
    }
}
