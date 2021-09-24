/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

/*
№4. Ввести произвольную строку. Переписать ее в обратном порядке. Выдать
на консоль исходную и переписанную строки.
*/

public class Solution4 implements Solution {
    @Override
    public void run() {
        var scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        var input = scan.nextLine().strip();

        var reversedInput = new StringBuilder(input).reverse().toString();
        System.out.printf("Перевёрнутая строка: %s\n", reversedInput);
    }
}
