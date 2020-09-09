/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author mfigueroa
 */
public class Operator {

    public void operate(AutomaticWeapon weapon) {
        final String className = weapon.getClass().getName();
        try {
            final Method[] methods = Class.forName(className).getMethods();
            for (final Method method : methods) {
                invokeMethod(method, weapon);
            }
        } catch (final Exception e) {
            System.err.println("Hubo un error:" + e.getMessage());
        }
    }

    private void invokeMethod(Method method, AutomaticWeapon weapon) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        final MultipleInvocation multipleInvocation = method.getAnnotation(MultipleInvocation.class);
        if (multipleInvocation != null) {
            final int timesToInvoke = multipleInvocation.timesToInvoke();
            for (int i = 0; i < timesToInvoke; i++) {
                method.invoke(weapon, (Object[]) null);
            }
        }
    }

}
