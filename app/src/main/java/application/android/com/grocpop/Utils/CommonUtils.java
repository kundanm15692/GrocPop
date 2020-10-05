package application.android.com.grocpop.Utils;

import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

public class CommonUtils {

    public static Spanned getColoredSpannableText(String text, int color, int start, int end) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(text);
        ssBuilder.setSpan(
                foregroundColorSpan,
                start,
                end,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        return ssBuilder;
    }

    public static Spanned fromHtml(String source) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return Html.fromHtml(source, Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml(source);
        }
    }
}
