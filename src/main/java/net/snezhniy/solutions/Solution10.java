/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

/*
№10. Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Подсчитать количество символов в строке (исключая пробелы).
*/

public class Solution10 implements Solution {
    @Override
    public void run() {
        var scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        var input = scan.nextLine();

        var length = input.replaceAll("\\s+", "").length();
        System.out.printf("Длина строки без пробелов: %s", length);
    }
}
