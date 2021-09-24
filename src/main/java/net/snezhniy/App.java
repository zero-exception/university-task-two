/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy;

import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        var selectedSolution = (args.length >= 1) ? args[0] : "1";
        var classPath = "net.snezhniy.solutions.Solution" + selectedSolution;

        Class<?> cls;
        try {
            cls = Class.forName(classPath);
        } catch (ClassNotFoundException e) {
            System.out.printf("Вы указали некорректный номер задания, класс %s не найден.\n", classPath);
            return;
        }

        var obj = cls.getDeclaredConstructor().newInstance();
        var argTypes = new Class[]{};
        var run = cls.getDeclaredMethod("run", argTypes);
        run.invoke(obj);
    }
}
