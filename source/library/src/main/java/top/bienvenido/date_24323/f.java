package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/f.class */
public abstract class f {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static String m138(String str) {
        int i = 0;
        char c = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\'' || cCharAt == '\"') {
                if (c == 0) {
                    c = cCharAt;
                } else if (c == cCharAt) {
                    c = 0;
                }
            }
            if (c == 0) {
                if (cCharAt == '(') {
                    i++;
                } else if (cCharAt == ')') {
                    i--;
                }
            }
        }
        if (i == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(Math.abs(i) + str.length());
        sb.append(str);
        while (i > 0) {
            sb.append(')');
            i--;
        }
        while (i < 0) {
            sb.insert(0, '(');
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m141(Bundle bundle) {
        String string = bundle.getString("android:query-arg-sql-sort-order");
        int iIndexOf = string != null ? string.toUpperCase(Locale.ROOT).indexOf(" LIMIT ") : -1;
        if (iIndexOf != -1) {
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 7);
            bundle.putString("android:query-arg-sql-sort-order", strSubstring);
            bundle.putString("android:query-arg-sql-limit", strSubstring2);
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m139(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("limit");
        if (queryParameter == null || queryParameter.isEmpty()) {
            return;
        }
        bundle.putString("android:query-arg-sql-limit", queryParameter);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m140(Bundle bundle) {
        String string = bundle.getString("android:query-arg-sql-selection");
        int iIndexOf = string != null ? string.toUpperCase(Locale.ROOT).indexOf(" GROUP BY ") : -1;
        if (iIndexOf != -1) {
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 10);
            String strM138 = m138(strSubstring);
            String strM139 = m138(strSubstring2);
            bundle.putString("android:query-arg-sql-selection", strM138);
            bundle.putString("android:query-arg-sql-group-by", strM139);
        }
    }
}
