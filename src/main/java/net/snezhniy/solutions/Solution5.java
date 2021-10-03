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
№5. Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Ввести слово, содержащееся в этой строке (таких слов, в общем случае, может
быть несколько). Ввести слово-заменитель. Поменять в строке, все найденные
слова словом – заменителем.
*/

public class Solution5 implements Solution {
    @Override
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        String input = scan.nextLine().trim();

        System.out.print("Введите строку для замены: ");
        String toReplace = scan.nextLine().trim();

        System.out.print("Введите строку-заменитель: ");
        String replaceWith = scan.nextLine().trim();

        String processed = input.replaceAll(toReplace, replaceWith);
        System.out.printf("Обработанная строка: %s\n", processed);
    }
}
