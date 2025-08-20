import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {

    public static String message(String logLine) {

        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        Pattern pattern = Pattern.compile("\\[(.*?)]");
        Matcher matcher = pattern.matcher(logLine);
        String error = "";

        if (matcher.find()) {
            error = matcher.group(1);

        }
        return error.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
