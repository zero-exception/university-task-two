/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

/*
№9. Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Подсчитать количество символов в строке (включая пробелы).
*/

public class Solution9 implements Solution {
    @Override
    public void run() {
        var scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        var input = scan.nextLine();

        System.out.printf("Длина строки: %s", input.length());
    }
}
