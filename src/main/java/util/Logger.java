package util;

import java.util.Date;

/**
 * Created by Gavinlu on 2018/3/13.
 */

public class Logger{

    public static void logging(Level level, String context) {
        if (level.equals(Level.INFO)) {
            System.out.println(new Date().toLocaleString() + " " + context);
        }
        if (level.equals(Level.DEBUGE)) {
            System.err.println(new Date() + " " + context);
        }
    }

}
