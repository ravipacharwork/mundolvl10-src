package top.bienvenido.date_24323;

import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.media.AudioManager;
import com.android.internal.net.VpnConfig;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你在这叭叭啥呢集众给你吗凑棺材钱, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你在这叭叭啥呢集众给你吗凑棺材钱.class */
public final class C0009 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final C0009 f449 = new C0009();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        Object objMo393;
        u2 s2Var;
        r2 r2Var;
        u2 s2Var2;
        r2 r2Var2;
        s4 s4Var = u4.f3475;
        this.f485 = s4Var;
        b9.m71("appwidget", s4Var, null);
        this.f485 = u4.f341;
        m658("usb", "consumer_ir", "telecom", "lock_settings", "backup", "print", "launcherapps", "imms", "restrictions", "isms", "search", "media_router", "statusbar", "accessibility");
        d1 d1VarM71 = b9.m71("alarm", this.f485, null);
        if (d1VarM71 != null) {
            d1VarM71.f54.m386(113762, u4.f348);
        }
        d1 d1VarM72 = b9.m71("audio", this.f485, null);
        if (d1VarM72 != null) {
            Object obj = d1VarM72.f57;
            try {
                Field declaredField = AudioManager.class.getDeclaredField("sService");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                    s2Var2 = new s2(ca.f51.objectFieldOffset(declaredField));
                } else {
                    s2Var2 = r2Var2;
                    r2Var2 = new r2(declaredField);
                }
            } catch (Exception unused) {
                s2Var2 = u2.f337;
            }
            s2Var2.mo394((Object) null, obj);
        }
        n9 n9Var = b9.f29;
        d1 d1VarM73 = b9.m71("autofill", this.f485, null);
        if (d1VarM73 != null) {
            d1VarM73.m118(new int[]{1850541012, -860784333, -464872500}, s4Var);
        }
        d1 d1VarM74 = b9.m71("media.camera", this.f485, null);
        if (d1VarM74 != null) {
            d1VarM74.f54.m386(-1581470752, new C0042());
        }
        d1 d1VarM75 = b9.m71("connectivity", this.f485, null);
        if (d1VarM75 != null) {
            if (!AbstractC0065x6082d607.f505) {
                try {
                    d1VarM75.f54.m386(-1710356229, new z4(VpnConfig.class, new ga(ha.f157), "top.bienvenido.mundo.manifest.MundoService$Companion$STUB"));
                } catch (Throwable unused2) {
                }
            }
            d1VarM75.f54.m386(-713968189, new C0045());
            if (AbstractC0065x6082d607.f499) {
                d1VarM75.f54.m386(1483925501, new C0080());
            }
        }
        n9 n9Var2 = b9.f29;
        d1 d1VarM76 = b9.m71("device_policy", this.f485, null);
        if (d1VarM76 != null) {
            d1VarM76.f54.m386(952007670, new t4(new ComponentName(b3.f18, "main")));
            d1VarM76.m118(new int[]{-1597971470, 613161899}, u4.f346);
        }
        d1 d1VarM77 = b9.m71("location", this.f485, null);
        if (d1VarM77 != null) {
            try {
                if (AbstractC0065x6082d607.f509dj) {
                    d1VarM77.f54.m386(-1235628164, new z4(Class.forName("android.location.provider.ReverseGeocodeRequest"), new y4(new p2("mCallingPackage"))));
                    d1VarM77.f54.m386(-1789232583, new z4(Class.forName("android.location.provider.ForwardGeocodeRequest"), new y4(new p2("mCallingPackage"))));
                } else {
                    int[] iArr = new int[2];
                    iArr[0] = 1102537717;
                    iArr[1] = 250564640;
                    d1VarM77.m118(iArr, new z4(Class.forName("android.location.GeocoderParams"), new y4(new p2("mPackageName"))));
                }
            } catch (Exception unused3) {
            }
        }
        n9 n9Var3 = b9.f29;
        d1 d1VarM78 = b9.m71("wallpaper", this.f485, null);
        if (d1VarM78 != null) {
            try {
                Field declaredField2 = WallpaperManager.class.getDeclaredField("sGlobals");
                declaredField2.setAccessible(true);
                if ((declaredField2.getModifiers() & 8) == 0 && !declaredField2.getType().isPrimitive()) {
                    s2Var = new s2(ca.f51.objectFieldOffset(declaredField2));
                } else {
                    s2Var = r2Var;
                    r2Var = new r2(declaredField2);
                }
            } catch (Exception unused4) {
                s2Var = u2.f337;
            }
            Object objMo394 = s2Var.mo393(null);
            if (objMo394 != null) {
                new p2("mService").f270.mo394(objMo394, d1VarM78.f57);
            }
        }
        n9 n9Var4 = b9.f29;
        d1 d1VarM79 = b9.m71("uimode", this.f485, null);
        if (d1VarM79 != null) {
            if (AbstractC0065x6082d607.f508 && (objMo393 = t2.m483(UiModeManager.class, "sGlobals").mo393(null)) != null) {
                t2.m483(objMo393.getClass(), "mService").mo394(objMo393, d1VarM79.f57);
            }
            t4 t4Var = u4.f346;
            d1VarM79.f54.m386(-1390053479, t4Var);
            d1VarM79.f54.m386(1392133613, t4Var);
        }
    }
}
