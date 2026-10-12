/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;

public abstract class f {
    public static String \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string) {
        int n10 = 0;
        char c10 = '\u0000';
        for (int i10 = 0; i10 < string.length(); ++i10) {
            char c11 = string.charAt(i10);
            if (c11 == '\'' || c11 == '\"') {
                if (c10 == '\u0000') {
                    c10 = c11;
                } else if (c10 == c11) {
                    c10 = '\u0000';
                }
            }
            if (c10 != '\u0000') continue;
            if (c11 == '(') {
                ++n10;
                continue;
            }
            if (c11 != ')') continue;
            --n10;
        }
        if (n10 != 0) {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2 = stringBuilder;
            int n11 = string.length();
            stringBuilder2(Math.abs(n10) + n11);
            stringBuilder.append(string);
            while (n10 > 0) {
                stringBuilder2.append(')');
                --n10;
            }
            while (n10 < 0) {
                stringBuilder2.insert(0, '(');
                ++n10;
            }
            return stringBuilder2.toString();
        }
        return string;
    }

    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Uri object, Bundle bundle) {
        if ((object = object.getQueryParameter("limit")) != null && !((String)object).isEmpty()) {
            bundle.putString("android:query-arg-sql-limit", (String)object);
            return;
        }
    }

    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Bundle object) {
        String string = object.getString("android:query-arg-sql-selection");
        int n10 = string != null ? string.toUpperCase(Locale.ROOT).indexOf(" GROUP BY ") : -1;
        if (n10 != -1) {
            Bundle bundle = object;
            object = string.substring(0, n10);
            object = f.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((String)object);
            string = f.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(string.substring(n10 + 10));
            bundle.putString("android:query-arg-sql-selection", (String)object);
            bundle.putString("android:query-arg-sql-group-by", string);
            return;
        }
    }

    public static void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(Bundle object) {
        String string = object.getString("android:query-arg-sql-sort-order");
        int n10 = string != null ? string.toUpperCase(Locale.ROOT).indexOf(" LIMIT ") : -1;
        if (n10 != -1) {
            Bundle bundle = object;
            object = string.substring(0, n10);
            string = string.substring(n10 + 7);
            bundle.putString("android:query-arg-sql-sort-order", (String)object);
            bundle.putString("android:query-arg-sql-limit", string);
            return;
        }
    }
}

