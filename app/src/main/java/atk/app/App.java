/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package atk.app;

import atk.list.LinkedList;

import static atk.utilities.StringUtils.join;
import static atk.utilities.StringUtils.split;
import static atk.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
