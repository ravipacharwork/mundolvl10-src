/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.AdaptiveIconDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.TypedValue
 *  kotlin.Triple
 */
package top.bienvenido.date_24323;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.invoke.LambdaMetafactory;
import java.lang.reflect.Method;
import kotlin.Triple;
import top.bienvenido.date_24323.a6;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.n9;
import top.bienvenido.date_24323.q2;
import top.bienvenido.date_24323.r5;
import top.bienvenido.date_24323.u2;
import top.bienvenido.date_24323.x4;
import top.bienvenido.date_24323.\u4f60\u771f\u662f\u5f31\u667a\u5f97\u6070\u5230\u597d\u5904\u6b63\u5982\u4f60\u9ed1\u4eba\u91ce\u7239\u64cd\u4f60\u5988\u7684\u65f6\u5019\u4f60\u5988\u9ad8\u6f6e\u53eb\u5f97\u97f3\u5f8b\u5341\u8db3;
import top.bienvenido.date_24323.\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1;

public abstract class b6 {
    public static n9 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    public static final u2 \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(boolean var0, Context var1_2, String var2_3, ApplicationInfo var3_4, n9 var4_5) {
        if (var0) ** GOTO lbl-1000
        try {
            v0 = var1_2.createPackageContext(var2_3, 3);
        }
        catch (Exception v1) {
            return;
        }
lbl4:
        // 2 sources

        while (true) {
            var0_1 /* !! */  = v0;
            ** GOTO lbl18
            break;
        }
lbl-1000:
        // 1 sources

        {
            v2 = b6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
            v3 = var1_2;
            var0_1 /* !! */  = Integer.valueOf(0);
            v4 = new Object[2];
        }
        var1_2 = v4;
        {
            v4[0] = var3_4;
            v4[1] = var0_1 /* !! */ ;
            v0 = (Context)v2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)v3, var1_2);
            ** continue;
lbl18:
            // 1 sources

            var0_1 /* !! */  = b6.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(var0_1 /* !! */ );
            if (var0_1 /* !! */  != null) ** GOTO lbl-1000
            return;
        }
lbl-1000:
        // 1 sources

        {
            v5 = var4_5;
            v6 = v5;
            v7 = v5;
            v8 = var2_3;
            ** synchronized (var4_5)
        }
