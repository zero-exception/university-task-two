/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

/*
№6. Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Ввести слово, содержащееся в этой строке (таких слов, в общем случае, может
быть несколько). Удалить это слово в строке. Вывести на консоль исходную
строку и строку с удаленным словом (словами).
*/

public class Solution6 implements Solution {
    @Override
    public void run() {
        var scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        var input = scan.nextLine().strip();

        System.out.print("Введите строку для удаления: ");
        var toRemove = scan.nextLine().strip();

        var processed = input.replaceAll(toRemove, "").replaceAll("\\s+", " ");
        System.out.printf("Обработанная строка: %s\n", processed);
    }
}
