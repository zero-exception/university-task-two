/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

import java.util.Scanner;

/*
#2 Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Подсчитать количество слов в строке.
*/

public class Solution2 implements Solution {
    @Override
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.print("Введите слово: ");
        String input = scan.nextLine().trim();
        int wordsCount = input.split("\\s+").length;

        System.out.printf("Количество слов: %s\n", wordsCount);
    }
}
