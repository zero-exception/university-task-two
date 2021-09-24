/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

/*
Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Ввести произвольное слово. Найти его в строке. Если слово найдено, выдать на
консоль позицию строки, с которой это слово начинается. Если такого слова
нет, выдать сообщение об этом на консоль.
*/

public class Solution1 implements Solution {
    @Override
    public void run() {
        var scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        var str = scan.nextLine().strip();

        System.out.print("Введите слово: ");
        var search = scan.nextLine().strip();

        var indexOfSearch = str.toLowerCase().indexOf(search.toLowerCase());
        if (indexOfSearch < 0) {
            System.out.println("Указанное слово не найдено в указанной строке.");
        } else {
            System.out.printf("Индекс слова в строке: %s", indexOfSearch);
        }
    }
}
