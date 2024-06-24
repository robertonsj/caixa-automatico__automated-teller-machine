package caixa;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DoubleFormatter {
    
    private NumberFormat formatter;

    // Constructor for default format
    public DoubleFormatter() {
        this.formatter = new DecimalFormat("#.##");
    }

    // Constructor with custom pattern
    public DoubleFormatter(String pattern) {
        this.formatter = new DecimalFormat(pattern);
    }

    // Constructor with Locale
    public DoubleFormatter(Locale locale) {
        this.formatter = NumberFormat.getNumberInstance(locale);
    }

    // Method to format double value
    public String format(double value) {
        return formatter.format(value);
    }

    // Method to set custom pattern
    public void setPattern(String pattern) {
        if (formatter instanceof DecimalFormat) {
            ((DecimalFormat) formatter).applyPattern(pattern);
        } else {
            throw new UnsupportedOperationException("Current formatter does not support patterns.");
        }
    }

    // Method to set Locale
    public void setLocale(Locale locale) {
        this.formatter = NumberFormat.getNumberInstance(locale);
    }

    public static void main(String[] args) {
        DoubleFormatter formatterDefault = new DoubleFormatter();
        System.out.println("Default format: " + formatterDefault.format(12345.6789));

        DoubleFormatter formatterCustomPattern = new DoubleFormatter("#.####");
        System.out.println("Custom pattern format: " + formatterCustomPattern.format(12345.6789));

        DoubleFormatter formatterLocale = new DoubleFormatter(Locale.GERMANY);
        System.out.println("Locale format (Germany): " + formatterLocale.format(12345.6789));

        // Changing pattern dynamically
        formatterCustomPattern.setPattern("###,###.00");
        System.out.println("Custom pattern format with grouping: " + formatterCustomPattern.format(12345.6789));

        // Changing locale dynamically
        formatterDefault.setLocale(Locale.JAPAN);
        System.out.println("Default format with Japanese locale: " + formatterDefault.format(12345.6789));
    }
}

