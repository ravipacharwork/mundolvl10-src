package top.bienvenido.date_24323;

import android.R;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b6.class */
public abstract class b6 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static n9 f26 = new n9(0);

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final u2 f27;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m60() {
        try {
            n9 n9Var = new n9(0);
            f26 = n9Var;
            Context context = b3.f17;
            for (String str : r5.f290.mo299()) {
                r5 r5Var = r5.f290;
                r5Var.getClass();
                boolean zContainsKey = r5.f291.containsKey(str);
                ApplicationInfo applicationInfoMo266 = zContainsKey ? r5Var.mo266(str, 0) : null;
                ExecutorService executorService = AbstractC0030.f466;
                ApplicationInfo applicationInfo = applicationInfoMo266;
                AbstractC0030.f467.execute(() -> {
                    m59(r0, r1, r2, r3, r4);
                });
            }
        } catch (Exception unused) {
        }
    }

    static {
        u2 u2Var;
        q2 q2Var;
        try {
            Method declaredMethod = Context.class.getDeclaredMethod("createApplicationContext", ApplicationInfo.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            u2Var = q2Var;
            q2Var = new q2(declaredMethod);
        } catch (Exception unused) {
            u2Var = u2.f337;
        }
        f27 = u2Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static a6 m63(Resources.Theme theme, TypedValue typedValue) {
        Drawable drawable;
        try {
            if (!theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                return null;
            }
            int i = typedValue.resourceId;
            if (i == 0) {
                return null;
            }
            Drawable drawable2 = theme.getDrawable(i);
            if (drawable2 == null) {
                return null;
            }
            if (theme.resolveAttribute(R.attr.windowSplashScreenBrandingImage, typedValue, true)) {
                int i2 = typedValue.resourceId;
                if (i2 == 0) {
                    drawable = null;
                } else {
                    drawable = theme.getDrawable(i2);
                }
            } else {
                drawable = null;
            }
            return new a6(drawable2, new Triple(drawable, theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true) ? Integer.valueOf(typedValue.data) : null, (!(AbstractC0065x6082d607.f502xaa30c2c7 && (drawable2 instanceof AdaptiveIconDrawable)) && theme.resolveAttribute(R.attr.windowSplashScreenIconBackgroundColor, typedValue, true)) ? Integer.valueOf(typedValue.data) : null));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static a6 m64(Context context) {
        try {
            ActivityInfo activityInfoM559 = x4.m559(context.getPackageName());
            if (activityInfoM559 == null) {
                return null;
            }
            int themeResource = activityInfoM559.getThemeResource();
            if (themeResource == 0) {
                return null;
            }
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.applyStyle(themeResource, true);
            TypedValue typedValue = new TypedValue();
            if (themeNewTheme.resolveAttribute(R.attr.windowBackground, typedValue, true)) {
                int i = typedValue.resourceId;
                if (i != 0) {
                    int i2 = typedValue.type;
                    if (i2 < 28 || i2 > 31) {
                        Drawable drawable = themeNewTheme.getDrawable(i);
                        if (drawable != null) {
                            return new a6(drawable, null);
                        }
                    }
                }
            }
            if (AbstractC0065x6082d607.f5065) {
                return m63(themeNewTheme, typedValue);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m62() {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(b6::m60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m59(boolean z, Context context, String str, ApplicationInfo applicationInfo, n9 n9Var) {
        Context contextCreatePackageContext;
        try {
            if (!z) {
                contextCreatePackageContext = context.createPackageContext(str, 3);
            } else {
                u2 u2Var = f27;
                Object[] objArr = new Object[2];
                objArr[0] = applicationInfo;
                objArr[1] = 0;
                contextCreatePackageContext = (Context) u2Var.mo432((Object) context, objArr);
            }
            a6 a6VarM64 = m64(contextCreatePackageContext);
            if (a6VarM64 == null) {
                return;
            }
            synchronized (n9Var) {
                try {
                    n9Var.m386(str.hashCode(), a6VarM64);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw n9Var;
                }
            }
        } catch (Exception unused) {
        }
    }
}