lbl-1000:
        // 1 sources

        {
            v6.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(v8.hashCode(), var0_1 /* !! */ );
            {
                catch (Throwable v9) {
                    throw v9;
                }
                // ** MonitorExit[v7] (shouldn't be in output)
                return;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403() {
        var0 = v0;
        try {
            b6.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new n9(0);
            var1_1 = b3.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
            var2_2 = r5.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403().iterator();
lbl6:
            // 2 sources

            while (true) {
                if (var2_2.hasNext() == false) return;
                var3_3 = (String)var2_2.next();
                var4_4 /* !! */  = r5.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
                break;
            }
        }
        catch (Exception v1) {
            return;
        }
        {
            var4_4 /* !! */ .getClass();
        }
        {
            var5_5 = r5.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988.containsKey(var3_3);
            var4_4 /* !! */  = var5_5 != false ? var4_4 /* !! */ .\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(var3_3, 0) : null;
        }
        {
            v2 = var5_5;
            v3 = var1_1;
        }
        {
            \u4f60\u771f\u662f\u5f31\u667a\u5f97\u6070\u5230\u597d\u5904\u6b63\u5982\u4f60\u9ed1\u4eba\u91ce\u7239\u64cd\u4f60\u5988\u7684\u65f6\u5019\u4f60\u5988\u9ad8\u6f6e\u53eb\u5f97\u97f3\u5f8b\u5341\u8db3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(boolean android.content.Context java.lang.String android.content.pm.ApplicationInfo top.bienvenido.date_24323.n9 ), ()V)((boolean)v2, (Context)v3, (String)var3_3, (ApplicationInfo)var4_4 /* !! */ , (n9)var0));
            ** continue;
        }
    }

    static {
        q2 q22;
        \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new n9(0);
        Method method = Context.class.getDeclaredMethod("createApplicationContext", ApplicationInfo.class, Integer.TYPE);
        method.setAccessible(true);
        u2 u22 = q22;
        try {
            q22 = new q2(method);
        }
        catch (Exception exception) {
            u22 = u2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
        }
        \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 = u22;
    }

    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070() {
        \u4f60\u771f\u662f\u5f31\u667a\u5f97\u6070\u5230\u597d\u5904\u6b63\u5982\u4f60\u9ed1\u4eba\u91ce\u7239\u64cd\u4f60\u5988\u7684\u65f6\u5019\u4f60\u5988\u9ad8\u6f6e\u53eb\u5f97\u97f3\u5f8b\u5341\u8db3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.execute(b6::\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a6 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Resources.Theme object, TypedValue typedValue) {
        Triple triple;
        a6 a62;
        Drawable drawable;
        Drawable drawable2;
        block10: {
            int n10;
            block9: {
                try {
                    if (!object.resolveAttribute(16844333, typedValue, true)) return null;
                    int n11 = typedValue.resourceId;
                    if (n11 == 0) {
                        return null;
                    }
                    drawable2 = object.getDrawable(n11);
                    if (drawable2 == null) {
                        return null;
                    }
                    if (object.resolveAttribute(16844335, typedValue, true) && (n10 = typedValue.resourceId) != 0) break block9;
                    drawable = null;
                    break block10;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            drawable = object.getDrawable(n10);
        }
        Integer n12 = object.resolveAttribute(16844332, typedValue, true) ? Integer.valueOf(typedValue.data) : null;
        object = (!\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a || !(drawable2 instanceof AdaptiveIconDrawable)) && object.resolveAttribute(16844336, typedValue, true) ? Integer.valueOf(typedValue.data) : null;
        a6 a63 = a62;
        a6 a64 = a62;
        typedValue = triple;
        triple = new Triple((Object)drawable, (Object)n12, object);
        a63(drawable2, (Triple)typedValue);
        return a64;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a6 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Context context) {
        TypedValue typedValue;
        block11: {
            int n10;
            TypedValue typedValue2;
            int n11;
            try {
                ActivityInfo activityInfo = x4.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(context.getPackageName());
                if (activityInfo == null) {
                    return null;
                }
                n11 = activityInfo.getThemeResource();
                if (n11 == 0) return null;
                context = context.getResources().newTheme();
            }
            catch (Exception exception) {
                return null;
            }
            context.applyStyle(n11, true);
            typedValue = typedValue2;
            typedValue2 = new TypedValue();
            if (!context.resolveAttribute(16842836, typedValue, true) || (n10 = typedValue.resourceId) == 0) break block11;
            int n12 = typedValue.type;
            if (n12 >= 28 && n12 <= 31) break block11;
            Drawable drawable = context.getDrawable(n10);
            if (drawable == null) break block11;
            return new a6(drawable, null);
        }
        if (!\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u8001\u5b50\u5b9e\u5728\u770b\u4e0d\u8fc7\u4f60\u5988\u7684\u8111\u6b8b\u72d7\u903c\u6837\u5b50\u76f4\u63a5\u628a\u4f60\u5988\u75285\u6bdb\u94b1\u5356\u5230\u57c3\u585e\u4fc4\u6bd4\u4e9a\u56fd\u5bb6\u5927\u5993\u9662\u8bf7\u90a3\u4e9b\u975e\u6d32\u90e8\u843d\u5c0f\u55bd\u5570\u6765\u4eab\u53d7\u4f60\u5988\u903c\u7684\u9ed1\u9634\u903c) return null;
        return b6.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Resources.Theme)context, typedValue);
    }
}

