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
Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Ввести произвольное слово. Найти его в строке. Если слово найдено, выдать на
консоль позицию строки, с которой это слово начинается. Если такого слова
нет, выдать сообщение об этом на консоль.
*/

public class Solution1 implements Solution {
    @Override
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        String str = scan.nextLine().trim();

        System.out.print("Введите слово: ");
        String search = scan.nextLine().trim();

        int indexOfSearch = str.toLowerCase().indexOf(search.toLowerCase());
        if (indexOfSearch < 0) {
            System.out.println("Указанное слово не найдено в указанной строке.");
        } else {
            System.out.printf("Индекс слова в строке: %s\n", indexOfSearch);
        }
    }
}
