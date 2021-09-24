/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.snezhniy.solutions;

import net.snezhniy.Utils;
import net.snezhniy.interfaces.Solution;

/*
№3. Ввести произвольное слово. Вывести на консоль сообщение о том,
является ли введенное слово – словом перевертышем.
*/

public class Solution3 implements Solution {
    private boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

    @Override
    public void run() {
        var scan = Utils.makeScanner();

        System.out.print("Введите строку: ");
        var input = scan.nextLine().strip();

        var msg = (isPalindrome(input)) ? "Вы указали строку-перевёртыш!" : "Вы указали самую обычную строку :(";
        System.out.println(msg);
    }
}
