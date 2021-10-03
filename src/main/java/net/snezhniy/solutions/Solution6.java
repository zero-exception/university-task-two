/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
№6. Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Ввести слово, содержащееся в этой строке (таких слов, в общем случае, может
быть несколько). Удалить это слово в строке. Вывести на консоль исходную
строку и строку с удаленным словом (словами).
*/

public class Solution6 implements Solution {
    @Override
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        String input = scan.nextLine().trim();

        System.out.print("Введите строку для удаления: ");
        String toRemove = scan.nextLine().trim();

        String processed = Stream.of(input.split("\\s+"))
                .filter(s -> !s.equalsIgnoreCase(toRemove))
                .collect(Collectors.joining(" "));

        System.out.printf("Обработанная строка: %s\n", processed);
    }
}
