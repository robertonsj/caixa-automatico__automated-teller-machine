package caixa;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DoubleFormatterStatic {

    // Static method to format double with default pattern
    public static String format(double value) {
        NumberFormat formatter = new DecimalFormat("#.##");
        return formatter.format(value);
    }

    // Static method to format double with custom pattern
    public static String format(double value, String pattern) {
        NumberFormat formatter = new DecimalFormat(pattern);
        return formatter.format(value);
    }

    // Static method to format double with specific locale
    public static String format(double value, Locale locale) {
        NumberFormat formatter = NumberFormat.getNumberInstance(locale);
        return formatter.format(value);
    }

    // Static method to format double with custom pattern and locale
    public static String format(double value, String pattern, Locale locale) {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        formatter.applyPattern(pattern);
        return formatter.format(value);
    }

}

