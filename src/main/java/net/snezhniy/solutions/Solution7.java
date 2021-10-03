/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
№7. Ввести строку, состоящую из нескольких слов, разделенных пробелами.
Отсортировать слова строки в порядке возрастания. Вывести отсортированные
слова на консоль.
*/

public class Solution7 implements Solution {
    @Override
    public void run() {
        Scanner scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        String input = scan.nextLine().trim();

        String sorted = Stream.of(input.split("\\s+"))
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(" "));

        System.out.printf("Отсортированная строка: %s\n", sorted);
    }
}
